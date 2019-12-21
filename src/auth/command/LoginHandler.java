package auth.command;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.command.CommandHandler;
import com.model.UserDTO;

import auth.service.LoginFailException;
import auth.service.LoginService;

public class LoginHandler implements CommandHandler{
	
	private static final String FORM_VIEW = "/auth/loginForm";
	private LoginService loginService = new LoginService();

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getMethod().equalsIgnoreCase("GET")) {
			System.out.println("Login핸들러 get");
			return processForm(request, response);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {
			System.out.println("Login핸들러 post");
			return processSubmit(request, response);
		} 
		return null;
	}


	private String processForm(HttpServletRequest request, HttpServletResponse response) {
		return FORM_VIEW;
	}
	

	private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
		
		String user_id = trim(request.getParameter("user_id"));
		String user_pwd = trim(request.getParameter("user_pwd"));
		
		Map<String, Boolean> errors = new HashMap<>();
		request.setAttribute("errors", errors);
		
		if (user_id == null || user_id.isEmpty())
			errors.put("user_id", true );
		if (user_pwd == null || user_pwd.isEmpty())
			errors.put("user_pwd", true );

		if (!errors.isEmpty()) {
			System.out.println("에러발생");
			return FORM_VIEW;
		}
		
		try {
			
		UserDTO userDto = loginService.login(user_id,user_pwd);
		request.getSession().setAttribute("authUser", userDto);
		HttpSession session = request.getSession(false);
		System.out.println("세션 생성 !");
			if ( session.getAttribute("referer") != null) {
				response.sendRedirect((String)session.getAttribute("referer"));
			}else {
				
				response.sendRedirect(request.getContextPath() + "/default.jsp");
			}
		} catch (LoginFailException e) {
			errors.put("idOrPwNotMatch", true );
			return FORM_VIEW;
		} catch (IOException e) {
			System.out.println("LobinHandler processSubmit 예외");
			e.printStackTrace();
		}
		System.out.println("모든걸 통과");
		return null;
	}
	
	
	
	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}

	
}
