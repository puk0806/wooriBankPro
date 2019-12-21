package com.model;

import java.util.Date;

public class A_detailDTO {
	
	/* 
	 계좌상세
	CREATE TABLE a_detail (
	   a_detail_no VARCHAR2(20) NOT NULL, 		거래no 
	   account_no VARCHAR2(10) NOT NULL, 		계좌코드 
	   u_info_no VARCHAR2(10) NOT NULL, 		회원코드 
	   t_method_no VARCHAR2(10), 				거래유형코드 
	   account_trans_money NUMBER NOT NULL, 	거래액 
	   account_trans_date DATE NOT NULL, 		거래일 
	   account_current_money NUMBER NOT NULL 	잔액 
	);
	 */
	
	
	String a_detail_no; 		// 거래no
	String account_no; 			// 계좌코드
	String u_info_no; 			// 회원코드
	String t_method_no; 		// 거래유형코드
	int account_trans_money; 	// 거래액
	Date account_trans_date; 	// 거래일
	int account_current_money; 	// 잔액
	
	public A_detailDTO() {
	}
	
	public A_detailDTO(String a_detail_no, String account_no, String u_info_no, String t_method_no,
			int account_trans_money, Date account_trans_date, int account_current_money) {
		super();
		this.a_detail_no = a_detail_no;
		this.account_no = account_no;
		this.u_info_no = u_info_no;
		this.t_method_no = t_method_no;
		this.account_trans_money = account_trans_money;
		this.account_trans_date = account_trans_date;
		this.account_current_money = account_current_money;
	}



	public String getA_detail_no() {
		return a_detail_no;
	}
	public void setA_detail_no(String a_detail_no) {
		this.a_detail_no = a_detail_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getU_info_no() {
		return u_info_no;
	}
	public void setU_info_no(String u_info_no) {
		this.u_info_no = u_info_no;
	}
	public String getT_method_no() {
		return t_method_no;
	}
	public void setT_method_no(String t_method_no) {
		this.t_method_no = t_method_no;
	}
	public int getAccount_trans_money() {
		return account_trans_money;
	}
	public void setAccount_trans_money(int account_trans_money) {
		this.account_trans_money = account_trans_money;
	}
	public Date getAccount_trans_date() {
		return account_trans_date;
	}
	public void setAccount_trans_date(Date account_trans_date) {
		this.account_trans_date = account_trans_date;
	}
	public int getAccount_current_money() {
		return account_current_money;
	}
	public void setAccount_current_money(int account_current_money) {
		this.account_current_money = account_current_money;
	}
	
	
	

}
