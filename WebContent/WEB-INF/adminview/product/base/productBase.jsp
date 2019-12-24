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
<h3>adminview/product/productBase.jsp</h3>

<div style="margin: 0 auto;width:800px">
	<form action="/bankJSPProject/product.admin" method="post">
	<p>
		통장 종류 : 
		<select name="account_type_name">
			<option value="y_item">예금상품</option>
			<option value="s_item">적금상품</option>
			<option value="l_item">대출상품</option>
			<option value="fo_item">외화상품</option>
			<option value="fu_item">펀드상품</option>
			<option value="g_item">골드상품</option>
			<option value="i_item">보험상품</option>
		</select>
	</p>
	<input type="submit" value="검색">
	</form>
</div>




<script>
$(function(){});
</script>
</body>
</html>