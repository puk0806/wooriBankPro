package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dao.AccountDAO;
import com.product.model.Fo_itemDTO;
import com.product.model.Fu_itemDTO;
import com.util.JdbcUtil;

public class Fu_itemDAO {
	
private static Fu_itemDAO fu_itemDao = null;
	
	private Fu_itemDAO() {
	}

	public static Fu_itemDAO getInstance() {
		if (fu_itemDao == null) {
			fu_itemDao = new Fu_itemDAO();
		}
		return fu_itemDao;
	}

	public List<Fu_itemDTO> selectAll(Connection conn) {
		String sql = "select * from fu_item ";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Fu_itemDTO> list = new ArrayList<Fu_itemDTO>();
		Fu_itemDTO fu_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				fu_itemDto = new Fu_itemDTO(rs.getString("fu_item_no")
						, rs.getString("st_type_no")
						, rs.getString("r_rate_no")
						,rs.getString("fi_type_no")
						,rs.getString("fund_item_comment")
						, rs.getDouble("fund_item_profitrate"));
				
				list.add(fu_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("fu_itemDAO selectAll예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public List<Fu_itemDTO> selectSearch(Connection conn, int searchCondition, String searchWord) {
		String sql = "select * from fu_item ";
		switch (searchCondition) {
		case 1 :	// 수정 필요
			sql+= " where regexp_like(fund_item_comment, ? ,'i') ";
			break;
		case 2 :	
			sql +=" where regexp_like(fund_item_comment, ? ,'i') ";
			break;
		}
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<Fu_itemDTO> list = new ArrayList<Fu_itemDTO>();
		Fu_itemDTO fu_itemDto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, searchWord);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				fu_itemDto = new Fu_itemDTO(rs.getString("fu_item_no")
						, rs.getString("st_type_no")
						, rs.getString("r_rate_no")
						,rs.getString("fi_type_no")
						,rs.getString("fund_item_comment")
						, rs.getDouble("fund_item_profitrate"));
				
				list.add(fu_itemDto);
			}
		} catch (SQLException e) {
			System.out.println("fu_itemDAO selectSearch 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return list;
	}

	public void insertProduct(Connection conn, String st_type_no, String r_rate_no, String fi_type_no,
			String fund_item_comment, Double fund_item_profitrate) {
		String sql = "insert into fu_item values('FU'||seq_fu_item.nextval, ? , ? , ? , ? , ? ) ";
		
		PreparedStatement pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, st_type_no);
			pstmt.setString(2, r_rate_no);
			pstmt.setString(3, fi_type_no);
			pstmt.setString(4, fund_item_comment);
			pstmt.setDouble(5, fund_item_profitrate);

			pstmt.executeUpdate();
	
		} catch (SQLException e) {
			System.out.println("fu_itemDAO isnertProduct예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(pstmt);
		}

	}	
	
}
	
	

