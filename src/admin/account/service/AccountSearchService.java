package admin.account.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.dao.AccountDAO;
import com.model.AccountDTO;
import com.util.ConnectionProvider;

import search.accountsearch.model.SearchDTO;

public class AccountSearchService {

	public List<AccountDTO> AllSearch() {
		AccountDAO dao = AccountDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<AccountDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService searchSelect 예외 발생");
			throw new RuntimeException(e);
		}
		
	}

	public AccountDTO NumberSearch(String account_number) {
		AccountDAO dao = AccountDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			AccountDTO accountDto = dao.selectByNumber(conn, account_number);
			return accountDto;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService NumberSelect 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<AccountDTO> nameSearch(String user_name,String user_rrn) {
		AccountDAO dao = AccountDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<AccountDTO> list = dao.selectByUser_name(conn, user_name,user_rrn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService nameSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<AccountDTO> typeSearch(String account_type_name) {
		AccountDAO dao = AccountDAO.getInstance();

		try (Connection conn = ConnectionProvider.getConnection()) {
			List<AccountDTO> list = dao.selectByAccount_type(conn, account_type_name);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService typeSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

}
