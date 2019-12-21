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
<h3>/transfer/automatictransfer/search</h3>
<a href="/bankJSPProject/search/accountsearch/search.do">예금/신탁</a> <br>
<a href="/bankJSPProject/search/accountsearch/fundSearch.do">펀드</a> <br>
<a href="/bankJSPProject/search/accountsearch/loanSearch.do">대출</a> <br>
<a href="/bankJSPProject/search/accountsearch/foreignSearch.do">외화</a> <br>
<a href="/bankJSPProject/search/accountsearch/goldSearch.do">골드</a> <br>
<a href="/bankJSPProject/search/accountsearch/insuranceSearch.do">보험</a> <br>
<a href="/bankJSPProject/search/accountsearch/allSearch.do">전체계좌</a> <br>
<hr>

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
	<h4>계좌상세정보</h4><br>
	예금종류 : ${dto.account_yegeum_name} <br>
	계좌번호 : ${dto.account_number} <br>
	고객명 : ${dto.user_name} <br>
	관리점 : ${dto.l_bank_no} <br>
	현재 잔액 : ${dto.account_current_money } <br>
	출금가능금액 : ${dto.account_current_money } <br>
	신규일 : ${dto.account_create_date } <br>
	최종거래일 : ${dto.account_trans_date } <br>
	질권설정 : ${dto.p_set_no }<br>
	
	<h4>특기사항내역</h4>
	등록일 : ${dto.remarks_create_date }<br>
	종류 : ${dto.remarks_type }<br>
	지급정지 : ${dto.remarks_payment_stop }<br>
	의뢰인 : ${dto.remarks_clientname }<br>
	구분 : ${dto.remarks_division }<br>
	사유 : ${dto.remarks_reason }<br>
	금액 : ${dto.account_current_money }<br>
	등록점 : ${dto.l_bank_no }<br>
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



</body>
</html>