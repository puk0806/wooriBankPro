package com.sign.model;

public class Foi_signDTO {
	
	
	/* 외화상품가입
	CREATE TABLE foi_sign (
	   foi_sign_no VARCHAR2(10) NOT NULL,	외화상품가입코드 
	   u_info_no VARCHAR2(10), 				회원코드 
	   account_no VARCHAR2(10), 			계좌코드 
	   fo_item_no VARCHAR2(20), 			외화상품코드 
	   i_type_no VARCHAR2(10), 				상품유형코드 
	   ps_type_no VARCHAR2(20), 			상품상태코드 
	   currency_no VARCHAR2(20) 			통화코드 
	);
	*/
	
	String foi_sign_no; // 외화상품가입코드
	String u_info_no; // 회원코드
	String account_no; // 계좌코드
	String fo_item_no; // 외화상품코드
	String i_type_no; // 상품유형코드
	String ps_type_no; // 상품상태코드
	String currency_no; // 통화코드
	
	public Foi_signDTO() {
	}
	   
	public Foi_signDTO(String foi_sign_no, String u_info_no, String account_no, String fo_item_no, String i_type_no,
			String ps_type_no, String currency_no) {
		this.foi_sign_no = foi_sign_no;
		this.u_info_no = u_info_no;
		this.account_no = account_no;
		this.fo_item_no = fo_item_no;
		this.i_type_no = i_type_no;
		this.ps_type_no = ps_type_no;
		this.currency_no = currency_no;
	}



	public String getFoi_sign_no() {
		return foi_sign_no;
	}
	public void setFoi_sign_no(String foi_sign_no) {
		this.foi_sign_no = foi_sign_no;
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
	public String getFo_item_no() {
		return fo_item_no;
	}
	public void setFo_item_no(String fo_item_no) {
		this.fo_item_no = fo_item_no;
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
	public String getCurrency_no() {
		return currency_no;
	}
	public void setCurrency_no(String currency_no) {
		this.currency_no = currency_no;
	}
	   

}
