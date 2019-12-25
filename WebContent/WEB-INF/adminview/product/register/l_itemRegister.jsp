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
<h3>adminview/product/register/l_itemRegister.jsp</h3>
<form action="/bankJSPProject/product/l_itemRegister.admin" method="post">
	대출종류코드 : 
		<select name="li_type_no">
			<option value="LT1000">예금담보대출</option>
			<option value="LT1001">신용대출</option>
			<option value="LT1002">부동산대출</option>
			<option value="LT1003">우리사주대출</option>
			<option value="LT1004">근로자대출</option>
		</select>
		 <br>
	
	상품설명(임시 상품명대체) : <input name="loan_item_comment" value="대출 상품 3" > <br>
	대출 기간 : <input name="loan_item_length" value="12,24,36" > <br>
	대출 한도 : <input name="loan_item_limitmoney" value="200000000" > <br>
	<button type="submit">상품 만들기</button>
</form>
<script>
$(function(){});
</script>
</body>
</html>