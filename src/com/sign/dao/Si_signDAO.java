package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sign.model.Li_signDTO;
import com.sign.model.Si_signDTO;
import com.util.JdbcUtil;

public class Si_signDAO {
	
	
private static Si_signDAO si_signDAO = null;
	
	private Si_signDAO() {
	}

	public static Si_signDAO getInstance() {
		if (si_signDAO == null) {
			si_signDAO = new Si_signDAO();
		}
		return si_signDAO;
	}

	public List<Si_signDTO> selectAll(Connection conn) {
		String sql = "select * from si_sign ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Si_signDTO> list = new ArrayList<Si_signDTO>();
		Si_signDTO si_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				si_signDto = new Si_signDTO(rs.getString("si_sign_no")
											,rs.getString("s_item_no")
											,rs.getString("u_info_no")
											,rs.getString("account_no")
											,rs.getString("i_type_no")
											,rs.getString("ps_type_no"));
				list.add(si_signDto);
			}
		} catch (SQLException e) {
			System.out.println("si_signDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		return list;
	}


}
