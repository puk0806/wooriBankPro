package search.accountsearch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import search.accountsearch.model.DepositDTO;

public class DepositDAO {
	
	private static DepositDAO depositDao = null;
	
	private DepositDAO() {}
	
	public static DepositDAO getInstance() { 
		if(depositDao==null) {
			depositDao = new DepositDAO();
		}
		return depositDao;
	}
	
	
	public List<DepositDTO> selectList(Connection conn,String user_id){
		String account_testno = "UI1000";		// 아이디 수정 요망
		String sql = "select account_no,account_number,account_yegeum_name "
					+"from account "
					+"where a_type_no='AT1001' and  u_info_no =  ?";
		PreparedStatement pstmt_ac= null;
		PreparedStatement pstmt_ad = null;
		ResultSet rs_ac = null;
		ResultSet rs_ad = null;
		
		
		ArrayList<DepositDTO> list = new ArrayList<DepositDTO>();
		
		try {
			pstmt_ac = conn.prepareStatement(sql);
			pstmt_ac.setString(1, account_testno);
			rs_ac = pstmt_ac.executeQuery();
			DepositDTO dto = null;
			while(rs_ac.next()){
				dto = new DepositDTO();
				
				
				
				dto.setAccount_no(rs_ac.getString("account_no"));
				dto.setAccount_number(rs_ac.getString("account_number"));
				dto.setAccount_yegeum_name(rs_ac.getString("account_yegeum_name"));
				
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
				list.add(dto);
			}
		} catch (SQLException e) {
			System.out.println("depositDAO selectList예외 발생");
			e.printStackTrace();
		}finally {
				try {
					if(rs_ad != null) rs_ad.close();
					if(rs_ac != null) rs_ac.close();
					if(pstmt_ad != null) pstmt_ad.close();
					if(pstmt_ac != null) pstmt_ac.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
		return list;
	}

}
