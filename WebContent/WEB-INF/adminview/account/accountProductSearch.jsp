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
<h3>/adminview/account/accountProductSearch.jsp</h3>

<div style="margin: 0 auto;width:800px">
	<form action="/bankJSPProject/account/accountProductSearch.admin" method="post">
	<p>
		통장 종류 : 
		<select name="account_type_name">
			<option>입출금</option>
			<option>예금</option>
			<option>적금</option>
			<option>펀드</option>
			<option>뮤추얼펀드</option>
			<option>대출</option>
			<option>외화</option>
			<option>골드</option>
			<option>보험</option>
		</select>
	</p>
	<input type="submit" value="검색">
	</form>
</div>

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