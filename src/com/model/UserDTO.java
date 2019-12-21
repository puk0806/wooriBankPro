package com.model;

import java.util.Date;

public class UserDTO {
	
	/*
	CREATE TABLE u_info (
		u_info_no VARCHAR2(10) NOT NULL, 	회원코드 
		s_addr_no VARCHAR2(10), 			도로명코드 
		c_grade_no VARCHAR2(10), 			신용등급코드 
		u_grade_no VARCHAR2(10), 			회원등급코드 
		country_no VARCHAR2(10), 			국가코드 
		work_no VARCHAR2(10), 				직장코드 
		user_name VARCHAR2(25) NOT NULL, 	이름 
		user_rrn  VARCHAR2(25), 			주민번호 
		user_phone  VARCHAR2(25), 		휴대폰번호 
		user_email VARCHAR2(40) NOT NULL, 	이메일 
		user_id VARCHAR2(10) NOT NULL, 		아이디 
		user_pwd VARCHAR2(20) NOT NULL, 	비밀번호 
		user_addr CLOB NOT NULL,			상세주소 
		user_sign_date DATE NOT NULL,		가입일 
		user_receive_sms NUMBER, 			SMS수신여부 
		user_receive_email NUMBER, 			E-mail수신여부 
		user_receive_phone NUMBER 			전화 수신여부 
	);
	*/
	                   
	private	String	u_info_no; 	
	private String s_addr_no; 			
	private String c_grade_no; 			
	private String u_grade_no; 			
	private String country_no; 			
	private String work_no; 				
	private String user_name; 	
	private String user_rrn; 			
	private String user_phone; 		
	private String user_email; 	
	private String user_id; 		
	private String user_pwd; 	
	private String user_addr;			
	private Date user_sign_date;		
	private int user_receive_sms; 			
	private int user_receive_email; 			
	private int user_receive_phone;
	
	public UserDTO() {
		super();
	}
	
	
	public UserDTO(String u_info_no, String s_addr_no, String c_grade_no, String u_grade_no, String country_no,
			String work_no, String user_name, String user_rrn, String user_phone, String user_email, String user_id,
			String user_pwd, String user_addr, Date user_sign_date, int user_receive_sms, int user_receive_email,
			int user_receive_phone) {
		super();
		this.u_info_no = u_info_no;
		this.s_addr_no = s_addr_no;
		this.c_grade_no = c_grade_no;
		this.u_grade_no = u_grade_no;
		this.country_no = country_no;
		this.work_no = work_no;
		this.user_name = user_name;
		this.user_rrn = user_rrn;
		this.user_phone = user_phone;
		this.user_email = user_email;
		this.user_id = user_id;
		this.user_pwd = user_pwd;
		this.user_addr = user_addr;
		this.user_sign_date = user_sign_date;
		this.user_receive_sms = user_receive_sms;
		this.user_receive_email = user_receive_email;
		this.user_receive_phone = user_receive_phone;
	}


	public String getU_info_no() {
		return u_info_no;
	}

	public void setU_info_no(String u_info_no) {
		this.u_info_no = u_info_no;
	}

	public String getS_addr_no() {
		return s_addr_no;
	}

	public void setS_addr_no(String s_addr_no) {
		this.s_addr_no = s_addr_no;
	}

	public String getC_grade_no() {
		return c_grade_no;
	}

	public void setC_grade_no(String c_grade_no) {
		this.c_grade_no = c_grade_no;
	}

	public String getU_grade_no() {
		return u_grade_no;
	}

	public void setU_grade_no(String u_grade_no) {
		this.u_grade_no = u_grade_no;
	}

	public String getCountry_no() {
		return country_no;
	}

	public void setCountry_no(String country_no) {
		this.country_no = country_no;
	}

	public String getWork_no() {
		return work_no;
	}

	public void setWork_no(String work_no) {
		this.work_no = work_no;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	

	public String getUser_rrn() {
		return user_rrn;
	}



	public void setUser_rrn(String user_rrn) {
		this.user_rrn = user_rrn;
	}



	public String getUser_phone() {
		return user_phone;
	}


	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}


	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_addr() {
		return user_addr;
	}

	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}

	public Date getUser_sign_date() {
		return user_sign_date;
	}

	public void setUser_sign_date(Date user_sign_date) {
		this.user_sign_date = user_sign_date;
	}

	public int getUser_receive_sms() {
		return user_receive_sms;
	}

	public void setUser_receive_sms(int user_receive_sms) {
		this.user_receive_sms = user_receive_sms;
	}

	public int getUser_receive_email() {
		return user_receive_email;
	}

	public void setUser_receive_email(int user_receive_email) {
		this.user_receive_email = user_receive_email;
	}

	public int getUser_receive_phone() {
		return user_receive_phone;
	}

	public void setUser_receive_phone(int user_receive_phone) {
		this.user_receive_phone = user_receive_phone;
	}
	
	// 비밀번호 일치 확인
	public boolean matchPassword(String user_pwd) {
		return this.user_pwd.equals(user_pwd);
	}
	
}
