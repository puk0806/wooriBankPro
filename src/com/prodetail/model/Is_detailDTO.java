package com.prodetail.model;

public class Is_detailDTO {
	

	/* 보험가입상세 
	CREATE TABLE is_detail (
	   is_detail_no VARCHAR2(10) NOT NULL,	NO 
	   ii_sign_no VARCHAR2(10) NOT NULL, 	보험상품가입코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL, 	지점코드 
	   insurance_principal NUMBER NOT NULL, 보험원금 
	   insurance_payment NUMBER NOT NULL 	보험납입액 
	);
	*/

	String is_detail_no; // NO
	String ii_sign_no; // 보험상품가입코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	int insurance_principal; // 보험원금
	int insurance_payment; // 보험납입액
	public String getIs_detail_no() {
		return is_detail_no;
	}
	public void setIs_detail_no(String is_detail_no) {
		this.is_detail_no = is_detail_no;
	}
	public String getIi_sign_no() {
		return ii_sign_no;
	}
	public void setIi_sign_no(String ii_sign_no) {
		this.ii_sign_no = ii_sign_no;
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
	public int getInsurance_principal() {
		return insurance_principal;
	}
	public void setInsurance_principal(int insurance_principal) {
		this.insurance_principal = insurance_principal;
	}
	public int getInsurance_payment() {
		return insurance_payment;
	}
	public void setInsurance_payment(int insurance_payment) {
		this.insurance_payment = insurance_payment;
	}
	
}
