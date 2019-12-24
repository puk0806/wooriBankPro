package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prodetail.model.Fus_detailDTO;
import com.util.JdbcUtil;

public class Fus_detailDAO {

private static Fus_detailDAO fus_deatailDAO = null;
	
	private Fus_detailDAO() {
	}

	public static Fus_detailDAO getInstance() {
		if (fus_deatailDAO == null) {
			fus_deatailDAO = new Fus_detailDAO();
		}
		return fus_deatailDAO;
	}

	public Fus_detailDTO selectByNo(Connection conn, String fui_sign_no) {
		String sql = "select * " + 
				"from fus_detail " + 
				"where fui_sign_no = ? ";
		
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Fus_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, fui_sign_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				dto = new Fus_detailDTO(rs.getString("fus_detail_no")
									,rs.getString("fui_sign_no")
									,rs.getString("account_no")
									,rs.getString("l_bank_no")
									,rs.getInt("fund_item_sign_money")
									,rs.getInt("standard_price")
									,rs.getDouble("investment_profit")
									,rs.getInt("account_balance")
									,rs.getString("trust_company"));
			}
		}catch (SQLException e) {
			System.out.println("Fus_detailDAO selectByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return dto;
	}
	
}
