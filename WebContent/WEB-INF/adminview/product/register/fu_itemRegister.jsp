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
<h3>adminview/product/register/fu_itemRegister.jsp</h3>

<form action="/bankJSPProject/product/fu_itemRegister.admin" method="post">
가입대상 코드 : 
		<select name="st_type_no">
			<option value="ST1000">1~18세</option>
			<option value="ST1001">19~30세</option>
			<option value="ST1002">30~50세</option>
			<option value="ST1003">50~80세</option>
			<option value="ST1004">전 연령</option>
		</select>
		 <br>
위험등급 코드
		<select name="r_rate_no">
			<option value="RR1000">안정</option>
			<option value="RR1001">윈험</option>
		</select>
		 <br>
펀드 타입
		<select name="fi_type_no">
			<option value="FI1000">mmf</option>
		</select>
		 <br>
펀드 상품 설명(이름 대체 임시) : <input name="fund_item_comment" value="펀드상품 3" >  <br>
예상수익률 : <input name="fund_item_profitrate" value="4.5" > <br>
	<button type="submit">상품만들기</button>
</form>
<script>
$(function(){});
</script>
</body>
</html>