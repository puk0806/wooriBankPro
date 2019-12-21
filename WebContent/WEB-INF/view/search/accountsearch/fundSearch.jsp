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
<h3>/WEB-INF/view/search/accountsearch/fundSearch.jsp</h3>
<a href="/bankJSPProject/search/accountsearch/search.do">예금/신탁</a> <br>
<a href="/bankJSPProject/search/accountsearch/fundSearch.do">펀드</a> <br>
<a href="/bankJSPProject/search/accountsearch/loanSearch.do">대출</a> <br>
<a href="/bankJSPProject/search/accountsearch/foreignSearch.do">외화</a> <br>
<a href="/bankJSPProject/search/accountsearch/goldSearch.do">골드</a> <br>
<a href="/bankJSPProject/search/accountsearch/insuranceSearch.do">보험</a> <br>
<a href="/bankJSPProject/search/accountsearch/allSearch.do">전체계좌</a> <br>

<hr>
<h4>펀드</h4>
<c:if test="${empty fundList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty fundList }">
	<c:forEach items="${fundList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	투자 원금 : ${dto.fund_item_sign_money } <br>
	평가 금액 : ${dto.fund_item_sign_money *(1+(dto.investment_profit/100))} <br>
	<br>
	<h4>펀드상세조회</h4>
	상품종류 : ${dto.account_yegeum_name } <br>
	계좌번호 : ${dto.account_number } <br>
	고객명 : ${dto.user_name } <br>
	관리점 : ${dto.l_bank_no } <br>
	금일평가금액 : ${dto.fund_item_sign_money *(1+(dto.investment_profit/100))} <br>
	금일기준금액 : ${dto.standard_price } <br>
	신규일 : ${dto.account_create_date } <br>
	투자원금 : ${dto.fund_item_sign_money } <br>
	최종거래일 : ${dto.account_trans_date } <br>
	투자수익률 : ${dto.investment_profit } <br>
	잔고좌수 : ${dto.account_balance } <br>
	위탁회사명 : ${dto.trust_company } <br>
	
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

</body>
</html>