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
<h3>adminview/product/signdetail/yi_signSearchDetail.jsp</h3>
<c:if test="${empty yt_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty yt_signSearchDetail }">
		예금 상품가입코드 : ${yt_signSearchDetail.yegeum_no }
		계좌 코드 : ${yt_signSearchDetail.account_no }
		만기일 : ${yt_signSearchDetail.yegeum_item_endday }
		거래금액 : ${yt_signSearchDetail.yegeum_tiem_transmoney }
		<br>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>