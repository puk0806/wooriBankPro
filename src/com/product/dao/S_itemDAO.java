package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.product.model.L_itemDTO;
import com.product.model.S_itemDTO;
import com.util.JdbcUtil;

public class S_itemDAO {
	
private static S_itemDAO s_itemDao = null;
	
	private S_itemDAO() {
	}

	public static S_itemDAO getInstance() {
		if (s_itemDao == null) {
			s_itemDao = new S_itemDAO();
		}
		return s_itemDao;
	}

	public List<S_itemDTO> selectAll(Connection conn) {
		String sql = "select * from s_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<S_itemDTO> list = new ArrayList<S_itemDTO>();
		S_itemDTO s_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				s_itemDto = new S_itemDTO(rs.getString("s_item_no")
										,rs.getString("st_type_no")
										,rs.getString("saving_item_name")
										,rs.getInt("saving_item_maxmoney")
										,rs.getInt("saving_item_endrate")
										,rs.getInt("saving_item_cancelrate")
										,rs.getString("savings_item_length")
										,rs.getString("savings_item_comment"));
				list.add(s_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("S_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public List<S_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from s_item ";
		switch (searchCondition) {
		case 1 :	
			sql+= " where regexp_like(saving_item_name, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(savings_item_comment, ? ,'i') ";
			break;
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<S_itemDTO> list = new ArrayList<S_itemDTO>();
		S_itemDTO s_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				s_itemDto = new S_itemDTO(rs.getString("s_item_no")
										,rs.getString("st_type_no")
										,rs.getString("saving_item_name")
										,rs.getInt("saving_item_maxmoney")
										,rs.getInt("saving_item_endrate")
										,rs.getInt("saving_item_cancelrate")
										,rs.getString("savings_item_length")
										,rs.getString("savings_item_comment"));
				list.add(s_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("S_itemDAO selectSearch예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}
	
	

}
