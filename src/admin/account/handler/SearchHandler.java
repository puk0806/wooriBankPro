  package admin.account.handler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;
import com.model.AccountDTO;

import admin.account.service.AccountSearchService;

public class SearchHandler implements CommandHandler{

	private static final String FORM_VIEW = "/account";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String command  = request.getRequestURI();
		// System.out.println("길이"+command.indexOf(FORM_VIEW));
		if(command.indexOf(FORM_VIEW)==15) {
			command = command.substring(FORM_VIEW.length()+15,command.length()-6);
		}
		System.out.println("command : "+command);
		
		if (request.getMethod().equalsIgnoreCase("GET")) {	// 유저 전체 조회
			return processForm(request, response,command);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {	// 특정 유저 조회
			return processSubmit(request, response,command);
		}
		return null;
		
	}

	private String processForm(HttpServletRequest request, HttpServletResponse response, String command) {
		AccountSearchService service = new AccountSearchService();
		List<AccountDTO> accountList = null;
		System.out.println("commnad 명령어 : "+command);
		
		if(command.equals("/accountAllSearch")) {
			accountList = service.AllSearch();
			request.setAttribute("accountList", accountList);
		}
		return FORM_VIEW+command;
	}
	

	private String processSubmit(HttpServletRequest request, HttpServletResponse response, String command) {

		AccountSearchService service = new AccountSearchService();
		List<AccountDTO> accountList = null;
		AccountDTO accountDto =null;
		Map<String, Boolean> errors = new HashMap<>();
		request.setAttribute("errors", errors);
		
		
		if(command.equals("/accountUserSearch")) {
			String user_name = trim(request.getParameter("user_name"));
			if(user_name == null || user_name.isEmpty())
				errors.put("user_name", true);
			if (!errors.isEmpty()) {
				System.out.println("에러발생");
				return FORM_VIEW+command;
			}
			accountList = service.nameSearch(user_name);
			request.setAttribute("accountList", accountList);
			
		}else if(command.equals("/accountNumberSearch")) {
			String account_number = trim(request.getParameter("account_number"));
			if(account_number == null || account_number.isEmpty())
				errors.put("account_number", true);
			if (!errors.isEmpty()) {
				System.out.println("에러발생");
				return FORM_VIEW+command;
			}
			accountDto = service.NumberSearch(account_number);
			request.setAttribute("accountDto", accountDto);
		}else if(command.equals("/accountProductSearch")) {
			String account_type_name = trim(request.getParameter("account_type_name"));
			if(account_type_name == null || account_type_name.isEmpty())
				errors.put("account_type_name", true);
			if (!errors.isEmpty()) {
				System.out.println("에러발생");
				return FORM_VIEW+command;
			}
			accountList = service.typeSearch(account_type_name);
			request.setAttribute("accountList", accountList);
		}
		return FORM_VIEW+command;
	}
	
	
	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}


}
