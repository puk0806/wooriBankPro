package com.sign.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sign.model.Gi_signDTO;
import com.sign.model.Ii_signDTO;
import com.util.JdbcUtil;

public class Ii_signDAO {
	
	
private static Ii_signDAO ii_signDAO = null;
	
	private Ii_signDAO() {
	}

	public static Ii_signDAO getInstance() {
		if (ii_signDAO == null) {
			ii_signDAO = new Ii_signDAO();
		}
		return ii_signDAO;
	}

	public List<Ii_signDTO> selectAll(Connection conn) {
		String sql = "select * from ii_sign ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Ii_signDTO> list = new ArrayList<Ii_signDTO>();
		Ii_signDTO ii_signDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				ii_signDto = new Ii_signDTO(rs.getString("ii_sign_no")
											,rs.getString("u_info_no")
											,rs.getString("account_no")
											,rs.getString("i_item_no")
											,rs.getString("i_type_no")
											,rs.getString("ps_type_no")
											,rs.getString("stock_number")
											,rs.getDate("insurence_sign_date")
											,rs.getInt("insurance_length")
											,rs.getInt("insurance_cycle"));
				list.add(ii_signDto);
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
