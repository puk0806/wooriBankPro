package admin.user.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;
import com.model.UserDTO;

import admin.user.service.UserSearchService;
import search.accountsearch.service.SearchService;

public class SearchHandler implements CommandHandler{
	
	private static final String FORM_VIEW= "/user";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		if (request.getMethod().equalsIgnoreCase("GET")) {	// 유저 전체 조회
			return processForm(request, response);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {	// 특정 유저 조회
			return processSubmit(request, response);
		}
		return null;
	}
	
	private String processForm(HttpServletRequest request, HttpServletResponse response) {
		
		UserSearchService service  = new UserSearchService();
		List<UserDTO> userList = service.userAllSearch();
		request.setAttribute("userList", userList);
		return FORM_VIEW+"/allUser";
	}
	
	private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
		
		String user_name = trim(request.getParameter("user_name"));
		String user_rrn = trim(request.getParameter("user_rrn"));
		
		Map<String, Boolean> errors = new HashMap<>();
		request.setAttribute("errors", errors);
		
		if(user_name == null|| user_name.isEmpty())
			errors.put("user_name", true);
		if(user_rrn == null || user_rrn.isEmpty() )
			errors.put("user_rrn",true);
		
		if (!errors.isEmpty()) {
			System.out.println("에러발생");
			return FORM_VIEW+"/userBase";
		}
		
		UserSearchService service  = new UserSearchService();
		UserDTO userDto = service.userSearch(user_name,user_rrn);
		request.setAttribute("userDto", userDto);
		
		return FORM_VIEW+"/UserInfo";
	}
	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}
}
