package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.UserDTO;
import com.util.JdbcUtil;

public class UserDAO {
	
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
	
	
	

}
