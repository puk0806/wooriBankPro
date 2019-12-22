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
<h3>adminview/user/UserInfo.jsp</h3>

<c:if test="${empty userDto }">
	<h4>회원이 없습니다.</h4>
</c:if>
<c:if test="${not empty userDto }">
	회원코드 : ${userDto.u_info_no } <br>
	이름 : ${userDto.user_name } <br>
	아이디 : ${userDto.user_id } <br>
	핸드폰 : ${userDto.user_phone } <br>
	<br>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>