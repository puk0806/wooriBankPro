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
<h3>/WEB-INF/view/search/accountsearch/loanSearch.jsp</h3>
<a href="/bankJSPProject/search/accountsearch/search.do">예금/신탁</a> <br>
<a href="/bankJSPProject/search/accountsearch/fundSearch.do">펀드</a> <br>
<a href="/bankJSPProject/search/accountsearch/loanSearch.do">대출</a> <br>
<a href="/bankJSPProject/search/accountsearch/foreignSearch.do">외화</a> <br>
<a href="/bankJSPProject/search/accountsearch/goldSearch.do">골드</a> <br>
<a href="/bankJSPProject/search/accountsearch/insuranceSearch.do">보험</a> <br>
<a href="/bankJSPProject/search/accountsearch/allSearch.do">전체계좌</a> <br>

<hr>
<h4>대출</h4>
<c:if test="${empty loanList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty loanList }">
	<c:forEach items="${loanList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

</body>
</html>