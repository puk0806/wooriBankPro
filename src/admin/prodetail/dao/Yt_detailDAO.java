package admin.prodetail.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.prodetail.model.Ss_detailDTO;
import com.prodetail.model.Yt_detailDTO;
import com.util.JdbcUtil;

public class Yt_detailDAO {
	
private static Yt_detailDAO yt_deatailDAO = null;
	
	private Yt_detailDAO() {
	}

	public static Yt_detailDAO getInstance() {
		if (yt_deatailDAO == null) {
			yt_deatailDAO = new Yt_detailDAO();
		}
		return yt_deatailDAO;
	}

	public Yt_detailDTO selectByNo(Connection conn, String yegeum_no) {
		String sql = "select * " + 
				"from yt_detail " + 
				"where yegeum_no = ? ";
		
		System.out.println("yegeum_no : "+yegeum_no);
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		Yt_detailDTO dto = null;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, yegeum_no);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				dto = new Yt_detailDTO(rs.getString("yt_detail_no")
									,rs.getString("yegeum_no")
									,rs.getString("account_no")
									,rs.getString("l_bank_no")
									,rs.getInt("p_set_no")
									,rs.getString("remarks_no")
									,rs.getInt("yegeum_item_endday")
									,rs.getInt("yegeum_tiem_transmoney"));
				}
			}catch (SQLException e) {
			System.out.println("Yt_detailDAO selectByNo 예외");
			e.printStackTrace();
		}finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);
		}
		
		return dto;
	}

}
