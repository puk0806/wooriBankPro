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
<h3>product/search/fu_itemSearch.jsp</h3>
<c:if test="${empty fu_itemList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty fu_itemList }">
	<c:forEach items="${fu_itemList }" var="dto">
		가입대상코드 : ${dto.st_type_no } <br>
		위험등급코드 : ${dto.r_rate_no } <br>
		펀드상품유형코드 : ${dto.fi_type_no } <br>
		상품설명 : ${dto.fund_item_comment } <br>
		예상수익률 : ${dto.fund_item_profitrate } <br>
		<br>
	</c:forEach>
</c:if>

  <form action="/bankJSPProject/product/fu_item.admin" method="post">
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