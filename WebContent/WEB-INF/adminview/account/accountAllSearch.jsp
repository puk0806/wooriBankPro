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
<h3>accountAllSearch.jsp</h3>

<c:if test="${empty accountList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty accountList }">
	<c:forEach items="${accountList }" var="dto">
		계좌코드 : ${dto.account_no } <br>
		회원코드 : ${dto.u_info_no } <br>
		지점코드 : ${dto.l_bank_no } <br>
		계좌상태코드 : ${dto.a_state_no } <br>
		<br>
	</c:forEach>
</c:if>


<script>
$(function(){});
</script>
</body>
</html>