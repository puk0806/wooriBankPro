package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.model.AccountDTO;
import com.prodetail.model.Fos_detailDTO;
import com.util.JdbcUtil;

public class Fos_detailDAO {
	
private static Fos_detailDAO fos_deatailDAO = null;
	
	private Fos_detailDAO() {
	}

	public static Fos_detailDAO getInstance() {
		if (fos_deatailDAO == null) {
			fos_deatailDAO = new Fos_detailDAO();
		}
		return fos_deatailDAO;
	}

	public Fos_detailDTO selectByNo(Connection conn, String foi_sign_no) {
		String sql = "select * " + 
				"from fos_detail " + 
				"where foi_sign_no = ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Fos_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, foi_sign_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Fos_detailDTO(rs.getString("fos_detail_no")
										,rs.getString("foi_sign_no")
										,rs.getString("account_no")
										,rs.getString("l_bank_no")
										,rs.getString("currency_no")
										,rs.getDouble("current_money")
										,rs.getString("endday_process")
										,rs.getString("accident_content")
										,rs.getDate("renewal_date")
										,rs.getString("fos_comment"));
			}
		} catch (SQLException e) {
			System.out.println("Fos_detailDAO selectByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return dto;
	}
	
	
	
	
	
}
