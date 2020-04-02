package service.board;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.Board;
import dao.board.BoardDao;
import dao.board.LikeDao;
import dao.board.Reply;
import dao.board.ReplyDao;
import service.CommandProcess;

public class BoardContentAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			int bNo = Integer.parseInt(request.getParameter("bNo"));
			int mNo = Integer.parseInt(request.getParameter("mNo"));
			String pageNum = request.getParameter("pageNum");
			BoardDao boardDao = BoardDao.getInstance();
			boardDao.hits(bNo);
			Board board = boardDao.select(bNo);
			
			LikeDao likeDao = LikeDao.getInstance();
			int isLike = likeDao.count(bNo, mNo);
			
			ReplyDao replyDao = ReplyDao.getInstance();
			List<Reply> replyList = replyDao.select(bNo);
			
			request.setAttribute("replyList", replyList);
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
