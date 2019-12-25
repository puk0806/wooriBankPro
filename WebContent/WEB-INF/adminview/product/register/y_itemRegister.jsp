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
<h3>adminview/product/register/y_itemRegister.jsp</h3>
<form action="/bankJSPProject/product/y_itemRegister.admin" method="post">
	상품명 : <input name="yegeum_item_name" value="예금상품3" > <br>
	예금기간 : <input name="yegeum_item_length" value="6,12" > <br>
	가입제한금액 : <input name="yegeum_item_limitmoney" value="10000000" > <br>
	금리 : <input name="yegeum_item_interestrate" value="3.5" > <br>
	상품 설명 : <input name="yegeum_item_comment" value="내용 설명" > <br>
	<button type="submit">상품등록</button>
</form>
<script>
$(function(){});
</script>
</body>
</html>