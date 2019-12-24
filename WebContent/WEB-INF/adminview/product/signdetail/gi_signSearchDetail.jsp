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
<h3>adminview/product/signdetail/ii_signSearchDetail.jsp</h3>
<c:if test="${empty gs_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty gs_signSearchDetail }">
		골드 상품가입코드 : ${gs_signSearchDetail.gi_sign_no }
		골드 시세코드 : ${gs_signSearchDetail.g_price_no }
		계좌 : ${gs_signSearchDetail.account_no }
		골드 거래량 : ${gs_signSearchDetail.gold_traderate }
		잔여 골드 : ${gs_signSearchDetail.gold_extra }
		
		<br>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>