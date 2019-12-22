package com.prodetail.model;

import java.util.Date;

public class Ss_detailDTO {
	
	/* 적금가입상세
	CREATE TABLE ss_detail (
	   ss_detail_no VARCHAR2(10) NOT NULL, 				NO 
	   si_sign_no VARCHAR2(10) NOT NULL, 				적금상품가입코드 
	   account_no VARCHAR2(10) NOT NULL, 				계좌코드 
	   l_bank_no VARCHAR2(10) NOT NULL,					지점코드 
	   remarks_no VARCHAR2(20), 						특기사항코드 
	   p_set_no NUMBER NOT NULL, 						질권설정코드 
	   saving_sign_detail_enddate DATE NOT NULL, 		만기일 
	   saving_sign_detail_delaytime NUMBER, 			연체적립횟수 
	   contracted_price NUMBER NOT NULL, 				계약금액 
	   reserve_price NUMBER, 							1회적립금액 
	   tax_incentive_price NUMBER NOT NULL, 			세금우대적립목표금액 
	   tax_incentive_division VARCHAR2(20) NOT NULL, 	세금우대구분 
	   endday_process VARCHAR2(50) NOT NULL 	만기시처리방법 
	);
	*/

	String ss_detail_no; // NO
	String si_sign_no; // 적금상품가입코드
	String account_no; // 계좌코드
	String l_bank_no; // 지점코드
	String remarks_no; // 특기사항코드
	int p_set_no; // 질권설정코드
	Date saving_sign_detail_enddate; // 만기일
	int saving_sign_detail_delaytime; // 연체적립횟수
	int contracted_price; // 계약금액
	int reserve_price; // 1회적립금액
	int tax_incentive_price; // 세금우대적립목표금액
	String tax_incentive_division; // 세금우대구분
	String endday_process; // 만기시처리방법
	public String getSs_detail_no() {
		return ss_detail_no;
	}
	public void setSs_detail_no(String ss_detail_no) {
		this.ss_detail_no = ss_detail_no;
	}
	public String getSi_sign_no() {
		return si_sign_no;
	}
	public void setSi_sign_no(String si_sign_no) {
		this.si_sign_no = si_sign_no;
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
	public String getRemarks_no() {
		return remarks_no;
	}
	public void setRemarks_no(String remarks_no) {
		this.remarks_no = remarks_no;
	}
	public int getP_set_no() {
		return p_set_no;
	}
	public void setP_set_no(int p_set_no) {
		this.p_set_no = p_set_no;
	}
	public Date getSaving_sign_detail_enddate() {
		return saving_sign_detail_enddate;
	}
	public void setSaving_sign_detail_enddate(Date saving_sign_detail_enddate) {
		this.saving_sign_detail_enddate = saving_sign_detail_enddate;
	}
	public int getSaving_sign_detail_delaytime() {
		return saving_sign_detail_delaytime;
	}
	public void setSaving_sign_detail_delaytime(int saving_sign_detail_delaytime) {
		this.saving_sign_detail_delaytime = saving_sign_detail_delaytime;
	}
	public int getContracted_price() {
		return contracted_price;
	}
	public void setContracted_price(int contracted_price) {
		this.contracted_price = contracted_price;
	}
	public int getReserve_price() {
		return reserve_price;
	}
	public void setReserve_price(int reserve_price) {
		this.reserve_price = reserve_price;
	}
	public int getTax_incentive_price() {
		return tax_incentive_price;
	}
	public void setTax_incentive_price(int tax_incentive_price) {
		this.tax_incentive_price = tax_incentive_price;
	}
	public String getTax_incentive_division() {
		return tax_incentive_division;
	}
	public void setTax_incentive_division(String tax_incentive_division) {
		this.tax_incentive_division = tax_incentive_division;
	}
	public String getEndday_process() {
		return endday_process;
	}
	public void setEndday_process(String endday_process) {
		this.endday_process = endday_process;
	}
	
	

}
