package com.sign.model;

public class Li_signDTO {
	

	/* 대출상품가입
	CREATE TABLE li_sign (
	   li_sign_no VARCHAR2(10) NOT NULL,	대출상품가입코드
	   u_info_no VARCHAR2(10),				회원코드 
	   account_no VARCHAR2(10), 			계좌코드 
	   l_item_no VARCHAR2(10), 				대출상품코드 
	   i_type_no VARCHAR2(10), 				상품유형코드 
	   ps_type_no VARCHAR2(20), 			상품상태코드 
	   loan_item_sign_money NUMBER 			대출금액 
	);
	*/
	String li_sign_no; // 대출상품가입코드
	String u_info_no; // 회원코드
	String account_no; // 계좌코드
	String l_item_no; // 대출상품코드
	String i_type_no; // 상품유형코드
	String ps_type_no; // 상품상태코드
	int loan_item_sign_money; // 대출금액
	public String getLi_sign_no() {
		return li_sign_no;
	}
	public void setLi_sign_no(String li_sign_no) {
		this.li_sign_no = li_sign_no;
	}
	public String getU_info_no() {
		return u_info_no;
	}
	public void setU_info_no(String u_info_no) {
		this.u_info_no = u_info_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getL_item_no() {
		return l_item_no;
	}
	public void setL_item_no(String l_item_no) {
		this.l_item_no = l_item_no;
	}
	public String getI_type_no() {
		return i_type_no;
	}
	public void setI_type_no(String i_type_no) {
		this.i_type_no = i_type_no;
	}
	public String getPs_type_no() {
		return ps_type_no;
	}
	public void setPs_type_no(String ps_type_no) {
		this.ps_type_no = ps_type_no;
	}
	public int getLoan_item_sign_money() {
		return loan_item_sign_money;
	}
	public void setLoan_item_sign_money(int loan_item_sign_money) {
		this.loan_item_sign_money = loan_item_sign_money;
	}

}
