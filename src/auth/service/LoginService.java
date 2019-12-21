package auth.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;

import com.dao.UserDAO;
import com.model.UserDTO;
import com.util.ConnectionProvider;

public class LoginService {
	
	private UserDAO userDao = new UserDAO();

	public UserDTO login(String user_id, String user_pwd) {
		System.out.println("login service login입장");
		UserDTO userDto = null;
		try(Connection conn = ConnectionProvider.getConnection()){
			userDto = userDao.selectById(conn, user_id);
			if(userDto == null) {
				System.out.println("에러1");
				throw new LoginFailException();
			}
			if(!userDto.matchPassword(user_pwd)) {
				System.out.println("에러2");
				throw new LoginFailException();
			}
			
		} catch (SQLException | NamingException e) {
			System.out.println("LoginService login 예외 발생");
			e.printStackTrace();
		}
		System.out.println("dto 객체 생성");
		return userDto;
	}
	
	

}
