package search.accountsearch.model;

import java.util.Date;

public class SearchDTO {	/*
	 계좌 
	CREATE TABLE account (
		account_no VARCHAR2(10) NOT NULL, 	계좌코드
		u_info_no VARCHAR2(10), 			회원코드 
		l_bank_no VARCHAR2(10), 			지점코드 
		a_type_no VARCHAR2(10), 			계좌유형코드 
		t_method_no VARCHAR2(10), 			거래유형코드 
		a_state_no VARCHAR2(10), 			계좌상태코드 
		currency_no VARCHAR2(20), 			통화코드 
		account_number VARCHAR2(20), 		계좌번호 
		account_create_date DATE, 			개설날짜 
		account_yegeum_name VARCHAR2(20), 	예금명 
		account_limit NUMBER, 				한도금액 
		COL NUMBER 							비밀번호 
	);
	
	
	계좌상세
	CREATE TABLE a_detail (
		account_detail_no VARCHAR2(20) NOT NULL,	거래no 
		account_no VARCHAR2(10), 					계좌코드 
		u_info_no VARCHAR2(10), 					회원코드 
		account_trans_money NUMBER, 				거래액 
		account_trans_date DATE, 					거래일 
		account_current_money NUMBER 				잔액 
	);

	*/
	
	/* 유저 
	CREATE TABLE u_info (
	   u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
	   s_addr_no VARCHAR2(10) NOT NULL, 	도로명코드 
	   c_grade_no VARCHAR2(10) NOT NULL, 	신용등급코드 
	   u_grade_no VARCHAR2(10) NOT NULL, 	회원등급코드 
	   country_no VARCHAR2(10) NOT NULL, 	국가코드 
	   work_no VARCHAR2(10) NOT NULL, 		직장코드 
	   user_name VARCHAR2(25) NOT NULL, 	이름 
	   user_rrn VARCHAR2(20) NOT NULL, 		주민번호 
	   user_phone VARCHAR2(20) NOT NULL, 	휴대폰번호 
	   user_email VARCHAR2(40) NOT NULL, 	이메일 
	   user_id VARCHAR2(10) NOT NULL, 		아이디 
	   user_pwd VARCHAR2(20) NOT NULL, 		비밀번호 
	   user_addr CLOB NOT NULL, 			상세주소 
	   user_sign_date DATE NOT NULL, 		가입일 
	   user_receive_sms NUMBER NOT NULL, 	SMS수신여부 
	   user_receive_email NUMBER NOT NULL, 	E-mail수신여부 
	   user_receive_phone NUMBER NOT NULL 	전화 수신여부 
	);
	*/
	
	/* 예금/신탁가입상세 
	CREATE TABLE yt_detail (
	   yt_detail_no VARCHAR2(10) NOT NULL,		NO
	   yegeum_no VARCHAR2(10) NOT NULL, 		예금/신탁상품가입코드
	   account_no VARCHAR2(10) NOT NULL, 		계좌코드
	   l_bank_no VARCHAR2(10) NOT NULL, 		지점코드 
	   p_set_no NUMBER NOT NULL, 				질권설정코드 
	   remarks_no VARCHAR2(20), 				특기사항코드 
	   yegeum_item_endday NUMBER, 				만기일 
	   yegeum_tiem_transmoney NUMBER NOT NULL	거래금액 
	);
	*/
	
	/* 특기사항
	CREATE TABLE remarks (
	   remarks_no VARCHAR2(20) NOT NULL, 			특기사항코드 
	   l_bank_no VARCHAR2(10) NOT NULL, 			지점코드 
	   remarks_create_date DATE NOT NULL, 			등록일 
	   remarks_type VARCHAR2(20) NOT NULL, 			종류 
	   remarks_payment_stop VARCHAR2(10) NOT NULL, 	지급정지구분 
	   remarks_division VARCHAR2(25) NOT NULL, 		구분 
	   remarks_clientname VARCHAR2(25), 			의뢰인명 
	   remarks_reason VARCHAR2(50), 				사유 
	   remarks_money NUMBER NOT NULL 				금액 
	);
	*/
	
	private String account_no; 			/* 계좌코드 */
	private String account_number; 		/* 계좌번호 */
	private String account_yegeum_name; /* 예금명 */
	private Date account_trans_date;	// 거래일
	private int account_current_money;	// 잔액
	private String l_bank_no; 			// 지점코드(account)
	private Date account_create_date; 	// 개설날짜(account)
	//
	private String user_name;	 		// 이름(user)

	private int p_set_no; 				// 질권설정코드(yt_detail)
	private String remarks_no; 			// 특기사항코드(yt_detail)
	private Date remarks_create_date;	// 등록일 (remark) 
	private String remarks_type;		// 종류 
	private String remarks_payment_stop;// 지급정지구분 
	private String remarks_division;	// 구분 
	private String remarks_clientname;	// 의뢰인명 
	private String remarks_reason;		// 사유 
	private int remarks_money;			// 금액 
	
	
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
	public String getL_bank_no() {
		return l_bank_no;
	}
	public void setL_bank_no(String l_bank_no) {
		this.l_bank_no = l_bank_no;
	}
	public Date getAccount_create_date() {
		return account_create_date;
	}
	public void setAccount_create_date(Date account_create_date) {
		this.account_create_date = account_create_date;
	}
	public int getP_set_no() {
		return p_set_no;
	}
	public void setP_set_no(int p_set_no) {
		this.p_set_no = p_set_no;
	}
	public String getRemarks_no() {
		return remarks_no;
	}
	public void setRemarks_no(String remarks_no) {
		this.remarks_no = remarks_no;
	}
	public Date getRemarks_create_date() {
		return remarks_create_date;
	}
	public void setRemarks_create_date(Date remarks_create_date) {
		this.remarks_create_date = remarks_create_date;
	}
	public String getRemarks_type() {
		return remarks_type;
	}
	public void setRemarks_type(String remarks_type) {
		this.remarks_type = remarks_type;
	}
	public String getRemarks_payment_stop() {
		return remarks_payment_stop;
	}
	public void setRemarks_payment_stop(String remarks_payment_stop) {
		this.remarks_payment_stop = remarks_payment_stop;
	}
	public String getRemarks_division() {
		return remarks_division;
	}
	public void setRemarks_division(String remarks_division) {
		this.remarks_division = remarks_division;
	}
	public String getRemarks_clientname() {
		return remarks_clientname;
	}
	public void setRemarks_clientname(String remarks_clientname) {
		this.remarks_clientname = remarks_clientname;
	}
	public String getRemarks_reason() {
		return remarks_reason;
	}
	public void setRemarks_reason(String remarks_reason) {
		this.remarks_reason = remarks_reason;
	}
	public int getRemarks_money() {
		return remarks_money;
	}
	public void setRemarks_money(int remarks_money) {
		this.remarks_money = remarks_money;
	}
	
}
