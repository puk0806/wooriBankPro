package admin.product.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.product.dao.Y_itemDAO;
import com.product.model.Y_itemDTO;
import com.sign.dao.Foi_signDAO;
import com.sign.dao.Fui_signDAO;
import com.sign.dao.Gi_signDAO;
import com.sign.dao.Ii_signDAO;
import com.sign.dao.Li_signDAO;
import com.sign.dao.Si_signDAO;
import com.sign.dao.Y_signDAO;
import com.sign.model.Foi_signDTO;
import com.sign.model.Fui_signDTO;
import com.sign.model.Gi_signDTO;
import com.sign.model.Ii_signDTO;
import com.sign.model.Li_signDTO;
import com.sign.model.Si_signDTO;
import com.sign.model.Y_signDTO;
import com.util.ConnectionProvider;

public class ProductSignSearchService {

	public List<Foi_signDTO> foi_signSearch() {
		
	Foi_signDAO dao = Foi_signDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Foi_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService foi_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Fui_signDTO> fui_signSearch() {
		Fui_signDAO dao = Fui_signDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<Fui_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService fui_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Gi_signDTO> gi_signSearch() {
		Gi_signDAO dao = Gi_signDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<Gi_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService gi_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Ii_signDTO> ii_signSearch() {
		Ii_signDAO dao = Ii_signDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<Ii_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService ii_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Li_signDTO> li_signSearch() {
		Li_signDAO dao = Li_signDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<Li_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService li_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Si_signDTO> si_signSearch() {
		Si_signDAO dao = Si_signDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<Si_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService si_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Y_signDTO> y_signSearch() {
		Y_signDAO dao = Y_signDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<Y_signDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignSearchService y_signSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

}
