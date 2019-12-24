package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.A_detailDAO;
import com.product.model.Fo_itemDTO;
import com.sign.model.Foi_signDTO;
import com.util.JdbcUtil;

public class Foi_signDAO {
	
	private static Foi_signDAO foi_signDAO = null;
	
	private Foi_signDAO() {
	}

	public static Foi_signDAO getInstance() {
		if (foi_signDAO == null) {
			foi_signDAO = new Foi_signDAO();
		}
		return foi_signDAO;
	}

	public List<Foi_signDTO> selectAll(Connection conn) {
		String sql = "select * from foi_sign ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Foi_signDTO> list = new ArrayList<Foi_signDTO>();
		Foi_signDTO foi_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				foi_signDto = new Foi_signDTO(rs.getString("foi_sign_no")
											,rs.getString("u_info_no")
											,rs.getString("account_no")
											,rs.getString("fo_item_no")
											,rs.getString("i_type_no")
											,rs.getString("ps_type_no")
											,rs.getString("currency_no"));
				list.add(foi_signDto);
			}
		} catch (SQLException e) {
			System.out.println("Foi_signDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}
	
	

}
