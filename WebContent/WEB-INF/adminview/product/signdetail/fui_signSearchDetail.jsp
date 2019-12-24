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
<h3>adminview/product/signdetail/fui_signSearchDetail.jsp</h3>
<c:if test="${empty fus_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty fus_signSearchDetail }">
		 펀드상품가입코드 : ${fus_signSearchDetail.fui_sign_no }
		 계쫘코드 : ${fus_signSearchDetail.account_no }
		 지점코드 : ${fus_signSearchDetail.l_bank_no }
		 가입금액 : ${fus_signSearchDetail.fund_item_sign_money }
		 잔고좌수 : ${fus_signSearchDetail.account_balance }
		<br>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>