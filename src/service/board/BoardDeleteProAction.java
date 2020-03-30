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
		
		try {
			int bNo = Integer.parseInt(request.getParameter("bNo"));
			String pw = request.getParameter("pw");
			String pageNum = request.getParameter("pageNum");
			
			BoardDao boardDao = BoardDao.getInstance();
			int result = boardDao.delete(bNo, pw);
			
			request.setAttribute("result", result);
			request.setAttribute("pageNum", pageNum);
			request.setAttribute("bNo", bNo);
			
			if (result > 0) {
				return "redirect:boardList.do?pageNum=${pageNum}" + "&delete=true";
			}
			return "redirect:boardDeleteForm.do?num=${num}&pageNum=&{pageNum)";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
