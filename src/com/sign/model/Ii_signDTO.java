package com.sign.model;

import java.util.Date;

public class Ii_signDTO {
	
	/* 보험상품가입
	CREATE TABLE ii_sign (
	   ii_sign_no VARCHAR2(10) NOT NULL, 	보험상품가입코드 
	   u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   i_item_no VARCHAR2(10) NOT NULL, 	보험상품코드 
	   i_type_no VARCHAR2(10) NOT NULL, 	상품유형코드 
	   ps_type_no VARCHAR2(20) NOT NULL, 	상품상태코드 
	   stock_number VARCHAR2(20) NOT NULL,	증권번호 
	   insurence_sign_date DATE NOT NULL, 	계약일자 
	   insurance_length NUMBER NOT NULL, 	계약기간 
	   insurance_cycle NUMBER 				납입주기 
	);
	*/

	String ii_sign_no; // 보험상품가입코드
	String u_info_no; // 회원코드
	String account_no; // 계좌코드
	String i_item_no; // 보험상품코드
	String i_type_no; // 상품유형코드
	String ps_type_no; // 상품상태코드
	String stock_number; // 증권번호
	Date insurence_sign_date; // 계약일자
	int insurance_length; // 계약기간
	int insurance_cycle; // 납입주기	
	public String getIi_sign_no() {
		return ii_sign_no;
	}
	public void setIi_sign_no(String ii_sign_no) {
		this.ii_sign_no = ii_sign_no;
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
	public String getI_item_no() {
		return i_item_no;
	}
	public void setI_item_no(String i_item_no) {
		this.i_item_no = i_item_no;
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
	public String getStock_number() {
		return stock_number;
	}
	public void setStock_number(String stock_number) {
		this.stock_number = stock_number;
	}
	public Date getInsurence_sign_date() {
		return insurence_sign_date;
	}
	public void setInsurence_sign_date(Date insurence_sign_date) {
		this.insurence_sign_date = insurence_sign_date;
	}
	public int getInsurance_length() {
		return insurance_length;
	}
	public void setInsurance_length(int insurance_length) {
		this.insurance_length = insurance_length;
	}
	public int getInsurance_cycle() {
		return insurance_cycle;
	}
	public void setInsurance_cycle(int insurance_cycle) {
		this.insurance_cycle = insurance_cycle;
	}
	

}
