<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>BoardList</title>

<%@ include file="../header.jsp" %>

<link rel="stylesheet" href="css/boardList.css" type="text/css" >

<div id=gongback1></div>
<style type="text/css"> 
table {
	width: 100%;
}
</style>

<hr>
	<h2>자유게시판</h2>
<hr>

	<table>
		<tr>
			<th>NO.</th><th>제목</th><th>작성자</th>
			<th>작성일</th><th>조회수</th><th>좋아요♥</th>
		</tr>
	</table>

	<table>
		<tr><td><a href="boardWriteForm.do">글쓰기</a></td></tr>
	</table>
	
	<td>${board.mNo } </td>
	
	
	
<hr>

<%@ include file="../footer.jsp" %>
</html>