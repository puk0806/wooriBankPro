package com.prodetail.model;

public class Gs_detailDTO {
	
	/* 골드가입상세 
	CREATE TABLE gs_detail (
	   gs_detail_no VARCHAR2(20) NOT NULL,	NO 
	   gi_sign_no VARCHAR2(10) NOT NULL, 	골드상품가입코드 
	   g_price_no VARCHAR2(20) NOT NULL, 	골드시세코드 
	   account_no VARCHAR2(10) NOT NULL, 	계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL, 	지점코드 
	   gold_traderate NUMBER NOT NULL, 		골드거래량
	   gold_extra NUMBER NOT NULL 			잔여골드 
	);
	*/

	String gs_detail_no; // NO
	String gi_sign_no; // 골드상품가입코드
	String g_price_no; // 골드시세코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	double gold_traderate; // 골드거래량
	double gold_extra; // 잔여골드
	
	public String getGs_detail_no() {
		return gs_detail_no;
	}
	public void setGs_detail_no(String gs_detail_no) {
		this.gs_detail_no = gs_detail_no;
	}
	public String getGi_sign_no() {
		return gi_sign_no;
	}
	public void setGi_sign_no(String gi_sign_no) {
		this.gi_sign_no = gi_sign_no;
	}
	public String getG_price_no() {
		return g_price_no;
	}
	public void setG_price_no(String g_price_no) {
		this.g_price_no = g_price_no;
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
	public double getGold_traderate() {
		return gold_traderate;
	}
	public void setGold_traderate(double gold_traderate) {
		this.gold_traderate = gold_traderate;
	}
	public double getGold_extra() {
		return gold_extra;
	}
	public void setGold_extra(double gold_extra) {
		this.gold_extra = gold_extra;
	}

}
