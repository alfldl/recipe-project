<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>BoardList</title>

<%@ include file="../header.jsp" %>



<div id=gongback1></div>
<div id=gongback1></div>
<style type="text/css"> 
table {
	width: 80%;
	
}

.button {
  background-color: #808080;
  border: none;
  color: white;
  padding: 10px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  float: right;
  cursor: pointer;
  border-radius: 10px; 
  margin-bottom: 25px; 
  
}

</style>

<div>
	<h2 >자유게시판</h2>
<hr>

	<table>
		<tr>
			<th>NO.</th><th>제목</th><th>작성자</th>
			<th>작성일</th><th>조회수</th><th>좋아요♥</th>
		</tr>
	</table>

	
		<a href="boardWriteForm.do" class="button">글쓰기</a>
		
	
	
</div>


<%@ include file="../footer.jsp" %>
</html>