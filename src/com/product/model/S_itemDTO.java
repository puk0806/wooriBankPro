package com.product.model;

public class S_itemDTO {
	
	/* 
	 적금상품
	CREATE TABLE s_item (
	   s_item_no VARCHAR2(10) NOT NULL, 		적금상품코드 
	   st_type_no VARCHAR2(20) NOT NULL,		가입대상코드 
	   saving_item_name VARCHAR2(100) NOT NULL, 상품명 
	   saving_item_maxmoney NUMBER, 			가입최대금액 
	   saving_item_endrate NUMBER NOT NULL, 	만기금리 
	   saving_item_cancelrate NUMBER NOT NULL, 	중도해지금리 
	   savings_item_length VARCHAR2(20) NOT NULL,적금기간 
	   savings_item_comment CLOB NOT NULL 		상품설명 
	);
	*/
	
	String s_item_no;; 				// 적금상품코드
	String st_type_no;; 			// 가입대상코드
	String saving_item_name; 		// 상품명
	int saving_item_maxmoney; 		// 가입최대금액
	int saving_item_endrate; 		// 만기금리
	int saving_item_cancelrate; 	// 중도해지금리
	String savings_item_length; 	// 적금기간
	String savings_item_comment; 	// 상품설명
	
	public S_itemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public String getS_item_no() {
		return s_item_no;
	}public S_itemDTO(String s_item_no, String st_type_no, String saving_item_name, int saving_item_maxmoney,
			int saving_item_endrate, int saving_item_cancelrate, String savings_item_length,
			String savings_item_comment) {
		super();
		this.s_item_no = s_item_no;
		this.st_type_no = st_type_no;
		this.saving_item_name = saving_item_name;
		this.saving_item_maxmoney = saving_item_maxmoney;
		this.saving_item_endrate = saving_item_endrate;
		this.saving_item_cancelrate = saving_item_cancelrate;
		this.savings_item_length = savings_item_length;
		this.savings_item_comment = savings_item_comment;
	}



	public void setS_item_no(String s_item_no) {
		this.s_item_no = s_item_no;
	}
	public String getSt_type_no() {
		return st_type_no;
	}
	public void setSt_type_no(String st_type_no) {
		this.st_type_no = st_type_no;
	}
	public String getSaving_item_name() {
		return saving_item_name;
	}
	public void setSaving_item_name(String saving_item_name) {
		this.saving_item_name = saving_item_name;
	}
	public int getSaving_item_maxmoney() {
		return saving_item_maxmoney;
	}
	public void setSaving_item_maxmoney(int saving_item_maxmoney) {
		this.saving_item_maxmoney = saving_item_maxmoney;
	}
	public int getSaving_item_endrate() {
		return saving_item_endrate;
	}
	public void setSaving_item_endrate(int saving_item_endrate) {
		this.saving_item_endrate = saving_item_endrate;
	}
	public int getSaving_item_cancelrate() {
		return saving_item_cancelrate;
	}
	public void setSaving_item_cancelrate(int saving_item_cancelrate) {
		this.saving_item_cancelrate = saving_item_cancelrate;
	}
	public String getSavings_item_length() {
		return savings_item_length;
	}
	public void setSavings_item_length(String savings_item_length) {
		this.savings_item_length = savings_item_length;
	}
	public String getSavings_item_comment() {
		return savings_item_comment;
	}
	public void setSavings_item_comment(String savings_item_comment) {
		this.savings_item_comment = savings_item_comment;
	}
	
	
}
