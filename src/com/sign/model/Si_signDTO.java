package com.sign.model;

public class Si_signDTO {
	

	/* 적금상품가입 
	CREATE TABLE si_sign (
	   si_sign_no VARCHAR2(10) NOT NULL,	적금상품가입코드 
	   s_item_no VARCHAR2(10) NOT NULL, 	적금상품코드 
	   u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   i_type_no VARCHAR2(10) NOT NULL, 	상품유형코드 
	   ps_type_no VARCHAR2(20) NOT NULL 	상품상태코드 
	);
	*/
	String si_sign_no; // 적금상품가입코드
	String s_item_no; // 적금상품코드
	String u_info_no; // 회원코드
	String account_no; // 계좌코드
	String i_type_no; // 상품유형코드
	String ps_type_no; // 상품상태코드
	public String getSi_sign_no() {
		return si_sign_no;
	}
	public void setSi_sign_no(String si_sign_no) {
		this.si_sign_no = si_sign_no;
	}
	public String getS_item_no() {
		return s_item_no;
	}
	public void setS_item_no(String s_item_no) {
		this.s_item_no = s_item_no;
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
	
	
	
}
