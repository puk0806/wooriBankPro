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
<h3>adminview/product/register/s_itemRegister.jsp</h3>
<form action="/bankJSPProject/product/s_itemRegister.admin" method="post">
	가입대상 코드 : 
		<select name="st_type_no">
			<option value="ST1000">1~18세</option>
			<option value="ST1001">19~30세</option>
			<option value="ST1002">30~50세</option>
			<option value="ST1003">50~80세</option>
			<option value="ST1004">전 연령</option>
		</select>
		 <br>
	상품명 : <input name="saving_item_name" value="적금상품3" > <br>
	가입최대금액 : <input name="saving_item_maxmoney" value="3000000" > <br>
	만기 금리 : <input name="saving_item_endrate" value="4" > <br>
	중도해지금리 : <input name="saving_item_cancelrate" value="2.5" > <br>
	적금 기간 : <input name="savings_item_length" value="6,12,24" > <br>
	상품 설명 : <input name="savings_item_comment" value="적금상품3" > <br>
	<button type="submit">상품 등록</button>
</form>
<script>
$(function(){});
</script>
</body>
</html>