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
<h3>관리자 메인</h3>

<div>
	<ol>
	   <li><a href="/bankJSPProject/usermenu.admin">유저(전유저조회,특정유저조회)</a></li>
	   <li><a href="/bankJSPProject/account.admin">계좌(모든계좌,계좌검색,회원계좌검색,계좌해지)</a></li>
	   <li><a href="#">상품(7개분류후-상품조회,상품등록,상품해지)</a></li>
	</ol>
</div>

<script>
$(function(){});
</script>
</body>
</html>