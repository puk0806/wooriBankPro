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
<h3>/WEB-INF/view/search/accountsearch/foreignSearch.jsp</h3>
<a href="/bankJSPProject/search/accountsearch/search.do">예금/신탁</a> <br>
<a href="/bankJSPProject/search/accountsearch/fundSearch.do">펀드</a> <br>
<a href="/bankJSPProject/search/accountsearch/loanSearch.do">대출</a> <br>
<a href="/bankJSPProject/search/accountsearch/foreignSearch.do">외화</a> <br>
<a href="/bankJSPProject/search/accountsearch/goldSearch.do">골드</a> <br>
<a href="/bankJSPProject/search/accountsearch/insuranceSearch.do">보험</a> <br>
<a href="/bankJSPProject/search/accountsearch/allSearch.do">전체계좌</a> <br>


<h4>외화</h4> <br>
<c:if test="${empty foreignList }">
	<h4>계좌가 없습니다.</h4>
</c:if>
<c:if test="${not empty foreignList }">
	<c:forEach items="${foreignList }" var="dto">
	계좌 코드 : ${dto.account_no} <br>
	계좌번호 : ${dto.account_number} <br>
	예금명 :  ${dto.account_yegeum_name} <br>
	통화 : ${dto.currency_no } <br>
	최근거래일 : ${dto.account_trans_date} <br>
	잔액 : ${dto.current_money } <br>
	<br>
	<h4>외화 상세 조회</h4>
	상품 종류 : ${dto.account_yegeum_name } <br>
	계좌번호 : ${dto.account_number } <br>
	고객명 :${dto.user_name } <br>
	관리점 : ${dto.l_bank_no } <br>
	현재 잔액 : ${dto.account_current_money } <br>
	신규일 : ${dto.account_create_date } <br>
	통화 : ${dto.current_money } <br>
	만기시처리방법 : ${dto.endday_process } <br>
	갱신일 :  ${dto.renewal_date } <br>
	사고내역 : ${dto.fos_comment } <br>
	
	</c:forEach>
</c:if>

</body>
</html>