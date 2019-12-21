package search.accountsearch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import search.accountsearch.model.FundDTO;

public class FundDAO {
	

	private static FundDAO fundDao = null;
	
	private FundDAO() {}
	
	public static FundDAO getInstance() { 
		if(fundDao==null) {
			fundDao = new FundDAO();
		}
		return fundDao;
	}
	
	public List<FundDTO> selectList(Connection conn,String user_id){
		String account_testno = "UI1000";		// 아이디 수정 요망
		String sql = "select account_no,account_number,account_yegeum_name,account_create_date "
					+"from account "
					+"where a_type_no='AT1003' and  u_info_no =  ?";
		PreparedStatement pstmt_ac= null;
		PreparedStatement pstmt_ad = null;
		PreparedStatement pstmt_fd = null;
		ResultSet rs_ac = null;
		ResultSet rs_ad = null;
		ResultSet rs_fd = null;
		
		
		ArrayList<FundDTO> list = new ArrayList<FundDTO>();
		
		try {
			pstmt_ac = conn.prepareStatement(sql);
			pstmt_ac.setString(1, account_testno);
			rs_ac = pstmt_ac.executeQuery();
			FundDTO dto = null;
			while(rs_ac.next()){
				dto = new FundDTO();
				
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
				pstmt_ad.setString(1, rs_ac.getString("account_no"));
				rs_ad = pstmt_ad.executeQuery();
				
				while(rs_ad.next()) {
					
					dto.setAccount_trans_date(rs_ad.getDate("account_trans_date"));
					dto.setAccount_current_money(rs_ad.getInt("account_current_money"));
				}
				
				sql = "select * " + 
						"from fus_detail " + 
						"where fui_sign_no = " + 
						"    (select fui_sign_no " + 
						"    from fui_sign " + 
						"    where u_info_no = ? and account_no = ?) ";
				pstmt_fd = conn.prepareStatement(sql);
				pstmt_fd.setString(1, account_testno);
				pstmt_fd.setString(2,dto.getAccount_no());
				rs_fd = pstmt_fd.executeQuery();
				
				while(rs_fd.next()) { 
					dto.setFund_item_sign_money(rs_fd.getInt("fund_item_sign_money"));
					dto.setInvestment_profit(rs_fd.getDouble("investment_profit"));
					dto.setL_bank_no(rs_fd.getString("l_bank_no"));
					dto.setStandard_price(rs_fd.getDouble("standard_price"));
					dto.setAccount_balance(rs_fd.getInt("account_balance"));
					dto.setTrust_company(rs_fd.getString("trust_company"));
					
				}
				
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("fundDAO selectList예외 발생");
			e.printStackTrace();
		}finally {
				try {
					if(rs_ad != null) rs_ad.close();
					if(rs_ac != null) rs_ac.close();
					if(rs_fd != null) rs_fd.close();
					if(pstmt_ad != null) pstmt_ad.close();
					if(pstmt_ac != null) pstmt_ac.close();
					if(pstmt_fd != null ) pstmt_fd.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}

}
