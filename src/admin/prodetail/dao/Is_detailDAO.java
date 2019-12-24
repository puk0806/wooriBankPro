package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prodetail.model.Is_detailDTO;
import com.util.JdbcUtil;

public class Is_detailDAO {
	
private static Is_detailDAO is_deatailDAO = null;
	
	private Is_detailDAO() {
	}

	public static Is_detailDAO getInstance() {
		if (is_deatailDAO == null) {
			is_deatailDAO = new Is_detailDAO();
		}
		return is_deatailDAO;
	}

	public Is_detailDTO selectByNo(Connection conn, String ii_sign_no) {
		String sql = "select * " + 
				"from is_detail " + 
				"where ii_sign_no = ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Is_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ii_sign_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Is_detailDTO(rs.getString("is_detail_no")
									,rs.getString("ii_sign_no")
									,rs.getString("account_no")
									,rs.getString("l_bank_no")
									,rs.getInt("insurance_principal")
									,rs.getInt("insurance_payment"));
				}
			}catch (SQLException e) {
			System.out.println("Is_detailDAO selectByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return dto;
	}

}
