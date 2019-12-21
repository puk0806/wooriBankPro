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
<h3>/WEB-INF/view/search/accountsearch/allSearch.jsp</h3>
<a href="/bankJSPProject/search/accountsearch/search.do">예금/신탁</a> <br>
<a href="/bankJSPProject/search/accountsearch/fundSearch.do">펀드</a> <br>
<a href="/bankJSPProject/search/accountsearch/loanSearch.do">대출</a> <br>
<a href="/bankJSPProject/search/accountsearch/foreignSearch.do">외화</a> <br>
<a href="/bankJSPProject/search/accountsearch/goldSearch.do">골드</a> <br>
<a href="/bankJSPProject/search/accountsearch/insuranceSearch.do">보험</a> <br>
<a href="/bankJSPProject/search/accountsearch/allSearch.do">전체계좌</a> <br>


<h4>입출금</h4> <br>
<c:if test="${empty searchList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty searchList }">
	<c:forEach items="${searchList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

<h4>예금/신탁</h4> <br>

<c:if test="${empty depositList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty depositList }">
	<c:forEach items="${depositList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

<h4>적금</h4> <br>

<c:if test="${empty savingList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty savingList }">
	<c:forEach items="${savingList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

<h4>펀드</h4>
<c:if test="${empty fundList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty fundList }">
	<c:forEach items="${fundList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>


<h4>뮤추얼펀드</h4>
<c:if test="${empty mutualList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty mutualList }">
	<c:forEach items="${mutualList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

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

<h4>외화</h4> <br>
<c:if test="${empty foreignList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty foreignList }">
	<c:forEach items="${foreignList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

<h4>골드</h4>
<c:if test="${empty goldList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty goldList }">
	<c:forEach items="${goldList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.account_current_money} <br>
	<br>
	</c:forEach>
</c:if>

<h4>보험</h4>
<c:if test="${empty insuranceList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty insuranceList }">
	<c:forEach items="${insuranceList }" var="dto">
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