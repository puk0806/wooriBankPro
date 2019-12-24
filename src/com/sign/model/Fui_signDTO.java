package com.sign.model;

public class Fui_signDTO {
	
	/* 펀드상품가입
	CREATE TABLE fui_sign (
	   fui_sign_no VARCHAR2(10) NOT NULL, 	펀드상품가입코드 
	   u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   fu_item_no VARCHAR2(10) NOT NULL, 	조회상품코드 
	   i_type_no VARCHAR2(10) NOT NULL, 	상품유형코드 
	   ps_type_no VARCHAR2(20) NOT NULL, 	상품상태코드 
	   payment_no VARCHAR2(20) 				납입방법코드 
	);
	*/

	String fui_sign_no; // 펀드상품가입코드
	String u_info_no; // 회원코드
	String account_no; // 계좌코드
	String fu_item_no; // 조회상품코드
	String i_type_no; // 상품유형코드
	String ps_type_no; // 상품상태코드
	String payment_no; // 납입방법코드
	
	public Fui_signDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Fui_signDTO(String fui_sign_no, String u_info_no, String account_no, String fu_item_no, String i_type_no,
			String ps_type_no, String payment_no) {
		this.fui_sign_no = fui_sign_no;
		this.u_info_no = u_info_no;
		this.account_no = account_no;
		this.fu_item_no = fu_item_no;
		this.i_type_no = i_type_no;
		this.ps_type_no = ps_type_no;
		this.payment_no = payment_no;
	}




	public String getFui_sign_no() {
		return fui_sign_no;
	}
	public void setFui_sign_no(String fui_sign_no) {
		this.fui_sign_no = fui_sign_no;
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
	public String getFu_item_no() {
		return fu_item_no;
	}
	public void setFu_item_no(String fu_item_no) {
		this.fu_item_no = fu_item_no;
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
	public String getPayment_no() {
		return payment_no;
	}
	public void setPayment_no(String payment_no) {
		this.payment_no = payment_no;
	}
	

}
