package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.product.model.Fu_itemDTO;
import com.product.model.G_itemDTO;
import com.util.JdbcUtil;

public class G_itemDAO {
	
private static G_itemDAO g_itemDao = null;
	
	private G_itemDAO() {
	}

	public static G_itemDAO getInstance() {
		if (g_itemDao == null) {
			g_itemDao = new G_itemDAO();
		}
		return g_itemDao;
	}

	public List<G_itemDTO> selectAll(Connection conn) {
		String sql = "select * from g_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<G_itemDTO> list = new ArrayList<G_itemDTO>();
		G_itemDTO g_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				g_itemDto = new G_itemDTO(rs.getString("g_item_no")
										,rs.getString("g_item_name")
										,rs.getString("gold_item_comment")
										,rs.getDouble("gold_item_transunit"));
				
				list.add(g_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("G_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public List<G_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from g_item ";
		switch (searchCondition) {
		case 1 :	
			sql+= " where regexp_like(g_item_name, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(gold_item_comment, ? ,'i') ";
			break;
		}
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<G_itemDTO> list = new ArrayList<G_itemDTO>();
		G_itemDTO g_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				g_itemDto = new G_itemDTO(rs.getString("g_item_no")
										,rs.getString("g_item_name")
										,rs.getString("gold_item_comment")
										,rs.getDouble("gold_item_transunit"));
				
				list.add(g_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("G_itemDAO selectSearch예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public void insertProduct(Connection conn, String g_item_name, String gold_item_comment,
			Double gold_item_transunit) {
		String sql = "insert into g_item values('GI'||seq_g_item.nextval, ? , ? , ? ) ";
		
PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gold_item_comment);
			pstmt.setDouble(2, gold_item_transunit);
			pstmt.setString(3, g_item_name);

			pstmt.executeUpdate();
	
		} catch (SQLException e) {
			System.out.println("g_itemDAO isnertProduct예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}
	}
	
	

}
