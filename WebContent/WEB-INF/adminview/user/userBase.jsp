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
<h3>adminview/user/base.jsp</h3>

<a href="/bankJSPProject/usermenu/userSearch.admin">모든 유저 보기</a> <br>

<div style="margin: 0 auto;width:800px">
	<form action="/bankJSPProject/usermenu/userSearch.admin" method="post">
	<p>
		이름 :<br/><input type="text" name="user_name" value="박상만">
	</p>
	<p>
		주민번호 :<br/><input type="password" name="user_rrn" value="9406111234567">
	</p>
	<input type="submit" value="로그인">
	</form>
</div>



<script>
$(function(){});
</script>
</body>
</html>