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
<h3>product/search/l_itemSearch.jsp</h3>
<c:if test="${empty l_itemList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty l_itemList }">
	<c:forEach items="${l_itemList }" var="dto">
		상품설명 : ${dto.loan_item_comment } <br>
		대출기간 : ${dto.loan_item_length } <br>
		대출한도 : ${dto.loan_item_limitmoney } <br>
		<br>
	</c:forEach>
</c:if>

  <form action="/bankJSPProject/product/l_item.admin" method="post">
         <select name="searchCondition" id="searchCondition">
            <option value="1">title</option>
            <option value="2">content</option>
         </select>
         <script>
         $("#searchCondition").val('${searchCondition}');
         </script>
         <input type="text" name="searchWord" id="searchWord" value="${ searchWord }">
         <input type="submit" value="search">
      </form>  

<script>
$(function(){});
</script>
</body>
</html>