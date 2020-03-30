package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.Board;
import dao.board.BoardDao;
import service.CommandProcess;

public class BoardUpdateFormAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("BoardUpdateFormAction!!");
		
		try {
			int bNo = Integer.parseInt(request.getParameter("bNo"));
			String pageNum = request.getParameter("pageNum");
			
			BoardDao boardDao = BoardDao.getInstance();
			Board board = boardDao.select(bNo);
			
			request.setAttribute("bNo", bNo);
			request.setAttribute("board", board);
			
		} catch (Exception e) {
			e.printStackTrace();
		} return "board/boardUpdateForm.jsp";
	}
}