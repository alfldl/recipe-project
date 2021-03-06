package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.Board;
import dao.board.BoardDao;
import dao.board.LikeDao;
import service.CommandProcess;

public class BoardContentAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			int bNo = Integer.parseInt(request.getParameter("bNo"));
			int mNo = Integer.parseInt(request.getParameter("mNo"));
			System.out.println("mNo="+ mNo);
			String pageNum = request.getParameter("pageNum");
			BoardDao boardDao = BoardDao.getInstance();
			boardDao.hits(bNo);
			Board board = boardDao.select(bNo);
			
			LikeDao likeDao = LikeDao.getInstance();
			int isLike = likeDao.count(bNo, mNo);
			
			request.setAttribute("isLike", isLike);
			request.setAttribute("mNo", mNo);
			request.setAttribute("bNo", bNo);
			request.setAttribute("pageNum", pageNum);
			request.setAttribute("board", board);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/boardContent.jsp";
	}
}
