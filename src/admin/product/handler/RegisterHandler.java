package admin.product.handler;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;
import com.product.model.Fo_itemDTO;
import com.product.model.Fu_itemDTO;
import com.product.model.G_itemDTO;
import com.product.model.I_itemDTO;
import com.product.model.L_itemDTO;
import com.product.model.S_itemDTO;
import com.product.model.Y_itemDTO;

import admin.product.service.ProductRegisterService;

public class RegisterHandler implements CommandHandler{
	
	private static final String FORM_VIEW= "/product/";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String command  = request.getRequestURI();
		
		if(command.indexOf(FORM_VIEW)==15) {
			command = command.substring(FORM_VIEW.length()+15,command.length()-6);
		}
		
		
		if (request.getMethod().equalsIgnoreCase("GET")) {	
			return processForm(request, response,command);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(request, response,command);
		}
		return null;
	}

	private String processForm(HttpServletRequest request, HttpServletResponse response, String command) {
		return FORM_VIEW+"register/"+command;
	}

	private String processSubmit(HttpServletRequest request, HttpServletResponse response, String command) {
		command = command.substring(0,command.length()-8);
		
		try {
			String location = "/bankJSPProject/product/"+command+".admin";
			
			ProductRegisterService service = new ProductRegisterService();
			if(command.equals("y_item")) {
				String yegeum_item_name = request.getParameter("yegeum_item_name");
				String yegeum_item_length = request.getParameter("yegeum_item_length");
				int yegeum_item_limitmoney = Integer.parseInt(request.getParameter("yegeum_item_limitmoney"));
				double yegeum_item_interestrate = Double.parseDouble(request.getParameter("yegeum_item_interestrate"));
				String yegeum_item_comment = request.getParameter("yegeum_item_comment");
				
				service.y_itemRegister(yegeum_item_name,yegeum_item_length,yegeum_item_limitmoney,yegeum_item_interestrate,yegeum_item_comment);
			}else if(command.equals("fo_item")) {
				String foreign_item_name = request.getParameter("foreign_item_name");
				Double foreign_item_sign_money = Double.parseDouble(request.getParameter("foreign_item_sign_money"));
				String foreign_item_comment= request.getParameter("foreign_item_comment");
				String foreign_item_endday = request.getParameter("foreign_item_endday");
				
				service.fo_itemRegister(foreign_item_name,foreign_item_sign_money,foreign_item_comment,foreign_item_endday);
			}else if(command.equals("fu_item")) {
				String st_type_no = request.getParameter("st_type_no");
				String r_rate_no = request.getParameter("r_rate_no");
				String fi_type_no = request.getParameter("fi_type_no");
				String fund_item_comment = request.getParameter("fund_item_comment");
				Double fund_item_profitrate = Double.parseDouble(request.getParameter("fund_item_profitrate"));
				
				service.fu_itemRegister(st_type_no,r_rate_no,fi_type_no,fund_item_comment,fund_item_profitrate);
			}else if(command.equals("g_item")) {
				String g_item_name = request.getParameter("g_item_name");
				String gold_item_comment = request.getParameter("gold_item_comment");
				Double gold_item_transunit = Double.parseDouble(request.getParameter("gold_item_transunit"));
				
				service.g_itemRegister(g_item_name,gold_item_comment,gold_item_transunit);
			}else if (command.equals("i_item")) {
				String i_company_no = request.getParameter("i_company_no");
				String insurance_item_name = request.getParameter("insurance_item_name");
				String insurance_item_commnet = request.getParameter("insurance_item_commnet");
				int insurance_item_length = Integer.parseInt(request.getParameter("insurance_item_length"));
				
				service.i_itemRegister(i_company_no,insurance_item_name,insurance_item_commnet,insurance_item_length);
			}else if (command.equals("l_item")) {
				String li_type_no = request.getParameter("li_type_no");
				String loan_item_comment = request.getParameter("loan_item_comment");
				String loan_item_length = request.getParameter("loan_item_length");
				int loan_item_limitmoney = Integer.parseInt(request.getParameter("loan_item_limitmoney"));
				
				service.l_itemRegister(li_type_no,loan_item_comment,loan_item_length,loan_item_limitmoney);
			}else if(command.equals("s_item")) {
				String st_type_no = request.getParameter("st_type_no");
				String saving_item_name = request.getParameter("saving_item_name");
				int saving_item_maxmoney = Integer.parseInt(request.getParameter("saving_item_maxmoney"));
				Double saving_item_endrate = Double.parseDouble(request.getParameter("saving_item_endrate"));
				Double saving_item_cancelrate = Double.parseDouble(request.getParameter("saving_item_cancelrate"));
				String savings_item_length = request.getParameter("savings_item_length");
				String savings_item_comment = request.getParameter("savings_item_comment");
				
				service.s_itemRegister(st_type_no,saving_item_name,saving_item_maxmoney,saving_item_endrate,saving_item_cancelrate,savings_item_length,savings_item_comment);
			}
			
			response.sendRedirect(location);
		} catch (IOException e) {
			System.out.println("RegisterHandler POST 예외");
			e.printStackTrace();
		}
		
		return null;
	}
	
	

}
