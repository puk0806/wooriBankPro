package transfer.automatictransfer.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;

public class autoTransferSearchHandler implements CommandHandler{

	private static final String FORM_VIEW= "/transfer/automatictransfer/autoTransferSearch";
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// System.out.println("핸들러 입장 ");
		return FORM_VIEW;
	}
	
	

}
