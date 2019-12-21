package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.A_detailDTO;
import com.model.UserDTO;
import com.util.JdbcUtil;

public class A_detailDAO {

	public A_detailDTO selectByNo(Connection conn,String account_no ) {
		System.out.println("account no : "+account_no);
		
		String sql = "select * " + 
				"from a_detail " + 
				"where account_no = ? ";
		
		A_detailDTO a_detailDTO = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account_no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				a_detailDTO = new A_detailDTO(rs.getString("a_detail_no")
											,rs.getString("account_no")
											,rs.getString("u_info_no")
											,rs.getString("t_method_no")
											,rs.getInt("account_trans_money")
											,rs.getDate("account_trans_date")
											,rs.getInt("account_current_money"));
			}
			
		} catch (SQLException e) {
			System.out.println("A_detialDAO seleceByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return a_detailDTO;
	}
	
	
}
