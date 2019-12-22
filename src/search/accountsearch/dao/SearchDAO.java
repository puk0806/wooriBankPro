package search.accountsearch.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dao.A_detailDAO;
import com.dao.AccountDAO;
import com.dao.UserDAO;
import com.model.A_detailDTO;
import com.model.AccountDTO;
import com.model.UserDTO;

import search.accountsearch.model.SearchDTO;

public class SearchDAO {

	private static SearchDAO searchDao = null;

	private SearchDAO() {
	}

	public static SearchDAO getInstance() {
		if (searchDao == null) {
			searchDao = new SearchDAO();
		}
		return searchDao;
	}

	public List<SearchDTO> selectList(Connection conn, String user_id) {
	
		PreparedStatement pstmt_yd = null;
		PreparedStatement pstmt_re = null;
		ResultSet rs_yd = null;
		ResultSet rs_re = null;
		
		UserDTO userDto = UserDAO.getInstance().selectById(conn, user_id);
		ArrayList<AccountDTO> accountDTOList = (ArrayList<AccountDTO>) AccountDAO.getInstance().selectById_ByType(conn,userDto.getU_info_no(), "AT1000");
		ArrayList<SearchDTO> list = new ArrayList<SearchDTO>();
		AccountDTO accountDto = null;
		A_detailDTO a_detailDto = null;
		SearchDTO dto = null;

		try {
			for (int i = 0; i < accountDTOList.size(); i++) {
				dto = new SearchDTO();
				accountDto = accountDTOList.get(i);

				dto.setUser_name(userDto.getUser_name());
				dto.setAccount_no(accountDto.getAccount_no());
				dto.setAccount_number(accountDto.getAccount_no());
				dto.setAccount_yegeum_name(accountDto.getAccount_yegeum_name());
				dto.setL_bank_no(accountDto.getL_bank_no());
				dto.setAccount_create_date(accountDto.getAccount_create_date());

				a_detailDto = A_detailDAO.getInstance().selectByNo(conn, dto.getAccount_no());
				dto.setAccount_trans_date(a_detailDto.getAccount_trans_date());
				dto.setAccount_current_money(a_detailDto.getAccount_current_money());

				String sql = "select * " + "from yt_detail " + "where yegeum_no =  " + "    (select yegeum_no "
						+ "    from yegeum " + "    where u_info_no = ? and account_no = ?) ";

				pstmt_yd = conn.prepareStatement(sql);

				pstmt_yd.setString(1, userDto.getU_info_no());
				pstmt_yd.setString(2, dto.getAccount_no());
				rs_yd = pstmt_yd.executeQuery();

				if (rs_yd.next()) {
					dto.setP_set_no(rs_yd.getInt("p_set_no"));
					dto.setRemarks_no(rs_yd.getString("remarks_no")); // 필요 없다고 생각
				}

				sql = "select * from remarks where remarks_no = ? ";
				pstmt_re = conn.prepareStatement(sql);
				pstmt_re.setString(1, dto.getRemarks_no());
				rs_re = pstmt_re.executeQuery();

				if (rs_re.next()) {
					dto.setRemarks_create_date(rs_re.getDate("remarks_create_date"));
					dto.setRemarks_type(rs_re.getString("remarks_type"));
					dto.setRemarks_payment_stop(rs_re.getString("remarks_payment_stop"));
					dto.setRemarks_division(rs_re.getString("remarks_division"));
					dto.setRemarks_clientname(rs_re.getString("remarks_clientname"));
					dto.setRemarks_reason(rs_re.getString("remarks_reason"));
					dto.setRemarks_money(rs_re.getInt("remarks_money"));
				}

				list.add(dto);

			}
		} catch (SQLException e) {
			System.out.println("SearchDAO selectList 예외");
			e.printStackTrace();
		}

		return list;
	}

}
