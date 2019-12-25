package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.product.model.G_itemDTO;
import com.product.model.I_itemDTO;
import com.util.JdbcUtil;

public class I_itemDAO {
	
private static I_itemDAO i_itemDao = null;
	
	private I_itemDAO() {
	}

	public static I_itemDAO getInstance() {
		if (i_itemDao == null) {
			i_itemDao = new I_itemDAO();
		}
		return i_itemDao;
	}

	public List<I_itemDTO> selectAll(Connection conn) {
		String sql = "select * from i_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<I_itemDTO> list = new ArrayList<I_itemDTO>();
		I_itemDTO i_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				i_itemDto = new I_itemDTO(rs.getString("i_item_no")
										,rs.getString("i_company_no")
										,rs.getString("insurance_item_commnet")
										,rs.getString("insurance_item_name")
										,rs.getInt("insurance_item_length"));
				
				list.add(i_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("I_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public List<I_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from i_item ";
		switch (searchCondition) {
		case 1 :	
			sql+= " where regexp_like(insurance_item_name, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(insurance_item_comment, ? ,'i') ";
			break;
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<I_itemDTO> list = new ArrayList<I_itemDTO>();
		I_itemDTO i_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				i_itemDto = new I_itemDTO(rs.getString("i_item_no")
										,rs.getString("i_company_no")
										,rs.getString("insurance_item_commnet")
										,rs.getString("insurance_item_name")
										,rs.getInt("insurance_item_length"));
				
				list.add(i_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("I_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public void insertProduct(Connection conn, String i_company_no, String insurance_item_name,
			String insurance_item_commnet, int insurance_item_length) {
		String sql = "insert into i_item values('IT'||seq_i_item.nextval, ? , ? , ? , ? ) ";
PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, i_company_no);
			pstmt.setString(2, insurance_item_commnet);
			pstmt.setString(3, insurance_item_name);
			pstmt.setInt(4, insurance_item_length);

			pstmt.executeUpdate();
	
		} catch (SQLException e) {
			System.out.println("y_itemDAO isnertProduct예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}
	
	

}
