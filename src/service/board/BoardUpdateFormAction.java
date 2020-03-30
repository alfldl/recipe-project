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
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		int mNo = Integer.parseInt(request.getParameter("mNo"));
		String pageNum = request.getParameter("pageNum");
		
		try {
			BoardDao boardDao = BoardDao.getInstance();
			Board board = boardDao.select(bNo);
			
			request.setAttribute("bNo", bNo);
	//	    HttpSession session = request.getSession();
	//		session.getAttribute("member");
			request.setAttribute("mNo", mNo);
			request.setAttribute("pageNum", pageNum);
			request.setAttribute("board", board);
			
		} catch (Exception e) {
			e.printStackTrace();
		} return "board/boardUpdateForm.jsp";
	}
}