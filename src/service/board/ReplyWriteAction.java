package service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.board.Reply;
import dao.board.ReplyDao;
import service.CommandProcess;

public class ReplyWriteAction implements CommandProcess {

	@Override
	public String requestPro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		String pageNum = request.getParameter("pageNum");
		int bNo = Integer.parseInt(request.getParameter("bNo"));
		String content = request.getParameter("content");
		
		try {
			ReplyDao replyDao = ReplyDao.getInstance();
			Reply reply = new Reply();
			reply.setbNo(bNo);
			reply.setmNo(3);
			reply.setContent(content);
			replyDao.insert(reply);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:boardContent.do?pageNum="+ pageNum + "&bNo=" + bNo + "&mNo=3";
	}

}
