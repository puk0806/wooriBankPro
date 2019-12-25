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
<h3>adminview/product/register/fo_itemRegister.jsp</h3>

<form action="/bankJSPProject/product/fo_itemRegister.admin" method="post">
	상품명 : <input name="foreign_item_name" value="외화상품3" >	<br>
	가입금액 : <input name="foreign_item_sign_money" value="300" > <br>	
	상품설명: <input name="foreign_item_comment" value="외화상품 설명3" > <br>	
	만기기간 : <input name="foreign_item_endday" value="12" > <br>	
	<button type="submit">상품등록</button>
</form>


<script>
$(function(){});
</script>
</body>
</html>