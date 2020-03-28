<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Board</title>

<%@ include file="../header.jsp" %>

<div id=gongback1></div>
<div id=gongback1></div>

<div id="board">
<form action="boardWritePro.do" method="post">
	<table>
		<caption>
			<h2>게시판 글쓰기</h2>
		</caption>
		
		<tr>
			<td>		
				<input type="text" name="title" required="required" placeholder="게시글 제목을 입력해주세요" 
					size="110">
			</td>
		</tr>		
		
		<tr>
			<td><textarea rows="20" cols="100" name="content"
					required="required" placeholder="내용을 입력하세요"></textarea>
			</td>
		</tr>		
				
		<tr>
			<td>
				<input type="submit" value="확인">
				<input type="reset" value="다시작성">
			</td>
		</tr>	
			
		</table>		
	</form>
	</div>
	
	<%@ include file="../footer.jsp" %>