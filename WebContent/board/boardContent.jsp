<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<title>BoardContent</title>

<%@ include file="../header.jsp" %>
<div id=gongback1></div>
<div id=gongback1></div>

<div id="board">
	<div>${board.title } 
		<div style="float: right">${board.bDate }</div>
	</div>
<hr>	
	<section>
		<article>
			${board.content }
		</article>
	</section>
		<button onclick="location.href='boardUpdateForm.do?bNo=${board.bNo}&pageNum=${pageNum}'">
		           수정
		 </button>           
		<button onclick="location.href='boardDeleteForm.do?bNo=${board.bNo}&pageNum=${pageNum}'">
		            삭제
		</button>
	<div>
		<div>${board.writer }</div>
	</div>
	<div>
		<textarea style="resize: none; width: 800px; height: 90px;"></textarea>
		<button>등록</button>
	</div>
		<button onclick="location.href='boardList.do?pageNum=${pageNum}'">
		목록
		</button>



</div> <!--board end  -->

<%@ include file="../footer.jsp" %>
