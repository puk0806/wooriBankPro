package admin.product.handler;

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

import admin.product.service.ProductSearchService;

public class SearchHandler implements CommandHandler{
	
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
		ProductSearchService service = new ProductSearchService();
		if(command.equals("y_item")) {
			List<Y_itemDTO> y_itemList = service.y_itemSearch();
			request.setAttribute("y_itemList", y_itemList);
		}else if(command.equals("fo_item")) {
			List<Fo_itemDTO> fo_itemList = service.fo_itemSearch();
			request.setAttribute("fo_itemList", fo_itemList);
		}else if(command.equals("fu_item")) {
			List<Fu_itemDTO> fu_itemList = service.fu_itemSearch();
			request.setAttribute("fu_itemList", fu_itemList);
		}else if(command.equals("g_item")) {
			List<G_itemDTO> g_itemList = service.g_itemSearch();
			request.setAttribute("g_itemList", g_itemList);
		}else if (command.equals("i_item")) {
			List<I_itemDTO> i_itemList = service.i_itemSearch();
			request.setAttribute("i_itemList", i_itemList);
		}else if (command.equals("l_item")) {
			List<L_itemDTO> l_itemList = service.l_itemSearch();
			request.setAttribute("l_itemList",l_itemList);
		}else if(command.equals("s_item")) {
			List<S_itemDTO> s_itemList = service.s_itemSearch();
			request.setAttribute("s_itemList", s_itemList);
		}
		
		return FORM_VIEW+"search/"+command+"Search";
	}
	
	private String processSubmit(HttpServletRequest request, HttpServletResponse response, String command) {
		
		ProductSearchService service = new ProductSearchService();
		
		int searchCondition = Integer.parseInt(request.getParameter("searchCondition") == null ? "1" : request.getParameter("searchCondition"));
		String searchWord = request.getParameter("searchWord");
		request.setAttribute("searchCondition", searchCondition);
		request.setAttribute("searchWord", searchWord);
		
		if(command.equals("y_item")) {
			List<Y_itemDTO> y_itemList = service.y_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("y_itemList", y_itemList);
		}else if(command.equals("fo_item")) {
			List<Fo_itemDTO> fo_itemList = service.fo_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("fo_itemList", fo_itemList);
		}else if(command.equals("fu_item")) {
			List<Fu_itemDTO> fu_itemList = service.fu_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("fu_itemList", fu_itemList);
		}else if(command.equals("g_item")) {
			List<G_itemDTO> g_itemList = service.g_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("g_itemList", g_itemList);
		}else if (command.equals("i_item")) {
			List<I_itemDTO> i_itemList = service.i_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("i_itemList", i_itemList);
		}else if (command.equals("l_item")) {
			List<L_itemDTO> l_itemList = service.l_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("l_itemList",l_itemList);
		}else if(command.equals("s_item")) {
			List<S_itemDTO> s_itemList = service.s_itemSelectSearch(searchCondition,searchWord);
			request.setAttribute("s_itemList", s_itemList);
		}
		
		
		return FORM_VIEW+"search/"+command+"Search";
	}


	

	

}
