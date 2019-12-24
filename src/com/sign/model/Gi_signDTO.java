package com.sign.model;

public class Gi_signDTO {
	/* 골드상품가입
	CREATE TABLE gi_sign (
	   gi_sign_no VARCHAR2(10) NOT NULL,	골드상품가입코드 
	   u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   g_item_no VARCHAR2(10) NOT NULL, 	골드상품코드 
	   i_type_no VARCHAR2(10) NOT NULL, 	상품유형코드 
	   ps_type_no VARCHAR2(20) NOT NULL, 	상품상태코드 
	   currency_no VARCHAR2(20) NOT NULL, 	통화코드 
	   ses_type_no VARCHAR2(20) NOT NULL, 	SNS만기알림유형코드 
	   ea_type_no VARCHAR2(20) NOT NULL, 	이메일알림유형코드 
	   employee_no VARCHAR2(20) 			직원코드
	);
	*/
	
	String gi_sign_no; // 골드상품가입코드
	String u_info_no; // 회원코드
	String account_no; // 계좌코드
	String g_item_no; // 골드상품코드
	String i_type_no; // 상품유형코드
	String ps_type_no; // 상품상태코드
	String currency_no; // 통화코드
	String ses_type_no; // SNS만기알림유형코드
	String ea_type_no; // 이메일알림유형코드
	String employee_no; // 직원코드
	
	public Gi_signDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Gi_signDTO(String gi_sign_no, String u_info_no, String account_no, String g_item_no, String i_type_no,
			String ps_type_no, String currency_no, String ses_type_no, String ea_type_no, String employee_no) {
		this.gi_sign_no = gi_sign_no;
		this.u_info_no = u_info_no;
		this.account_no = account_no;
		this.g_item_no = g_item_no;
		this.i_type_no = i_type_no;
		this.ps_type_no = ps_type_no;
		this.currency_no = currency_no;
		this.ses_type_no = ses_type_no;
		this.ea_type_no = ea_type_no;
		this.employee_no = employee_no;
	}



	public String getGi_sign_no() {
		return gi_sign_no;
	}
	public void setGi_sign_no(String gi_sign_no) {
		this.gi_sign_no = gi_sign_no;
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
	public String getG_item_no() {
		return g_item_no;
	}
	public void setG_item_no(String g_item_no) {
		this.g_item_no = g_item_no;
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
	public String getSes_type_no() {
		return ses_type_no;
	}
	public void setSes_type_no(String ses_type_no) {
		this.ses_type_no = ses_type_no;
	}
	public String getEa_type_no() {
		return ea_type_no;
	}
	public void setEa_type_no(String ea_type_no) {
		this.ea_type_no = ea_type_no;
	}
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	
	
	

}
