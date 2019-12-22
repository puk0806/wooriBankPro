package com.sign.model;

public class Y_signDTO {
	
	/* 예금/신탁상품가입 
	CREATE TABLE yegeum (
	   yegeum_no VARCHAR2(10) NOT NULL, 	예금/신탁상품가입코드 
	   u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   y_item_no VARCHAR2(10) NOT NULL, 	예금/신탁상품코드 
	   i_type_no VARCHAR2(10) NOT NULL, 	상품유형코드 
	   ps_type_no VARCHAR2(20) NOT NULL, 	상품상태코드 
	   t_type_no VARCHAR2(20) NOT NULL, 	비과세선택코드 
	   et_type_no VARCHAR2(20) NOT NULL, 	만기시해지방법코드 
	   employee_no VARCHAR2(20) NOT NULL, 	직원코드 
	   sb_type_no VARCHAR2(20) NOT NULL, 	스마트징검다리론신청코드 
	   ses_type_no VARCHAR2(20) NOT NULL, 	SNS만기알림유형코드 
	   interest_pay_method VARCHAR2(25) NOT NULL 이자지급방법 
	);
	*/
	
	String yegeum_no; 			// 예금/신탁상품가입코드
	String u_info_no; 			// 회원코드
	String account_no; 			// 계좌코드
	String y_item_no; 			// 예금/신탁상품코드
	String i_type_no; 			// 상품유형코드
	String ps_type_no;			// 상품상태코드
	String t_type_no; 			// 비과세선택코드
	String et_type_no; 			// 만기시해지방법코드
	String employee_no; 		// 직원코드
	String sb_type_no; 			// 스마트징검다리론신청코드
	String ses_type_no; 		// SNS만기알림유형코드
	String interest_pay_method; // 이자지급방법 
	public String getYegeum_no() {
		return yegeum_no;
	}
	public void setYegeum_no(String yegeum_no) {
		this.yegeum_no = yegeum_no;
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
	public String getY_item_no() {
		return y_item_no;
	}
	public void setY_item_no(String y_item_no) {
		this.y_item_no = y_item_no;
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
	public String getT_type_no() {
		return t_type_no;
	}
	public void setT_type_no(String t_type_no) {
		this.t_type_no = t_type_no;
	}
	public String getEt_type_no() {
		return et_type_no;
	}
	public void setEt_type_no(String et_type_no) {
		this.et_type_no = et_type_no;
	}
	public String getEmployee_no() {
		return employee_no;
	}
	public void setEmployee_no(String employee_no) {
		this.employee_no = employee_no;
	}
	public String getSb_type_no() {
		return sb_type_no;
	}
	public void setSb_type_no(String sb_type_no) {
		this.sb_type_no = sb_type_no;
	}
	public String getSes_type_no() {
		return ses_type_no;
	}
	public void setSes_type_no(String ses_type_no) {
		this.ses_type_no = ses_type_no;
	}
	public String getInterest_pay_method() {
		return interest_pay_method;
	}
	public void setInterest_pay_method(String interest_pay_method) {
		this.interest_pay_method = interest_pay_method;
	}

}
