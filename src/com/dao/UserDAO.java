package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.UserDTO;
import com.util.JdbcUtil;

import search.accountsearch.dao.SearchDAO;

public class UserDAO {
	

	private static UserDAO userDao = null;

	private UserDAO() {
	}

	public static UserDAO getInstance() {
		if (userDao == null) {
			userDao = new UserDAO();
		}
		return userDao;
	}
	
	
	
	// 유저 코드로 유저 얻기
	public UserDTO selectById(Connection conn,String user_id ) {
		String sql = "select * "
						+"from u_info "
						+"where user_id =  ? ";
		UserDTO userdto = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				userdto = new UserDTO(rs.getString("u_info_no")
									,rs.getString("s_addr_no")
									,rs.getString("c_grade_no")
									,rs.getString("u_grade_no")
									,rs.getString("country_no")
									,rs.getString("work_no")
									,rs.getString("user_name")
									,rs.getString("user_rrn")
									,rs.getString("user_phone")
									,rs.getString("user_email")
									,rs.getString("user_id")
									,rs.getString("user_pwd")
									,rs.getString("user_addr")
									,rs.getDate("user_sign_date")
									,rs.getInt("user_receive_sms")
									,rs.getInt("user_receive_email")
									,rs.getInt("user_receive_phone"));
			}
			// return userdto;		예외 처리 안에 해서 
		} catch (SQLException e) {
			System.out.println("UserDAO selectById 예외 발생");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return userdto;
	}

	// 모든 유저 가져오기
	public List<UserDTO> selectAll(Connection conn) {
		
		String sql = "select * from u_info ";
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		UserDTO userDto = null;
		UserDAO userDao = UserDAO.getInstance();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				
				userDto = userDao.selectById(conn, rs.getString("user_id"));
				
				list.add(userDto);
			}
		} catch (SQLException e) {
			System.out.println("UserDAO slectAll 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return list;
	}
	
	// 이름, 주민번호로 유저 정보 가져오기
	public UserDTO selectByName_ByRrn(Connection conn,String user_name,String user_rrn ) {
		String sql = "select * " + 
				"from u_info " + 
				"where user_name = ? and user_rrn= ? ";
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		
		UserDTO userDto = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_name);
			pstmt.setString(2, user_rrn);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				userDto = new UserDTO(rs.getString("u_info_no")
						,rs.getString("s_addr_no")
						,rs.getString("c_grade_no")
						,rs.getString("u_grade_no")
						,rs.getString("country_no")
						,rs.getString("work_no")
						,rs.getString("user_name")
						,rs.getString("user_rrn")
						,rs.getString("user_phone")
						,rs.getString("user_email")
						,rs.getString("user_id")
						,rs.getString("user_pwd")
						,rs.getString("user_addr")
						,rs.getDate("user_sign_date")
						,rs.getInt("user_receive_sms")
						,rs.getInt("user_receive_email")
						,rs.getInt("user_receive_phone"));
			}
			
		} catch (SQLException e) {
			System.out.println("UserDAO selectByNameByRrn 예외");
			e.printStackTrace();
		}
		
		return userDto;
	}
	
	
	

}
