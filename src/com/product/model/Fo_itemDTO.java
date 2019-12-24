package com.product.model;

public class Fo_itemDTO {
	
	/* 외화상품
	CREATE TABLE fo_item (
	   fo_item_no VARCHAR2(20) NOT NULL, 		외화상품코드
	   foreign_item_sign_money NUMBER NOT NULL, 가입금액 
	   foreign_item_comment CLOB NOT NULL, 		상품설명 
	   foreign_item_endday VARCHAR2(20) 		만기기간 
	);
	*/
	String fo_item_no; 				// 외화상품코드
	double foreign_item_sign_money; 	// 가입금액
	String foreign_item_comment; 	// 상품설명
	String foreign_item_endday; 	// 만기기간	
	
	public Fo_itemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Fo_itemDTO(String fo_item_no, double foreign_item_sign_money, String foreign_item_comment,
			String foreign_item_endday) {
		this.fo_item_no = fo_item_no;
		this.foreign_item_sign_money = foreign_item_sign_money;
		this.foreign_item_comment = foreign_item_comment;
		this.foreign_item_endday = foreign_item_endday;
	}



	public String getFo_item_no() {
		return fo_item_no;
	}
	public void setFo_item_no(String fo_item_no) {
		this.fo_item_no = fo_item_no;
	}
	
	public double getForeign_item_sign_money() {
		return foreign_item_sign_money;
	}
	public void setForeign_item_sign_money(double foreign_item_sign_money) {
		this.foreign_item_sign_money = foreign_item_sign_money;
	}
	public String getForeign_item_comment() {
		return foreign_item_comment;
	}
	public void setForeign_item_comment(String foreign_item_comment) {
		this.foreign_item_comment = foreign_item_comment;
	}
	public String getForeign_item_endday() {
		return foreign_item_endday;
	}
	public void setForeign_item_endday(String foreign_item_endday) {
		this.foreign_item_endday = foreign_item_endday;
	}

	
}
