package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.Board;
import dao.board.BoardDao;
import service.CommandProcess;

public class BoardWriteProAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BoardWriteProAction");
		request.setCharacterEncoding("utf-8");
		String pageNum = request.getParameter("pageNum");
		Board board = new Board();
		board.setbNo(Integer.parseInt(request.getParameter("bNo")));
		board.setmNo(Integer.parseInt(request.getParameter("mNo")));
		board.setTitle(request.getParameter("title"));
		board.setContent(request.getParameter("content"));
		
		try {
			BoardDao boardDao = BoardDao.getInstance();
			int result = boardDao.insert(board);
			if (result > 0) {
				return "redirect:boardList.do";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:boardWriteForm.do?pageNum=" + pageNum + "&error=true";
	}
}
