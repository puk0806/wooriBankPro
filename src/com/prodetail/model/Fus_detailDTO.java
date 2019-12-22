package com.prodetail.model;

public class Fus_detailDTO {
	

	/* 펀드가입상세
	CREATE TABLE fus_detail (
	   fus_detail_no VARCHAR2(10) NOT NULL, 	NO 
	   fui_sign_no VARCHAR2(10) NOT NULL, 		펀드상품가입코드 
	   account_no VARCHAR2(10) NOT NULL, 		계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL, 		지점코드 
	   fund_item_sign_money NUMBER NOT NULL, 	가입금액 
	   standard_price NUMBER NOT NULL, 			금일기준금액 
	   investment_profit NUMBER NOT NULL, 		투자수익률 
	   account_balance NUMBER NOT NULL, 		잔고좌수 
	   trust_company VARCHAR2(30) NOT NULL 		위탁회사명 
	);
	*/
	
	String fus_detail_no; // NO
	String fui_sign_no; // 펀드상품가입코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	int fund_item_sign_money; // 가입금액
	int standard_price; // 금일기준금액
	double investment_profit; // 투자수익률
	int account_balance; // 잔고좌수
	String trust_company; // 위탁회사명
	public String getFus_detail_no() {
		return fus_detail_no;
	}
	public void setFus_detail_no(String fus_detail_no) {
		this.fus_detail_no = fus_detail_no;
	}
	public String getFui_sign_no() {
		return fui_sign_no;
	}
	public void setFui_sign_no(String fui_sign_no) {
		this.fui_sign_no = fui_sign_no;
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
	public int getFund_item_sign_money() {
		return fund_item_sign_money;
	}
	public void setFund_item_sign_money(int fund_item_sign_money) {
		this.fund_item_sign_money = fund_item_sign_money;
	}
	public int getStandard_price() {
		return standard_price;
	}
	public void setStandard_price(int standard_price) {
		this.standard_price = standard_price;
	}
	public double getInvestment_profit() {
		return investment_profit;
	}
	public void setInvestment_profit(double investment_profit) {
		this.investment_profit = investment_profit;
	}
	public int getAccount_balance() {
		return account_balance;
	}
	public void setAccount_balance(int account_balance) {
		this.account_balance = account_balance;
	}
	public String getTrust_company() {
		return trust_company;
	}
	public void setTrust_company(String trust_company) {
		this.trust_company = trust_company;
	}
	
	
}
