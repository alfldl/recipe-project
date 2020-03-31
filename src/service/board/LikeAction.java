package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.Board;
import dao.board.BoardDao;
import dao.board.LikeDao;
import service.CommandProcess;

public class LikeAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("LikeAction start..");
		
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		int mNo = Integer.parseInt(request.getParameter("mNo"));
		String  pageNum = request.getParameter("pageNum"); 
		
		try {
			BoardDao boardDao = BoardDao.getInstance();
			Board board = boardDao.select(bNo);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "";
	}

}
