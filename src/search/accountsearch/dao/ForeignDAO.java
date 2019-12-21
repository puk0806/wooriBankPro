package search.accountsearch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import search.accountsearch.model.ForeignDTO;

public class ForeignDAO {
	
private static ForeignDAO foreignDao = null;
	
	private ForeignDAO() {}
	
	public static ForeignDAO getInstance() { 
		if(foreignDao==null) {
			foreignDao = new ForeignDAO();
		}
		return foreignDao;
	}
	
	public List<ForeignDTO> selectList(Connection conn,String user_id){
		String account_testno = "UI1000";		// 아이디 수정 요망
		String sql = "select account_no,account_number,account_yegeum_name,account_create_date "
					+"from account "
					+"where a_type_no='AT1006' and  u_info_no =  ?";
		PreparedStatement pstmt_ac= null;
		PreparedStatement pstmt_ad = null;
		PreparedStatement pstmt_fd = null;
		ResultSet rs_ac = null;
		ResultSet rs_ad = null;
		ResultSet rs_fd = null; 
		
		
		ArrayList<ForeignDTO> list = new ArrayList<ForeignDTO>();
		
		try {
			pstmt_ac = conn.prepareStatement(sql);
			pstmt_ac.setString(1, account_testno);
			rs_ac = pstmt_ac.executeQuery();
			ForeignDTO dto = null;
			while(rs_ac.next()){
				dto = new ForeignDTO();
				
				dto.setUser_name("세션이용");
				dto.setAccount_no(rs_ac.getString("account_no"));
				dto.setAccount_number(rs_ac.getString("account_number"));
				dto.setAccount_yegeum_name(rs_ac.getString("account_yegeum_name"));
				dto.setAccount_create_date(rs_ac.getDate("account_create_date"));
				
				sql = "select  account_trans_date,account_current_money "
						+"from( "
						+"select account_trans_date,account_current_money "
						+"from a_detail "
						+"where account_no= ? "
						+"order by rownum desc) "
						+"where rownum = 1 ";
			
				pstmt_ad = conn.prepareStatement(sql);
				pstmt_ad.setString(1, dto.getAccount_no());
				rs_ad = pstmt_ad.executeQuery();
				
				while(rs_ad.next()) {
					
					dto.setAccount_trans_date(rs_ad.getDate("account_trans_date"));
					dto.setAccount_current_money(rs_ad.getInt("account_current_money"));
				}
				
				sql = "select * " + 
						"from fos_detail " + 
						"where foi_sign_no = " + 
						"    (select foi_sign_no " + 
						"    from foi_sign " + 
						"    where u_info_no = ? and account_no = ? )";
				pstmt_fd = conn.prepareStatement(sql);
				pstmt_fd.setString(1, account_testno);
				pstmt_fd.setString(2, dto.getAccount_no());
				rs_fd = pstmt_fd.executeQuery();
				
				while(rs_fd.next()) {
					dto.setCurrency_no(rs_fd.getString("currency_no"));
					dto.setCurrent_money(rs_fd.getDouble("current_money"));
					dto.setL_bank_no(rs_fd.getString("l_bank_no"));
					dto.setEndday_process(rs_fd.getString("endday_process"));
					dto.setAccident_content(rs_fd.getString("accident_content"));
					dto.setRenewal_date(rs_fd.getDate("renewal_date"));
					dto.setFos_comment(rs_fd.getString("fos_comment"));
					
				}
				
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("foreignDAO selectList예외 발생");
			e.printStackTrace();
		}finally {
				try {
					if(rs_ad != null) rs_ad.close();
					if(rs_ac != null) rs_ac.close();
					if(rs_fd != null) rs_fd.close();
					if(pstmt_ad != null) pstmt_ad.close();
					if(pstmt_ac != null) pstmt_ac.close();
					if(pstmt_fd != null) pstmt_fd.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}

}
