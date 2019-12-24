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
<h3>adminview/product/signdetail/si_signSearchDetail.jsp</h3>
<c:if test="${empty ss_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty ss_signSearchDetail }">
		적금 상품가입코드 : ${ss_signSearchDetail.si_sign_no }
		만기일 : ${ss_signSearchDetail.saving_sign_detail_enddate }
		1회적립금 : ${ss_signSearchDetail.reserve_price }
		세금우대적립목표금액 : ${ss_signSearchDetail.tax_incentive_price }
		
		<br>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>