package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.BoardDao;
import service.CommandProcess;

public class BoardDeleteProAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		String pageNum = request.getParameter("pageNum");
		
		try {
			
			BoardDao boardDao = BoardDao.getInstance();
			int result = boardDao.delete(bNo);
			
			request.setAttribute("result", result);
			request.setAttribute("pageNum", pageNum);
			
			if (result > 0) {
				return "redirect:boardList.do?pageNum=" + pageNum + "&delete=true";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:boardContent.do?pageNum=" + pageNum + "&bNo=" + bNo + "&delete=false";
	}
}
