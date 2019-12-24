package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.model.AccountDTO;
import com.product.model.Y_itemDTO;
import com.util.JdbcUtil;

public class Y_itemDAO {
	
private static Y_itemDAO y_itemDao = null;
	
	private Y_itemDAO() {
	}

	public static Y_itemDAO getInstance() {
		if (y_itemDao == null) {
			y_itemDao = new Y_itemDAO();
		}
		return y_itemDao;
	}
	
	// 모든 상품 다 가져오기
	public List<Y_itemDTO> selectAll(Connection conn) {
		String sql = "select * from y_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Y_itemDTO> list = new ArrayList<Y_itemDTO>();
		Y_itemDTO y_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				y_itemDto = new Y_itemDTO(rs.getString("y_item_no")
						,rs.getString("yegeum_item_name")
						,rs.getString("yegeum_item_length")
						,rs.getInt("yegeum_item_limitmoney")
						,rs.getDouble("yegeum_item_interestrate")
						,rs.getString("yegeum_item_comment"));
				
				list.add(y_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("y_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		System.out.println("무사통과");
		return list;
		
	}

	public List<Y_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from y_item ";
		
		switch (searchCondition) {
		case 1 :	
			sql+= " where regexp_like(yegeum_item_name, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(yegeum_item_comment, ? ,'i') ";
			break;
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Y_itemDTO> list = new ArrayList<Y_itemDTO>();
		Y_itemDTO y_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				y_itemDto = new Y_itemDTO(rs.getString("y_item_no")
						,rs.getString("yegeum_item_name")
						,rs.getString("yegeum_item_length")
						,rs.getInt("yegeum_item_limitmoney")
						,rs.getDouble("yegeum_item_interestrate")
						,rs.getString("yegeum_item_comment"));
				
				list.add(y_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("y_itemDAO selectSeartch 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		System.out.println("무사통과");
		return list;
	}
	
	

}
