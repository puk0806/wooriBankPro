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
<h3>adminview/product/signsearch/ii_signSearch.jsp</h3>
<c:if test="${empty ii_signListh }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty ii_signList }">
	<c:forEach items="${ii_signList }" var="dto">
		보험상품가입코드 : ${dto.ii_sign_no } <br>
		회원코드 : ${dto.u_info_no } <br>
		계좌코드 : ${dto.account_no } <br>
		보험상품코드 : ${dto.i_item_no } <br>
		상품상태코드 : ${dto.i_type_no } <br>
		상품상태코드 : ${dto.ps_type_no } <br>
		증권번호 : ${dto.stock_number } <br>
		계약일자 : ${dto.insurence_sign_date } <br>
		계약기간 : ${dto.insurance_length } <br>
		납입주기 : ${dto.insurance_cycle } <br>
		<form action="/bankJSPProject/product/ii_signSearch.admin" method="post">
			<input type="hidden" name="ii_sign_no" value="${dto.ii_sign_no }">
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