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
<h3>adminview/product/signsearch/foi_signSearch.jsp</h3>
<c:if test="${empty foi_signList }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty foi_signList }">
	<c:forEach items="${foi_signList }" var="dto">
		외화가입코드 : ${dto.foi_sign_no }
		회원코드 : ${dto.u_info_no } <br>
		계좌코드 : ${dto.account_no } <br>
		외화상품코드 : ${dto.fo_item_no } <br>
		상품유형코드 : ${dto.i_type_no } <br>
		상품상태코드 : ${dto.ps_type_no } <br>
		통화코드 : ${dto.currency_no } <br>
		<form action="/bankJSPProject/product/foi_signSearch.admin" method="post">
			<input type="hidden" name="foi_sign_no" value="${dto.foi_sign_no }">
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