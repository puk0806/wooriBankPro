package admin.product.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.product.dao.Fo_itemDAO;
import com.product.dao.Fu_itemDAO;
import com.product.dao.G_itemDAO;
import com.product.dao.I_itemDAO;
import com.product.dao.L_itemDAO;
import com.product.dao.S_itemDAO;
import com.product.dao.Y_itemDAO;
import com.product.model.Y_itemDTO;
import com.util.ConnectionProvider;

public class ProductRegisterService {

	public void y_itemRegister(String yegeum_item_name, String yegeum_item_length, int yegeum_item_limitmoney,
			double yegeum_item_interestrate, String yegeum_item_comment) {
		Y_itemDAO dao = Y_itemDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,yegeum_item_name,yegeum_item_length,yegeum_item_limitmoney,yegeum_item_interestrate,yegeum_item_comment);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService y_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public void fo_itemRegister(String foreign_item_name, Double foreign_item_sign_money,
			String foreign_item_comment, String foreign_item_endday) {
		Fo_itemDAO dao = Fo_itemDAO.getInstance();
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,foreign_item_name,foreign_item_sign_money,foreign_item_comment,foreign_item_endday);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService fo_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}
		
	}

	public void fu_itemRegister(String st_type_no, String r_rate_no, String fi_type_no, String fund_item_comment,
			Double fund_item_profitrate) {
		Fu_itemDAO dao = Fu_itemDAO.getInstance();
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,st_type_no,r_rate_no,fi_type_no,fund_item_comment,fund_item_profitrate);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService fu_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}
		
	}

	public void g_itemRegister(String g_item_name, String gold_item_comment, Double gold_item_transunit) {
		G_itemDAO dao = G_itemDAO.getInstance();
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,g_item_name,gold_item_comment,gold_item_transunit);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService g_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}
		
	}

	public void i_itemRegister(String i_company_no, String insurance_item_name, String insurance_item_commnet,
			int insurance_item_length) {
		I_itemDAO dao = I_itemDAO.getInstance();
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,i_company_no,insurance_item_name,insurance_item_commnet,insurance_item_length);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService i_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}
		
	}

	public void l_itemRegister(String li_type_no, String loan_item_comment, String loan_item_length,
			int loan_item_limitmoney) {

		L_itemDAO dao = L_itemDAO.getInstance();
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,li_type_no,loan_item_comment,loan_item_length,loan_item_limitmoney);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService L_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}

		
	}


	public void s_itemRegister(String st_type_no, String saving_item_name, int saving_item_maxmoney,
			Double saving_item_endrate, Double saving_item_cancelrate, String savings_item_length,
			String savings_item_comment) {
		S_itemDAO dao = S_itemDAO.getInstance();
		
		try (Connection conn = ConnectionProvider.getConnection()) {
			dao.insertProduct(conn,st_type_no,saving_item_name,saving_item_maxmoney,saving_item_endrate,saving_item_cancelrate,savings_item_length,savings_item_comment);
		} catch (SQLException | NamingException e) {
			System.out.println("ProductRegisterService S_itemRegister 예외 발생");
			throw new RuntimeException(e);
		}
	}

}
