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
<h3>adminview/product/signdetail/li_signSearchDetail.jsp</h3>
<c:if test="${empty ls_signSearchDetail }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty ls_signSearchDetail }">
		대출 상품가입코드 : ${ls_signSearchDetail.li_sign_no }
		계좌코드 : ${ls_signSearchDetail.account_no }
		지점코드 : ${ls_signSearchDetail.l_bank_no }
		<br>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>