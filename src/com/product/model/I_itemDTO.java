package com.product.model;

public class I_itemDTO {
	
	/* 보험상품
	CREATE TABLE i_item (
	   i_item_no VARCHAR2(10) NOT NULL, 		보험상품코드 
	   i_company_no VARCHAR2(20) NOT NULL, 		보험사코드 
	   insurance_item_commnet CLOB NOT NULL, 	상품설명 
	   insurance_item_name VARCHAR2(30) NOT NULL,보험상품명 
	   insurance_item_length NUMBER NOT NULL 	보험기간 
	);
	*/

	String i_item_no; 				// 보험상품코드
	String i_company_no; 			// 보험사코드
	String insurance_item_commnet; 	// 상품설명
	String insurance_item_name; 	// 보험상품명
	int insurance_item_length; 		// 보험기간	
	public String getI_item_no() {
		return i_item_no;
	}
	public void setI_item_no(String i_item_no) {
		this.i_item_no = i_item_no;
	}
	public String getI_company_no() {
		return i_company_no;
	}
	public void setI_company_no(String i_company_no) {
		this.i_company_no = i_company_no;
	}
	public String getInsurance_item_commnet() {
		return insurance_item_commnet;
	}
	public void setInsurance_item_commnet(String insurance_item_commnet) {
		this.insurance_item_commnet = insurance_item_commnet;
	}
	public String getInsurance_item_name() {
		return insurance_item_name;
	}
	public void setInsurance_item_name(String insurance_item_name) {
		this.insurance_item_name = insurance_item_name;
	}
	public int getInsurance_item_length() {
		return insurance_item_length;
	}
	public void setInsurance_item_length(int insurance_item_length) {
		this.insurance_item_length = insurance_item_length;
	}
	
	


}
