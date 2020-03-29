package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Board;
import dao.BoardDao;
import service.CommandProcess;

public class BoardContentAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			int bNo = Integer.parseInt(request.getParameter("bNo"));
			String pageNum = request.getParameter("pageNum");
			BoardDao boardDao = BoardDao.getInstance();
			boardDao.hits(bNo);
			Board board = boardDao.select(bNo);
			
			request.setAttribute("bNo", bNo);
			request.setAttribute("pageNum", pageNum);
			request.setAttribute("board", board);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "board/boardContent.jsp";
	}
}
