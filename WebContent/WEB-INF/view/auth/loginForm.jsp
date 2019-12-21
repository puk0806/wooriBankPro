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
<div style="margin: 0 auto;width:800px">
	<form action="/bankJSPProject/auth/login.do" method="post">
	<p>
		아이디:<br/><input type="text" name="user_id" value="admin">
	</p>
	<p>
		암호:<br/><input type="user_pwd" name="user_pwd" value="1234">
	</p>
	<input type="submit" value="로그인">
	</form>
</div>

<script>
   $(document).ready(function (){	  
   });
</script>
</body>
</html>