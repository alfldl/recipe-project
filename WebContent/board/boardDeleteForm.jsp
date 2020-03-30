<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>BoardDelete</title>

<%@ include file="../header.jsp" %>
<script>
var delete = "${param.delete}"
if (delete == "true") {
	alert("삭제완료!");
} else {
	alert("비밀번호 오류");
}
</script>

<div id=gongback1></div>
<div id=gongback1></div>
<div id="board">

	<h2>비밀번호를 입력하세요</h2>
	<form action="boardDeletePro.do">
		<input type="hidden" name="pageNum" value="${pageNum }">
		<input type="hidden" name="bNo" value="${bNo }">
		비밀번호: <input type="text" name="pw"><p>
		<input type="submit" value="확인">
	</form>

</div>

<%@ include file="../footer.jsp" %>