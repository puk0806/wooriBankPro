package admin.user.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.dao.UserDAO;
import com.model.UserDTO;
import com.util.ConnectionProvider;

import search.accountsearch.model.SearchDTO;

public class UserSearchService {

	// 모든 유저 가져오기
	public List<UserDTO> userAllSearch() {
		
	
		UserDAO dao = UserDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<UserDTO> list = dao.selectAll(conn);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("UserSearchService searchSelect 예외 발생");
			throw new RuntimeException(e);
		}
	}

	// 이름 주민번호로 유저 가져오기
	public UserDTO userSearch(String user_name, String user_rrn) {
		UserDAO dao = UserDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			UserDTO userDto =  dao.selectByName_ByRrn(conn, user_name, user_rrn);
			return userDto;
		} catch (SQLException | NamingException e) {
			System.out.println("UserSearchService userSearch 예외");
			throw new RuntimeException(e);
		}
		
	}
	


}
