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
	
	private static AccountDAO accountDao = null;
	
	private AccountDAO() {
	}

	public static AccountDAO getInstance() {
		if (accountDao == null) {
			accountDao = new AccountDAO();
		}
		return accountDao;
	}
	
	// 모든 계좌 다 가져오기
	public List<AccountDTO> selectAll(Connection conn){
		String sql = "select * from account ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
		AccountDTO accountDto = null;
		AccountDAO accountDao = AccountDAO.getInstance();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				accountDto = accountDao.selectByNo(conn, rs.getString("account_no"));
				list.add(accountDto);
			}
			
		} catch (SQLException e) {
			System.out.println("AccountDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
		
	}
	
	
	
	
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
									, rs.getString("u_info_no")
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
				accountDto = new AccountDTO(rs.getString("account_no")
						, rs.getString("u_info_no")
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
	
	// 계좌코드로 계좌 정보 얻어오기 
		public AccountDTO selectByNo(Connection conn, String account_no){
			
			String sql = "select * "
					+"from account "
					+"where account_no =  ? ";
			
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			AccountDTO accountDto = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, account_no);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					accountDto = new AccountDTO(rs.getString("account_no")
							, rs.getString("u_info_no")
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

		public AccountDTO selectByNumber(Connection conn, String account_number) {
			String sql = "select * "
					+"from account "
					+"where account_number =  ? ";
			
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			AccountDTO accountDto = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, account_number);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					accountDto = new AccountDTO(rs.getString("account_no")
							, rs.getString("u_info_no")
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

		public List<AccountDTO> selectByUser_name(Connection conn, String user_name) {
			String sql = "select * " + 
						"from account " + 
						"where u_info_no = " + 
						"    (select u_info_no " + 
						"    from u_info " + 
						"    where user_name =  ? ) ";
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user_name);
				rs = pstmt.executeQuery();
				
				AccountDTO accountDto = null;
				while(rs.next()) {
					accountDto = new AccountDTO(rs.getString("account_no")
										, rs.getString("u_info_no")
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
					list.add(accountDto);
				}			
			} catch (SQLException e) {
				System.out.println("AccountDAO selectByUser_name 예외");
				e.printStackTrace();
			}finally {
				JdbcUtil.close(rs);
				JdbcUtil.close(pstmt);
			}
			return  list;
		}

		public List<AccountDTO> selectByAccount_type(Connection conn, String account_type_name) {
			String sql = "select * " + 
					"from account " + 
					"where a_type_no = " + 
					"    (select a_type_no " + 
					"    from a_type " + 
					"    where account_type_name = ?) ";
			PreparedStatement pstmt = null;
			ResultSet rs= null;
			ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, account_type_name);
				rs = pstmt.executeQuery();
				
				AccountDTO accountDto = null;
				while(rs.next()) {
					accountDto = new AccountDTO(rs.getString("account_no")
										, rs.getString("u_info_no")
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
					list.add(accountDto);
				}			
			} catch (SQLException e) {
				System.out.println("AccountDAO selectByUser_name 예외");
				e.printStackTrace();
			}finally {
				JdbcUtil.close(rs);
				JdbcUtil.close(pstmt);
			}
			return  list;
		}

		public List<AccountDTO> selectByUser_name(Connection conn, String user_name, String user_rrn) {
			String sql = "select * " + 
					"from account " + 
					"where u_info_no = " + 
					"    (select u_info_no " + 
					"    from u_info " + 
					"    where user_name =  ? and user_rrn = ? ) ";
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		ArrayList<AccountDTO> list = new ArrayList<AccountDTO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_name);
			pstmt.setString(2, user_rrn);
			rs = pstmt.executeQuery();
			
			AccountDTO accountDto = null;
			while(rs.next()) {
				accountDto = new AccountDTO(rs.getString("account_no")
									, rs.getString("u_info_no")
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
				
				list.add(accountDto);
			}			
		} catch (SQLException e) {
			System.out.println("AccountDAO selectByUser_name 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return  list;
		}

}
