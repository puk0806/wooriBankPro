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
import com.product.model.Fo_itemDTO;
import com.product.model.Fu_itemDTO;
import com.product.model.G_itemDTO;
import com.product.model.I_itemDTO;
import com.product.model.L_itemDTO;
import com.product.model.S_itemDTO;
import com.product.model.Y_itemDTO;
import com.util.ConnectionProvider;

public class ProductSearchService {

	public List<Y_itemDTO> y_itemSearch() {
		Y_itemDAO dao = Y_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Y_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService y_itemSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Fo_itemDTO> fo_itemSearch() {
		Fo_itemDAO dao = Fo_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Fo_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService fo_itemSearch 예외 발생 ");
			throw new RuntimeException(e);
		}
	}

	public List<Fu_itemDTO> fu_itemSearch() {
		Fu_itemDAO dao = Fu_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Fu_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService fu_itemSearch 예외 발생 ");
			throw new RuntimeException(e);
		}
	}

	public List<G_itemDTO> g_itemSearch() {
		G_itemDAO dao = G_itemDAO.getInstance();

		try(Connection conn = ConnectionProvider.getConnection()){
			List<G_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService g_itemSearch 예외 발생 ");
			throw new RuntimeException(e);
		}
		
	}

	public List<I_itemDTO> i_itemSearch() {
		I_itemDAO dao = I_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<I_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService i_itemSearch 예외 발생 ");
			throw new RuntimeException(e);
		}
	}

	public List<L_itemDTO> l_itemSearch() {
		L_itemDAO dao = L_itemDAO.getInstance();

		try(Connection conn = ConnectionProvider.getConnection()){
			List<L_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService l_itemSearch 예외 발생 ");
			throw new RuntimeException(e);
		}
	}

	public List<S_itemDTO> s_itemSearch() {
		S_itemDAO dao = S_itemDAO.getInstance();

		try(Connection conn = ConnectionProvider.getConnection()){
			List<S_itemDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService s_itemSearch 예외 발생 ");
			throw new RuntimeException(e);
		}
	}

	public List<Y_itemDTO> y_itemSelectSearch(int searchCondition, String searchWord) {
		Y_itemDAO dao = Y_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Y_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService y_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Fo_itemDTO> fo_itemSelectSearch(int searchCondition, String searchWord) {
		Fo_itemDAO dao = Fo_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Fo_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService fo_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<Fu_itemDTO> fu_itemSelectSearch(int searchCondition, String searchWord) {
		Fu_itemDAO dao = Fu_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<Fu_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService fu_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<G_itemDTO> g_itemSelectSearch(int searchCondition, String searchWord) {
		G_itemDAO dao = G_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<G_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService g_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<I_itemDTO> i_itemSelectSearch(int searchCondition, String searchWord) {
		I_itemDAO dao = I_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<I_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService i_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<L_itemDTO> l_itemSelectSearch(int searchCondition, String searchWord) {
		L_itemDAO dao = L_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<L_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService l_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<S_itemDTO> s_itemSelectSearch(int searchCondition, String searchWord) {
		S_itemDAO dao = S_itemDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<S_itemDTO> list = dao.selectSearch(conn,searchCondition,searchWord);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSearchService s_itemSelectSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

}
