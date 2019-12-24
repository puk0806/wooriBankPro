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
<c:if test="${empty fos_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty fos_signSearchDetail }">
		펀드 상품가입코드 : ${fos_signSearchDetail.fos_sign_no }
		계좌 : ${fos_signSearchDetail.account_no }
		지점 : ${fos_signSearchDetail.l_bank_no }
	금일기준금액: ${fos_signSearchDetail.currency_no }
		잔고좌수 : ${fos_signSearchDetail.current_money }
		<br>
</c:if>

<script>
$(function(){});
</script>
</body>
</html>