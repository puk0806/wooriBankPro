package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.AccountDTO;
import com.util.JdbcUtil;

public class AccountDAO {
	
	// 유저 정보와, 상품유형으로 상품 유형에 관련된  계좌들 얻기
	public List<AccountDTO> selectById_ByType(Connection conn, String u_info_no, String a_type_no){
		String sql = "select * "
				+"from account "
				+"where u_info_no = ? and a_type_no =  ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_info_no);
			pstmt.setString(2, a_type_no);
			rs = pstmt.executeQuery();
			
			AccountDTO accountDto = null;
			while(rs.next()) {
				accountDto = new AccountDTO(rs.getString("account_no")
									, u_info_no
									, rs.getString("l_bank_no")
									, a_type_no
									, rs.getString("a_state_no")
									, rs.getString("currency_no")
									, rs.getString("account_number")
									, rs.getDate("account_create_date")
									, rs.getString("account_yegeum_name")
									, rs.getInt("account_limit")
									, rs.getInt("account_pwd")
									, rs.getString("account_nick"));
				list.add(accountDto);
			}			
		} catch (SQLException e) {
			System.out.println("AccountDAO selectByIdByType 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return  list;
	}
	
	// 유저 정보와 계좌코드로 계좌 정보 얻어오기 
	public AccountDTO selectById_ByNo(Connection conn, String u_info_no, String account_no){
		
		String sql = "select * "
				+"from account "
				+"where u_info_no = ? and account_no =  ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		AccountDTO accountDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, u_info_no);
			pstmt.setString(2, account_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				accountDto = new AccountDTO(account_no
						, u_info_no
						, rs.getString("l_bank_no")
						, rs.getString("a_type_no")
						, rs.getString("a_state_no")
						, rs.getString("currency_no")
						, rs.getString("account_number")
						, rs.getDate("account_create_date")
						, rs.getString("account_yegeum_name")
						, rs.getInt("account_limit")
						, rs.getInt("account_pwd")
						, rs.getString("account_nick"));
			}
		} catch (SQLException e) {
			System.out.println("AccountDAO selectById_ByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
			
		
		return accountDto;
	}
	
	

}
