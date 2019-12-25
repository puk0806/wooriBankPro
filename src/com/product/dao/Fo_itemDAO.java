package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.product.model.Fo_itemDTO;
import com.product.model.Y_itemDTO;
import com.util.JdbcUtil;

public class Fo_itemDAO {
	
private static Fo_itemDAO fo_itemDao = null;
	
	private Fo_itemDAO() {
	}

	public static Fo_itemDAO getInstance() {
		if (fo_itemDao == null) {
			fo_itemDao = new Fo_itemDAO();
		}
		return fo_itemDao;
	}

	public List<Fo_itemDTO> selectAll(Connection conn) {
		String sql = "select * from fo_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Fo_itemDTO> list = new ArrayList<Fo_itemDTO>();
		Fo_itemDTO fo_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				fo_itemDto = new Fo_itemDTO(rs.getString("fo_item_no")
						,rs.getString("foreign_item_name")
						,rs.getDouble("foreign_item_sign_money")
						,rs.getString("foreign_item_comment")
						,rs.getString("foreign_item_endday"));
				
				list.add(fo_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("fo_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public List<Fo_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from fo_item ";
		switch (searchCondition) {
		case 1 :	
			sql+= " where regexp_like(foreign_item_name, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(foreign_item_comment, ? ,'i') ";
			break;
		}
		
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;
		
		ArrayList<Fo_itemDTO> list = new ArrayList<Fo_itemDTO>();
		Fo_itemDTO fo_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				fo_itemDto = new Fo_itemDTO(rs.getString("fo_item_no")
						,rs.getString("foreign_item_name")
						,rs.getDouble("foreign_item_sign_money")
						,rs.getString("foreign_item_comment")
						,rs.getString("foreign_item_endday"));
				
				list.add(fo_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("fo_itemDAO selectSearch예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public void insertProduct(Connection conn, String foreign_item_name, Double foreign_item_sign_money,
			String foreign_item_comment, String foreign_item_endday) {

		String sql = "insert into fo_item values('FI'||seq_fo_item.nextval,?,?,?,?) ";
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setDouble(1, foreign_item_sign_money);
			pstmt.setString(2, foreign_item_comment);
			pstmt.setString(3, foreign_item_endday);
			pstmt.setString(4, foreign_item_name);

			pstmt.executeUpdate();
	
		} catch (SQLException e) {
			System.out.println("fo_itemDAO isnertProduct예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}

	

}
