package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sign.model.Ii_signDTO;
import com.sign.model.Li_signDTO;
import com.util.JdbcUtil;

public class Li_signDAO {
	
	
private static Li_signDAO li_signDAO = null;
	
	private Li_signDAO() {
	}

	public static Li_signDAO getInstance() {
		if (li_signDAO == null) {
			li_signDAO = new Li_signDAO();
		}
		return li_signDAO;
	}

	public List<Li_signDTO> selectAll(Connection conn) {
		String sql = "select * from li_sign ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Li_signDTO> list = new ArrayList<Li_signDTO>();
		Li_signDTO li_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				li_signDto = new Li_signDTO(rs.getString("li_sign_no")
										,rs.getString("u_info_no")
										,rs.getString("account_no")
										,rs.getString("l_item_no")
										,rs.getString("i_type_no")
										,rs.getString("ps_type_no")
										,rs.getInt("loan_item_sign_money"));
				list.add(li_signDto);
			}
		} catch (SQLException e) {
			System.out.println("li_signDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return list;
	}
	

}
