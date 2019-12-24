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
<h3>adminview/product/signsearch/li_signSearch.jsp</h3>
<c:if test="${empty li_signList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty li_signList }">
	<c:forEach items="${li_signList }" var="dto">
		대출상품가입코드 : ${dto.li_sign_no } <br>
		대출상품코드 : ${dto.l_item_no } <br>
		회원코드 : ${dto.u_info_no } <br>
		계좌코드 : ${dto.account_no } <br>
		상품상태코드 : ${dto.ps_type_no } <br>
		대출금액 : ${dto.loan_item_sign_money } <br>
		<form action="/bankJSPProject/product/li_signSearch.admin" method="post">
			<input type="hidden" name="li_sign_no" value="${dto.li_sign_no }">
			<button type="submit">자세히 보기</button>
		</form>
		
		<br>
	</c:forEach>
</c:if>

<script>
$(function(){});
</script>
</body>
</html>