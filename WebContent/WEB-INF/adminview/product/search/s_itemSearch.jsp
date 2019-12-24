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
<h3>product/search/s_itemSearch.jsp</h3>
<c:if test="${empty s_itemList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty s_itemList }">
	<c:forEach items="${s_itemList }" var="dto">
		상품명 : ${dto.saving_item_name } <br>
		가입최대금액 : ${dto.saving_item_maxmoney } <br>
		만기금리: ${dto.saving_item_endrate } <br>
		중도해지금리 : ${dto.saving_item_cancelrate } <br>
		적금기간 : ${dto.savings_item_length } <br>
		상품설명 : ${dto.savings_item_comment } <br>
		<br>
		
		
	</c:forEach>
</c:if>

  <form action="/bankJSPProject/product/s_item.admin" method="post">
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