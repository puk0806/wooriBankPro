package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.product.model.I_itemDTO;
import com.product.model.L_itemDTO;
import com.util.JdbcUtil;

public class L_itemDAO {
	
private static L_itemDAO l_itemDao = null;
	
	private L_itemDAO() {
	}

	public static L_itemDAO getInstance() {
		if (l_itemDao == null) {
			l_itemDao = new L_itemDAO();
		}
		return l_itemDao;
	}

	public List<L_itemDTO> selectAll(Connection conn) {
		String sql = "select * from l_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<L_itemDTO> list = new ArrayList<L_itemDTO>();
		L_itemDTO l_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				l_itemDto = new L_itemDTO(rs.getString("l_item_no")
										,rs.getString("li_type_no")
										,rs.getString("loan_item_comment")
										,rs.getString("loan_item_length")
										,rs.getInt("loan_item_limitmoney"));
				list.add(l_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("L_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public List<L_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from l_item ";
		switch (searchCondition) {
		case 1 :	
			sql+= " where regexp_like(loan_item_comment, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(loan_item_comment, ? ,'i') ";
			break;
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<L_itemDTO> list = new ArrayList<L_itemDTO>();
		L_itemDTO l_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				l_itemDto = new L_itemDTO(rs.getString("l_item_no")
										,rs.getString("li_type_no")
										,rs.getString("loan_item_comment")
										,rs.getString("loan_item_length")
										,rs.getInt("loan_item_limitmoney"));
				list.add(l_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("L_itemDAO selectSearch예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public void insertProduct(Connection conn, String li_type_no, String loan_item_comment, String loan_item_length,
			int loan_item_limitmoney) {
		String sql = "insert into l_item values('LI'||seq_l_item.nextval, ? , ? , ? , ? ) ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, li_type_no);
			pstmt.setString(2, loan_item_comment);
			pstmt.setString(3, loan_item_length);
			pstmt.setInt(4, loan_item_limitmoney);
			pstmt.executeUpdate();
	
		} catch (SQLException e) {
			System.out.println("y_itemDAO isnertProduct예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
			
		
	}
	
	

}
