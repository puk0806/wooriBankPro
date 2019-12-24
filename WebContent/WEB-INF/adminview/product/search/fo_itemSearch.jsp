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
<h3>product/search/fo_itemSearch.jsp</h3>
<c:if test="${empty fo_itemList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty fo_itemList }">
	<c:forEach items="${fo_itemList }" var="dto">
		가입금액 : ${dto.foreign_item_sign_money } <br>
		상품설명 : ${dto.foreign_item_comment } <br>
		만기기간 : ${dto.foreign_item_endday } <br>
		
		<br>
	</c:forEach>
</c:if>

    <form action="/bankJSPProject/product/fo_item.admin" method="post">
         <select name="searchCondition" id="searchCondition">
            <option value="1">상품명</option>
            <option value="2">상품설명</option>
         </select>
         <input type="text" name="searchWord" id="searchWord" value="${ searchWord }">
         <input type="submit" value="search">
      </form>   


<script>
$(function(){});
</script>
</body>
</html>