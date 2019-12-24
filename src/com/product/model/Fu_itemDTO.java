package com.product.model;

public class Fu_itemDTO {
	
	/* 펀드상품
	CREATE TABLE fu_item (
	   fu_item_no VARCHAR2(10) NOT NULL,	조회상품코드 
	   st_type_no VARCHAR2(20) NOT NULL, 	가입대상코드 
	   r_rate_no VARCHAR2(20) NOT NULL, 	위험등급코드 
	   fi_type_no VARCHAR2(20) NOT NULL, 	펀드상품유형코드 
	   fund_item_comment CLOB NOT NULL, 	상품설명 
	   fund_item_profitrate NUMBER 			예상수익률 
	);
	*/
	String fu_item_no; 				// 조회상품코드
	String st_type_no; 				// 가입대상코드
	String r_rate_no;				// 위험등급코드
	String fi_type_no;				// 펀드상품유형코드
	String fund_item_comment;		// 상품설명
	double fund_item_profitrate;	// 예상수익률
	
	public Fu_itemDTO() {
	}
	
	
	public Fu_itemDTO(String fu_item_no, String st_type_no, String r_rate_no, String fi_type_no,
			String fund_item_comment, double fund_item_profitrate) {
		this.fu_item_no = fu_item_no;
		this.st_type_no = st_type_no;
		this.r_rate_no = r_rate_no;
		this.fi_type_no = fi_type_no;
		this.fund_item_comment = fund_item_comment;
		this.fund_item_profitrate = fund_item_profitrate;
	}



	public String getFu_item_no() {
		return fu_item_no;
	}
	public void setFu_item_no(String fu_item_no) {
		this.fu_item_no = fu_item_no;
	}
	public String getSt_type_no() {
		return st_type_no;
	}
	public void setSt_type_no(String st_type_no) {
		this.st_type_no = st_type_no;
	}
	public String getR_rate_no() {
		return r_rate_no;
	}
	public void setR_rate_no(String r_rate_no) {
		this.r_rate_no = r_rate_no;
	}
	public String getFi_type_no() {
		return fi_type_no;
	}
	public void setFi_type_no(String fi_type_no) {
		this.fi_type_no = fi_type_no;
	}
	public String getFund_item_comment() {
		return fund_item_comment;
	}
	public void setFund_item_comment(String fund_item_comment) {
		this.fund_item_comment = fund_item_comment;
	}
	public double getFund_item_profitrate() {
		return fund_item_profitrate;
	}
	public void setFund_item_profitrate(double fund_item_profitrate) {
		this.fund_item_profitrate = fund_item_profitrate;
	}
	

}
