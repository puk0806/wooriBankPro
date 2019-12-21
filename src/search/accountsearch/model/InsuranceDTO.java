package search.accountsearch.model;

import java.util.Date;

public class InsuranceDTO {
	
	private String account_no; 			/* 계좌코드 */
	private String account_number; 		/* 계좌번호 */
	private String account_yegeum_name; /* 예금명 */
	private Date account_trans_date;	// 거래일
	private int account_current_money;	// 잔액
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

}
