package search.accountsearch.model;

import java.util.Date;

public class FundDTO {
	

	private String account_no; 			/* 계좌코드 */
	private String account_number; 		/* 계좌번호 */
	private String account_yegeum_name; /* 예금명 */
	private Date account_trans_date;	// 거래일
	private int account_current_money;	// 잔액
	
	private String user_name;	 		// 이름(user)
	//
	private Date account_create_date;	// 개설일(account)
	private int fund_item_sign_money;	// 투자 원금(fus_Detail)
	private double investment_profit;	// 투자 수익률
	private String l_bank_no; 			// 지점 코드
	private double standard_price;		// 금일기준금액
	private int account_balance;		// 잔고 좌수
	private String trust_company;		// 위탁회사명 
	
	
	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getAccount_yegeum_name() {
		return account_yegeum_name;
	}
	public void setAccount_yegeum_name(String account_yegeum_name) {
		this.account_yegeum_name = account_yegeum_name;
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
	public Date getAccount_create_date() {
		return account_create_date;
	}
	public void setAccount_create_date(Date account_create_date) {
		this.account_create_date = account_create_date;
	}
	public int getFund_item_sign_money() {
		return fund_item_sign_money;
	}
	public void setFund_item_sign_money(int fund_item_sign_money) {
		this.fund_item_sign_money = fund_item_sign_money;
	}
	public double getInvestment_profit() {
		return investment_profit;
	}
	public void setInvestment_profit(double investment_profit) {
		this.investment_profit = investment_profit;
	}
	public String getL_bank_no() {
		return l_bank_no;
	}
	
	public void setL_bank_no(String l_bank_no) {
		this.l_bank_no = l_bank_no;
	}
	
	public double getStandard_price() {
		return standard_price;
	}
	public void setStandard_price(double standard_price) {
		this.standard_price = standard_price;
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
