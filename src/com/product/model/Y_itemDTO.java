package com.product.model;

public class Y_itemDTO {
	
	
	/* 
	 예금상품 
	CREATE TABLE y_item (
	   y_item_no VARCHAR2(10) NOT NULL, 		예금신탁상품코드
	   yegeum_item_name VARCHAR2(100) NOT NULL, 상품명 
	   yegeum_item_length VARCHAR2(20) NOT NULL,예금기간 
	   yegeum_item_limitmoney NUMBER, 			가입제한금액 
	   yegeum_item_interestrate NUMBER NOT NULL,금리 
	   yegeum_item_comment CLOB NOT NULL 		상품설명 
	);
	*/
	
	String y_item_no; 				// 예금신탁상품코드
	String yegeum_item_name; 		// 상품명
	String yegeum_item_length; 		// 예금기간
	int yegeum_item_limitmoney; 	// 가입제한금액
	double yegeum_item_interestrate; 	// 금리
	String styegeum_item_comment; 	// 상품설명
	
	public Y_itemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Y_itemDTO(String y_item_no, String yegeum_item_name, String yegeum_item_length, int yegeum_item_limitmoney,
			double yegeum_item_interestrate, String styegeum_item_comment) {
		super();
		this.y_item_no = y_item_no;
		this.yegeum_item_name = yegeum_item_name;
		this.yegeum_item_length = yegeum_item_length;
		this.yegeum_item_limitmoney = yegeum_item_limitmoney;
		this.yegeum_item_interestrate = yegeum_item_interestrate;
		this.styegeum_item_comment = styegeum_item_comment;
	}



	public String getY_item_no() {
		return y_item_no;
	}
	public void setY_item_no(String y_item_no) {
		this.y_item_no = y_item_no;
	}
	public String getYegeum_item_name() {
		return yegeum_item_name;
	}
	public void setYegeum_item_name(String yegeum_item_name) {
		this.yegeum_item_name = yegeum_item_name;
	}
	public String getYegeum_item_length() {
		return yegeum_item_length;
	}
	public void setYegeum_item_length(String yegeum_item_length) {
		this.yegeum_item_length = yegeum_item_length;
	}
	public int getYegeum_item_limitmoney() {
		return yegeum_item_limitmoney;
	}
	public void setYegeum_item_limitmoney(int yegeum_item_limitmoney) {
		this.yegeum_item_limitmoney = yegeum_item_limitmoney;
	}

	public double getYegeum_item_interestrate() {
		return yegeum_item_interestrate;
	}


	public void setYegeum_item_interestrate(double yegeum_item_interestrate) {
		this.yegeum_item_interestrate = yegeum_item_interestrate;
	}


	public String getStyegeum_item_comment() {
		return styegeum_item_comment;
	}


	public void setStyegeum_item_comment(String styegeum_item_comment) {
		this.styegeum_item_comment = styegeum_item_comment;
	}
	
	
	

}
