package com.product.model;

public class L_itemDTO {
	
	/* 대출상품
	CREATE TABLE l_item (
	   l_item_no VARCHAR2(10) NOT NULL, 		대출상품코드 
	   li_type_no VARCHAR2(20) NOT NULL, 		대출종류코드
	   loan_item_comment CLOB NOT NULL, 		상품설명 
	   loan_item_length VARCHAR2(20) NOT NULL,	대출기간 
	   loan_item_limitmoney NUMBER NOT NULL		대출한도 
	);
	*/
	String l_item_no; // 대출상품코드
	String li_type_no; // 대출종류코드
	String loan_item_comment;// 상품설명
	String loan_item_length; // 대출기간
	int loan_item_limitmoney;// 대출한도
	
	public L_itemDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public L_itemDTO(String l_item_no, String li_type_no, String loan_item_comment, String loan_item_length,
			int loan_item_limitmoney) {
		this.l_item_no = l_item_no;
		this.li_type_no = li_type_no;
		this.loan_item_comment = loan_item_comment;
		this.loan_item_length = loan_item_length;
		this.loan_item_limitmoney = loan_item_limitmoney;
	}



	public String getL_item_no() {
		return l_item_no;
	}
	public void setL_item_no(String l_item_no) {
		this.l_item_no = l_item_no;
	}
	public String getLi_type_no() {
		return li_type_no;
	}
	public void setLi_type_no(String li_type_no) {
		this.li_type_no = li_type_no;
	}
	public String getLoan_item_comment() {
		return loan_item_comment;
	}
	public void setLoan_item_comment(String loan_item_comment) {
		this.loan_item_comment = loan_item_comment;
	}
	public String getLoan_item_length() {
		return loan_item_length;
	}
	public void setLoan_item_length(String loan_item_length) {
		this.loan_item_length = loan_item_length;
	}
	public int getLoan_item_limitmoney() {
		return loan_item_limitmoney;
	}
	public void setLoan_item_limitmoney(int loan_item_limitmoney) {
		this.loan_item_limitmoney = loan_item_limitmoney;
	}

}
