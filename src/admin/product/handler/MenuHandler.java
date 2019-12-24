package admin.product.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;

public class MenuHandler implements CommandHandler{
	
	private static final String FORM_VIEW= "/product/base";
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if (request.getMethod().equalsIgnoreCase("GET")) {	
			return processForm(request, response);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(request, response);
		}
		return null;
	}


	private String processForm(HttpServletRequest request, HttpServletResponse response) {
		return FORM_VIEW+"/productBase";
		
	}
	
	private String processSubmit(HttpServletRequest request, HttpServletResponse response) {
		String account_type_name = trim(request.getParameter("account_type_name"));
		System.out.println("요청 URL"+FORM_VIEW+"/"+account_type_name+"Base");
		return FORM_VIEW+"/"+account_type_name+"Base";
	}

	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}
	

}
