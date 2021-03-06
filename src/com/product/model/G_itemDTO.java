package com.product.model;

public class G_itemDTO {
	
	/* 골드상품
	CREATE TABLE g_item (
	   g_item_no VARCHAR2(10) NOT NULL, 	골드상품코드 
	   gold_item_comment CLOB NOT NULL, 	상품설명 
	   gold_item_transunit NUMBER NOT NULL 	거래단위 
	);
	*/
	
	String g_item_no; 			// 골드상품코드
	String g_item_name;			// 골드상품명 
	String gold_item_comment; 	// 상품설명
	double gold_item_transunit; // 거래단위	
	
	public G_itemDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public G_itemDTO(String g_item_no, String g_item_name, String gold_item_comment, double gold_item_transunit) {
		super();
		this.g_item_no = g_item_no;
		this.g_item_name = g_item_name;
		this.gold_item_comment = gold_item_comment;
		this.gold_item_transunit = gold_item_transunit;
	}



	public String getG_item_no() {
		return g_item_no;
	}
	public void setG_item_no(String g_item_no) {
		this.g_item_no = g_item_no;
	}
	public String getGold_item_comment() {
		return gold_item_comment;
	}
	public void setGold_item_comment(String gold_item_comment) {
		this.gold_item_comment = gold_item_comment;
	}
	public double getGold_item_transunit() {
		return gold_item_transunit;
	}
	public void setGold_item_transunit(double gold_item_transunit) {
		this.gold_item_transunit = gold_item_transunit;
	}

	public String getG_item_name() {
		return g_item_name;
	}

	public void setG_item_name(String g_item_name) {
		this.g_item_name = g_item_name;
	}
	
}
