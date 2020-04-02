package service.board;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.ReplyDao;
import service.CommandProcess;

public class ReplyDeleteAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		int mNo = Integer.parseInt(request.getParameter("mNo"));
		int brNo = Integer.parseInt(request.getParameter("brNo"));
		String pageNum = request.getParameter("pageNum");
		
		System.out.println(brNo);
		ReplyDao replyDao = ReplyDao.getInstance();
		int result = 0;
		
		try {
			result = replyDao.delete(brNo);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		request.setAttribute("result", result);
		request.setAttribute("bNo", bNo);
		request.setAttribute("brNo", brNo);
		request.setAttribute("mNo", mNo);
		request.setAttribute("pageNum", pageNum);
		
		return "redirect:boardContent.do?pageNum="+ pageNum +"&bNo=" + bNo + "&mNo=" + mNo;
		 
	}
}
