package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sign.model.Si_signDTO;
import com.sign.model.Y_signDTO;
import com.util.JdbcUtil;

public class Y_signDAO {
	
	
private static Y_signDAO y_signDAO = null;
	
	private Y_signDAO() {
	}

	public static Y_signDAO getInstance() {
		if (y_signDAO == null) {
			y_signDAO = new Y_signDAO();
		}
		return y_signDAO;
	}

	public List<Y_signDTO> selectAll(Connection conn) {
		String sql = "select * from yegeum ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Y_signDTO> list = new ArrayList<Y_signDTO>();
		Y_signDTO y_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				y_signDto = new Y_signDTO(rs.getString("yegeum_no")
										,rs.getString("u_info_no")
										,rs.getString("account_no")
										,rs.getString("y_item_no")
										,rs.getString("i_type_no")
										,rs.getString("ps_type_no")
										,rs.getString("t_type_no")
										,rs.getString("et_type_no")
										,rs.getString("employee_no")
										,rs.getString("sb_type_no")
										,rs.getString("ses_type_no")
										,rs.getString("interest_pay_method"));
				list.add(y_signDto);
			}
		} catch (SQLException e) {
			System.out.println("Y_signDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return list;
	}


}
