package com.prodetail.model;

public class Ls_detailDTO {
	
	/* 대출가입상세
	CREATE TABLE ls_detail (
	   ls_detail_no VARCHAR2(10) NOT NULL,	NO 
	   li_sign_no VARCHAR2(10) NOT NULL, 	대출상품가입코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL 		지점코드 
	);	
	*/

	String ls_detail_no; // NO
	String li_sign_no; // 대출상품가입코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	
	public String getLs_detail_no() {
		return ls_detail_no;
	}
	public void setLs_detail_no(String ls_detail_no) {
		this.ls_detail_no = ls_detail_no;
	}
	public String getLi_sign_no() {
		return li_sign_no;
	}
	public void setLi_sign_no(String li_sign_no) {
		this.li_sign_no = li_sign_no;
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
	
}
