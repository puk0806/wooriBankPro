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
<h3>adminview/product/register/g_itemRegister.jsp</h3>

<form action="/bankJSPProject/product/g_itemRegister.admin" method="post">
	상품명: <input name="g_item_name" value="골드 상품 3" > <br>
	상품 설명: <input name="gold_item_comment" value="골드 상품 설명 3" > <br>
	거래 단위: <input name="gold_item_transunit" value="0.1" > <br>
	<button type="submit">상품만들기</button>
</form>
<script>
$(function(){});
</script>
</body>
</html>