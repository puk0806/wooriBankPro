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
<h3>adminview/product/signdetail/foi_signSearchDetail.jsp</h3>
<c:if test="${empty is_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty is_signSearchDetail }">
		보험 상품가입코드 : ${is_signSearchDetail.ii_sign_no }
		계좌 : ${is_signSearchDetail.account_no }
		보험원금 : ${is_signSearchDetail.insurance_principal }
		보험 납입액 : ${is_signSearchDetail.insurance_payment }
		<br>
</c:if>

<script>
$(function(){});
</script>
</body>
</html>