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
<h3>adminview/product/register/i_itemRegister.jsp</h3>


<form action="/bankJSPProject/product/i_itemRegister.admin" method="post">
보험사 : 
		<select name="i_company_no">
			<option value="IC1000">한화생명</option>
			<option value="IC1001">삼성생명</option>
		</select>
		 <br>
	상품명: <input name="insurance_item_name" value="보험 상품 3" > <br>
	상품설명 : <input name="insurance_item_commnet" value="보험설명 3" > <br>
	보험기간 : <input name="insurance_item_length" value="12" > <br>
	
	<button type="submit">상품만들기</button>
</form>
<script>
$(function(){});
</script>
</body>
</html>