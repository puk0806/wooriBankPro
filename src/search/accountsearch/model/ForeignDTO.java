package search.accountsearch.model;

import java.util.Date;

public class ForeignDTO {
	
	private String account_no; 			/* 계좌코드 */
	private String account_number; 		/* 계좌번호 */
	private String account_yegeum_name; /* 예금명 */
	private Date account_trans_date;	// 거래일
	private int account_current_money;	// 잔액
	private Date account_create_date;	// 개설일 
	// 
	
	private String user_name;	 		// 이름(user)
	
	private String currency_no; 		// 통화코드
	private double current_money;		// 외화잔액
	private String l_bank_no;			// 지점코드
	private String endday_process;		// 만기시처리방법
	private String accident_content;	// 사고내역
	private Date renewal_date;			// 갱신일
	private String fos_comment;			// 거래내용
	
	
	
	
	public Date getAccount_create_date() {
		return account_create_date;
	}
	public void setAccount_create_date(Date account_create_date) {
		this.account_create_date = account_create_date;
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
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
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
	public String getL_bank_no() {
		return l_bank_no;
	}
	public void setL_bank_no(String l_bank_no) {
		this.l_bank_no = l_bank_no;
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
