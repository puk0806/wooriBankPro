package admin.user.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;

public class MenuHandler implements CommandHandler{
	
	private static final String FORM_VIEW= "/user/userBase";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return FORM_VIEW;
	}

}
