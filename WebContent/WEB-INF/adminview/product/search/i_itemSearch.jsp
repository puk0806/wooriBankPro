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
<h3>product/search/i_itemSearch.jsp</h3>
<c:if test="${empty i_itemList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty i_itemList }">
	<c:forEach items="${i_itemList }" var="dto">
		상품설명 : ${dto.insurance_item_commnet } <br>
		보험상품명 : ${dto.insurance_item_name } <br>
		보험기간 : ${dto.insurance_item_length } <br>
		<br>
	</c:forEach>
</c:if>

  <form action="/bankJSPProject/product/i_item.admin" method="post">
         <select name="searchCondition" id="searchCondition">
            <option value="1">상품명</option>
            <option value="2">상품설명</option>
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