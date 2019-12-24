package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sign.model.Fui_signDTO;
import com.sign.model.Gi_signDTO;
import com.util.JdbcUtil;

public class Gi_signDAO {
	
	
private static Gi_signDAO gi_signDAO = null;
	
	private Gi_signDAO() {
	}

	public static Gi_signDAO getInstance() {
		if (gi_signDAO == null) {
			gi_signDAO = new Gi_signDAO();
		}
		return gi_signDAO;
	}

	public List<Gi_signDTO> selectAll(Connection conn) {
		String sql = "select * from gi_sign ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Gi_signDTO> list = new ArrayList<Gi_signDTO>();
		Gi_signDTO gi_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				gi_signDto = new Gi_signDTO(rs.getString("gi_sign_no")
											,rs.getString("u_info_no")
											,rs.getString("account_no")
											,rs.getString("g_item_no")
											,rs.getString("i_type_no")
											,rs.getString("ps_type_no")
											,rs.getString("currency_no")
											,rs.getString("ses_type_no")
											,rs.getString("ea_type_no")
											,rs.getString("employee_no"));
				list.add(gi_signDto);
			}
		} catch (SQLException e) {
			System.out.println("gi_signDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return list;
	}

}
