package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prodetail.model.Gs_detailDTO;
import com.util.JdbcUtil;

public class Gs_detailDAO {
	
	private static Gs_detailDAO gs_deatailDAO = null;
	
	private Gs_detailDAO() {
	}

	public static Gs_detailDAO getInstance() {
		if (gs_deatailDAO == null) {
			gs_deatailDAO = new Gs_detailDAO();
		}
		return gs_deatailDAO;
	}

	public Gs_detailDTO selectByNo(Connection conn, String gi_sign_no) {
		String sql = "select * " + 
				"from gs_detail " + 
				"where gi_sign_no = ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Gs_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, gi_sign_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Gs_detailDTO(rs.getString("gs_detail_no")
									,rs.getString("gi_sign_no")
									,rs.getString("g_price_no")
									,rs.getString("account_no")
									,rs.getString("l_bank_no")
									,rs.getDouble("gold_traderate")
									,rs.getDouble("gold_extra"));
			}
			}catch (SQLException e) {
			System.out.println("Gs_detailDAO selectByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return dto;
	}

}
