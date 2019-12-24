package com.prodetail.model;

import java.sql.Connection;
import java.util.Date;

public class Fos_detailDTO {

	/* 외화가입상세
	CREATE TABLE fos_detail (
	   fos_detail_no VARCHAR2(10) NOT NULL,		NO 
	   foi_sign_no VARCHAR2(10) NOT NULL, 		외화상품가입코드 
	   account_no VARCHAR2(10) NOT NULL, 		계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL, 		지점코드 
	   currency_no VARCHAR2(20) NOT NULL, 		통화코드 
	   current_money NUMBER NOT NULL, 			현재잔액 
	   endday_process VARCHAR2(50) NOT NULL, 	만기시처리방법 
	   accident_content VARCHAR2(50) NOT NULL, 	사고내역 
	   renewal_date DATE NOT NULL, 				갱신일 
	   fos_comment CLOB 						거래내용 
	);
	*/

	String fos_detail_no; // NO
	String foi_sign_no; // 외화상품가입코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	String currency_no; // 통화코드
	double current_money; // 현재잔액
	String endday_process; // 만기시처리방법
	String accident_content; // 사고내역
	Date renewal_date; // 갱신일
	String fos_comment; // 거래내용
	
	public Fos_detailDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Fos_detailDTO(String fos_detail_no, String foi_sign_no, String account_no, String l_bank_no,
			String currency_no, double current_money, String endday_process, String accident_content, Date renewal_date,
			String fos_comment) {
		super();
		this.fos_detail_no = fos_detail_no;
		this.foi_sign_no = foi_sign_no;
		this.account_no = account_no;
		this.l_bank_no = l_bank_no;
		this.currency_no = currency_no;
		this.current_money = current_money;
		this.endday_process = endday_process;
		this.accident_content = accident_content;
		this.renewal_date = renewal_date;
		this.fos_comment = fos_comment;
	}



	public String getFos_detail_no() {
		return fos_detail_no;
	}
	public void setFos_detail_no(String fos_detail_no) {
		this.fos_detail_no = fos_detail_no;
	}
	public String getFoi_sign_no() {
		return foi_sign_no;
	}
	public void setFoi_sign_no(String foi_sign_no) {
		this.foi_sign_no = foi_sign_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getL_bank_no() {
		return l_bank_no;
	}
	public void setL_bank_no(String l_bank_no) {
		this.l_bank_no = l_bank_no;
	}
	public String getCurrency_no() {
		return currency_no;
	}
	public void setCurrency_no(String currency_no) {
		this.currency_no = currency_no;
	}
	public double getCurrent_money() {
		return current_money;
	}
	public void setCurrent_money(double current_money) {
		this.current_money = current_money;
	}
	public String getEndday_process() {
		return endday_process;
	}
	public void setEndday_process(String endday_process) {
		this.endday_process = endday_process;
	}
	public String getAccident_content() {
		return accident_content;
	}
	public void setAccident_content(String accident_content) {
		this.accident_content = accident_content;
	}
	public Date getRenewal_date() {
		return renewal_date;
	}
	public void setRenewal_date(Date renewal_date) {
		this.renewal_date = renewal_date;
	}
	public String getFos_comment() {
		return fos_comment;
	}
	public void setFos_comment(String fos_comment) {
		this.fos_comment = fos_comment;
	}
	
	

}
