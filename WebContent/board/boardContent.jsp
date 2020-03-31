<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<title>BoardContent</title>

<%@ include file="../header.jsp" %>
<script>
var isDelete = "${param.delete}"
if (isDelete == "false") {
	alert("잘못된 요청입니다.");
}
</script>

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
		<button onclick="location.href='boardUpdateForm.do?bNo=${board.bNo}&pageNum=${pageNum}&mNo=${board.mNo}'">
		           수정
		 </button>           
		<button onclick="location.href='boardDeletePro.do?bNo=${board.bNo}&pageNum=${pageNum}&mNo=${board.mNo }'">
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
