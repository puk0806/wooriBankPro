package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prodetail.model.Is_detailDTO;
import com.prodetail.model.Ls_detailDTO;
import com.util.JdbcUtil;

public class Ls_detailDAO {

private static Ls_detailDAO ls_deatailDAO = null;
	
	private Ls_detailDAO() {
	}

	public static Ls_detailDAO getInstance() {
		if (ls_deatailDAO == null) {
			ls_deatailDAO = new Ls_detailDAO();
		}
		return ls_deatailDAO;
	}

	public Ls_detailDTO selectByNo(Connection conn, String li_sign_no) {
		String sql = "select * " + 
				"from ls_detail " + 
				"where li_sign_no = ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Ls_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, li_sign_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto = new Ls_detailDTO(rs.getString("ls_detail_no")
									,rs.getString("li_sign_no")
									,rs.getString("account_no")
									,rs.getString("l_bank_no")); 
				}
			}catch (SQLException e) {
			System.out.println("Ls_detailDAO selectByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return dto;
	}
	
}
