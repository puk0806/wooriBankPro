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
<h3>/adminview/account/accountNumberSearch.jsp</h3>
<div style="margin: 0 auto;width:800px">
	<form action="/bankJSPProject/account/accountNumberSearch.admin" method="post">
	<p>
		계좌번호 :<br/><input type="text" name="account_number" value="1002950791009">
	</p>
	<input type="submit" value="검색">
	</form>
</div>
<br>

<c:if test="${empty accountDto }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty accountDto }">
	계좌코드 : ${accountDto.account_no } <br>
	회원코드 : ${accountDto.u_info_no } <br>
	지점코드 : ${accountDto.l_bank_no } <br>
	계좌상태코드 : ${accountDto.a_state_no } <br>
	<br>
</c:if>





<script>
$(function(){});
</script>
</body>
</html>