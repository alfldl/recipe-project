<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>Board</title>

<%@ include file="../header.jsp" %>

<div id=gongback1></div>
<div id=gongback1></div>

<div id="wrap">
<form action="boardWritePro.do" method="post">
	<table>
			<caption>
				<h2>게시판 글쓰기</h2>
			</caption>
			<tr>
				<td>제목</td>
				<td><input type="text" name="title" required="required"></td>
				</tr>
			<tr>
				<td>작성자</td>
				<td><input type="text" name="writer" required="required"></td>
			</tr>
			<tr>
				<td>이메일</td>
				<td><input type="email" name="email" required="required"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="30" name="content"
						required="required"></textarea></td>
			</tr>
			<tr>
				<td>암호</td>
				<td><input type="password" name="passwd" required="required"></td>
			</tr>
			<tr>
				<td><input type="submit" value="확인"></td>
				<td><input type="reset" value="다시작성"></td>
			</tr>
		</table>
	</form>
	</div>
	
	<%@ include file="../footer.jsp" %>