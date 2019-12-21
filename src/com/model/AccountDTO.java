package com.model;

import java.util.Date;

public class AccountDTO {
	/*
	 계좌 
	CREATE TABLE account (
		account_no VARCHAR2(10) NOT NULL, 	계좌코드
		u_info_no VARCHAR2(10), 			회원코드 
		l_bank_no VARCHAR2(10), 			지점코드 
		a_type_no VARCHAR2(10), 			계좌유형코드 
		a_state_no VARCHAR2(10), 			계좌상태코드 
		currency_no VARCHAR2(20), 			통화코드 
		account_number VARCHR2(20), 				계좌번호 
		account_create_date DATE, 			개설날짜 
		account_yegeum_name VARCHAR2(20), 	예금명 
		account_limit NUMBER, 				한도금액 
		account_pwd NUMBER 					비밀번호
		account_nick VARCHAR2(30)  			계좌별명  
	);
	*/
	
	  private String account_no; 			/* 계좌코드 */
	   private String u_info_no;			/* 회원코드 */
	   private String l_bank_no; 			/* 지점코드 */
	   private String a_type_no; 			/* 계좌유형코드 */
	   private String a_state_no;			/* 계좌상태코드 */
	   private String currency_no; 			/* 통화코드 */
	   private String account_number; 			/* 계좌번호 */
	   private Date account_create_date;	/* 개설날짜 */
	   private String account_yegeum_name; 	/* 예금명 */
	   private int account_limit;			/* 한도금액 */
	   private int account_pwd;				/* 비밀번호 */
	   private String account_nick;			// 계좌 별명
	   
	   
	   //생성자
	   public AccountDTO() {
	   }
	   
	   public AccountDTO(String account_no, String u_info_no, String l_bank_no, String a_type_no, String a_state_no,
			String currency_no, String account_number, Date account_create_date, String account_yegeum_name,
			int account_limit, int account_pwd, String account_nick) {
		super();
		this.account_no = account_no;
		this.u_info_no = u_info_no;
		this.l_bank_no = l_bank_no;
		this.a_type_no = a_type_no;
		this.a_state_no = a_state_no;
		this.currency_no = currency_no;
		this.account_number = account_number;
		this.account_create_date = account_create_date;
		this.account_yegeum_name = account_yegeum_name;
		this.account_limit = account_limit;
		this.account_pwd = account_pwd;
		this.account_nick = account_nick;
	   }



	//getter setter 
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
	
		public String getL_bank_no() {
			return l_bank_no;
		}
	
		public void setL_bank_no(String l_bank_no) {
			this.l_bank_no = l_bank_no;
		}
	
		public String getA_type_no() {
			return a_type_no;
		}
	
		public void setA_type_no(String a_type_no) {
			this.a_type_no = a_type_no;
		}
	
		public String getAccount_nick() {
			return account_nick;
		}
	
		public void setAccount_nick(String account_nick) {
			this.account_nick = account_nick;
		}
	
		public String getA_state_no() {
			return a_state_no;
		}
	
		public void setA_state_no(String a_state_no) {
			this.a_state_no = a_state_no;
		}
	
		public String getCurrency_no() {
			return currency_no;
		}
	
		public void setCurrency_no(String currency_no) {
			this.currency_no = currency_no;
		}
	
		
		
		public String getAccount_number() {
			return account_number;
		}

		public void setAccount_number(String account_number) {
			this.account_number = account_number;
		}

		public Date getAccount_create_date() {
			return account_create_date;
		}
	
		public void setAccount_create_date(Date account_create_date) {
			this.account_create_date = account_create_date;
		}
	
		public String getAccount_yegeum_name() {
			return account_yegeum_name;
		}
	
		public void setAccount_yegeum_name(String account_yegeum_name) {
			this.account_yegeum_name = account_yegeum_name;
		}
	
		public int getAccount_limit() {
			return account_limit;
		}
	
		public void setAccount_limit(int account_limit) {
			this.account_limit = account_limit;
		}
	
		public int getAccount_pwd() {
			return account_pwd;
		}
	
		public void setAccount_pwd(int account_pwd) {
			this.account_pwd = account_pwd;
		}

}
