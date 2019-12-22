<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>adminview/user/allUser.jsp</h3>

<c:if test="${empty userList }">
	<h4>회원이 없습니다.</h4>
</c:if>
<c:if test="${not empty userList }">
	<c:forEach items="${userList }" var="dto">
		회원코드 : ${dto.u_info_no } <br>
		이름 : ${dto.user_name } <br>
		아이디 : ${dto.user_id } <br>
		핸드폰 : ${dto.user_phone } <br>
		<br>
	</c:forEach>
</c:if>

<script>
$(function(){});
</script>
</body>
</html>