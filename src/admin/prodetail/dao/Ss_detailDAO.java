package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prodetail.model.Ls_detailDTO;
import com.prodetail.model.Ss_detailDTO;
import com.util.JdbcUtil;

public class Ss_detailDAO {
	
private static Ss_detailDAO ss_deatailDAO = null;
	
	private Ss_detailDAO() {
	}

	public static Ss_detailDAO getInstance() {
		if (ss_deatailDAO == null) {
			ss_deatailDAO = new Ss_detailDAO();
		}
		return ss_deatailDAO;
	}

	public Ss_detailDTO selectByNo(Connection conn, String si_sign_no) {
		String sql = "select * " + 
				"from ss_detail " + 
				"where si_sign_no = ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Ss_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, si_sign_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto = new Ss_detailDTO(rs.getString("ss_detail_no")
									,rs.getString("si_sign_no")
									,rs.getString("account_no")
									,rs.getString("l_bank_no")
									,rs.getString("remarks_no")
									,rs.getInt("p_set_no")
									,rs.getDate("saving_sign_detail_enddate")
									,rs.getInt("saving_sign_detail_delaytime")
									,rs.getInt("contracted_price")
									,rs.getInt("reserve_price")
									,rs.getInt("tax_incentive_price")
									,rs.getString("tax_incentive_division")
									,rs.getString("endday_process")); 
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
