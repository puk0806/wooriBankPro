package com.prodetail.model;

public class Yt_detailDTO {

	
	/* 예금/신탁가입상세
	CREATE TABLE yt_detail (
	   yt_detail_no VARCHAR2(10) NOT NULL,		NO 
	   yegeum_no VARCHAR2(10) NOT NULL,			예금/신탁상품가입코드 
	   account_no VARCHAR2(10) NOT NULL,		계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL,			지점코드 
	   p_set_no NUMBER NOT NULL,				질권설정코드 
	   remarks_no VARCHAR2(20), 				특기사항코드 
	   yegeum_item_endday NUMBER, 				만기일 
	   yegeum_tiem_transmoney NUMBER NOT NULL	거래금액 
	);
	*/

	String yt_detail_no; // NO
	String yegeum_no; // 예금/신탁상품가입코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	int p_set_no; // 질권설정코드
	String remarks_no; // 특기사항코드
	int yegeum_item_endday; // 만기일
	int yegeum_tiem_transmoney; // 거래금액	
	public String getYt_detail_no() {
		return yt_detail_no;
	}
	public void setYt_detail_no(String yt_detail_no) {
		this.yt_detail_no = yt_detail_no;
	}
	public String getYegeum_no() {
		return yegeum_no;
	}
	public void setYegeum_no(String yegeum_no) {
		this.yegeum_no = yegeum_no;
	}
	public String getAccount_no() {
		return account_no;
	}
	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}
	public String getL_bank_no() {
		return l_bank_no;
	}
	public void setL_bank_no(String l_bank_no) {
		this.l_bank_no = l_bank_no;
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
	public int getYegeum_item_endday() {
		return yegeum_item_endday;
	}
	public void setYegeum_item_endday(int yegeum_item_endday) {
		this.yegeum_item_endday = yegeum_item_endday;
	}
	public int getYegeum_tiem_transmoney() {
		return yegeum_tiem_transmoney;
	}
	public void setYegeum_tiem_transmoney(int yegeum_tiem_transmoney) {
		this.yegeum_tiem_transmoney = yegeum_tiem_transmoney;
	}
		
}
