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
<h3>product/search/g_itemSearch.jsp</h3>

<c:if test="${empty g_itemList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty g_itemList }">
	<c:forEach items="${g_itemList }" var="dto">
		상품설명 : ${dto.gold_item_comment } <br>
		거래단위 : ${dto.gold_item_transunit } <br>
		<br>
	</c:forEach>
</c:if>

  <form action="/bankJSPProject/product/g_item.admin" method="post">
         <select name="searchCondition" id="searchCondition">
            <option value="1">상품명</option>
            <option value="2">상품설명</option>         </select>
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