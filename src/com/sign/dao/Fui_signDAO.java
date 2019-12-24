package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sign.model.Foi_signDTO;
import com.sign.model.Fui_signDTO;
import com.util.JdbcUtil;

public class Fui_signDAO {
	
private static Fui_signDAO fui_signDAO = null;
	
	private Fui_signDAO() {
	}

	public static Fui_signDAO getInstance() {
		if (fui_signDAO == null) {
			fui_signDAO = new Fui_signDAO();
		}
		return fui_signDAO;
	}

	public List<Fui_signDTO> selectAll(Connection conn) {
		String sql = "select * from fui_sign ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Fui_signDTO> list = new ArrayList<Fui_signDTO>();
		Fui_signDTO fui_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				fui_signDto = new Fui_signDTO(rs.getString("fui_sign_no")
											,rs.getString("u_info_no")
											,rs.getString("account_no")
											,rs.getString("fu_item_no")
											,rs.getString("i_type_no")
											,rs.getString("ps_type_no")
											,rs.getString("payment_no"));
				list.add(fui_signDto);
			}
		} catch (SQLException e) {
			System.out.println("Fui_signDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

}
