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
<h3>adminview/product/signsearch/y_signSearch.jsp</h3>
<c:if test="${empty y_signList }">
	<h4>상품이 없습니다.</h4>
</c:if>
<c:if test="${not empty y_signList }">
	<c:forEach items="${y_signList }" var="dto">
		상품가입코드 : ${dto.yegeum_no } <br>
		회원코드 : ${dto.u_info_no } <br>
		계좌코드 : ${dto.account_no } <br>
		예금상품코드 : ${dto.y_item_no } <br>
		상품유형코드 : ${dto.i_type_no } <br>
		상품상태코드 : ${dto.ps_type_no } <br>
		비과세선택코드 : ${dto.t_type_no } <br>
		만기시해지방법코드 : ${dto.et_type_no } <br>
		직원코드 : ${dto.employee_no } <br>
		스마트징검다리 : ${dto.sb_type_no } <br>
		sns만기알림 : ${dto.ses_type_no } <br>
		이자지금방법 : ${dto.interest_pay_method } <br>
		<form action="/bankJSPProject/product/y_signSearch.admin" method="post">
			<input type="hidden" name="yegeum_no" value="${dto.yegeum_no }">
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