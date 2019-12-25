package admin.product.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.command.CommandHandler;
import com.prodetail.model.Fos_detailDTO;
import com.prodetail.model.Fus_detailDTO;
import com.prodetail.model.Gs_detailDTO;
import com.prodetail.model.Is_detailDTO;
import com.prodetail.model.Ls_detailDTO;
import com.prodetail.model.Ss_detailDTO;
import com.prodetail.model.Yt_detailDTO;
import com.sign.model.Foi_signDTO;
import com.sign.model.Fui_signDTO;
import com.sign.model.Gi_signDTO;
import com.sign.model.Ii_signDTO;
import com.sign.model.Li_signDTO;
import com.sign.model.Si_signDTO;
import com.sign.model.Y_signDTO;

import admin.product.service.ProductSignDetailSearchService;
import admin.product.service.ProductSignSearchService;

public class SignSearchHandler implements CommandHandler{

	private static final String FORM_VIEW= "/product/";

	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String command  = request.getRequestURI();
		
		if(command.indexOf(FORM_VIEW)==15) {
			command = command.substring(FORM_VIEW.length()+15,command.length()-6);
		}
		System.out.println("command : "+command);
		
		
		if (request.getMethod().equalsIgnoreCase("GET")) {	
			return processForm(request, response,command);
		} else if (request.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(request, response,command);
		}
		return null;
	}

	private String processForm(HttpServletRequest request, HttpServletResponse response, String command) {
		
		ProductSignSearchService service = new ProductSignSearchService();
		if(command.equals("foi_signSearch")) {
			List<Foi_signDTO> foi_singList = service.foi_signSearch();
			request.setAttribute("foi_signList", foi_singList);
		}else if(command.equals("fui_signSearch")) {
			List<Fui_signDTO> fui_signList = service.fui_signSearch();
			request.setAttribute("fui_signList", fui_signList);
		}else if(command.equals("gi_signSearch")) {
			List<Gi_signDTO> gi_signList = service.gi_signSearch();
			request.setAttribute("gi_signList", gi_signList);
		}else if(command.equals("ii_signSearch")) {
			List<Ii_signDTO> ii_signList = service.ii_signSearch();
			request.setAttribute("ii_signList", ii_signList);
		}else if(command.equals("li_signSearch")) {
			List<Li_signDTO> li_signList = service.li_signSearch();
			request.setAttribute("li_signList", li_signList);
		}else if(command.equals("si_signSearch")) {
			List<Si_signDTO> si_signList = service.si_signSearch();
			request.setAttribute("si_signList", si_signList);
		}else if(command.equals("y_signSearch")) {
			List<Y_signDTO> y_signList = service.y_signSearch();
			request.setAttribute("y_signList", y_signList);
		}
		
		return FORM_VIEW+"signsearch/"+command;
	}

	private String processSubmit(HttpServletRequest request, HttpServletResponse response, String command) {
		
		ProductSignDetailSearchService service = new ProductSignDetailSearchService();
		if(command.equals("foi_signSearch")) {
			String foi_sign_no = trim(request.getParameter("foi_sign_no"));
			Fos_detailDTO fos_signDetail = service.fos_signDetailSearch(foi_sign_no);
			request.setAttribute("fos_signSearchDetail", fos_signDetail);
		}else if(command.equals("fui_signSearch")) {
			String fui_sign_no = trim(request.getParameter("fui_sign_no"));
			Fus_detailDTO fus_signDetail = service.fus_signDetailSearch(fui_sign_no);
			request.setAttribute("fus_signSearchDetail", fus_signDetail);
		}else if(command.equals("gi_signSearch")) {
			String gi_sign_no = trim(request.getParameter("gi_sign_no"));
			Gs_detailDTO gs_signDetail = service.gs_signDetailSearch(gi_sign_no);
			request.setAttribute("gs_signSearchDetail", gs_signDetail);
		}else if(command.equals("ii_signSearch")) {
			String ii_sign_no = trim(request.getParameter("ii_sign_no"));
			Is_detailDTO is_signDetail = service.is_signDetailSearch(ii_sign_no);
			request.setAttribute("is_signSearchDetail", is_signDetail);
		}else if(command.equals("li_signSearch")) {
			String li_sign_no = trim(request.getParameter("li_sign_no"));
			Ls_detailDTO ls_signDetail = service.ls_signDetailSearch(li_sign_no);
			request.setAttribute("ls_signSearchDetail", ls_signDetail);
		}else if(command.equals("si_signSearch")) {
			String si_sign_no = trim(request.getParameter("si_sign_no"));
			Ss_detailDTO ss_signDetail =service.ss_signDetailSearch(si_sign_no);
			request.setAttribute("ss_signSearchDetail", ss_signDetail);
		}else if(command.equals("y_signSearch")) {
			String yegeum_no = trim(request.getParameter("yegeum_no"));
			Yt_detailDTO yt_signDetail = service.yt_signDetailSearch(yegeum_no);
			request.setAttribute("yt_signSearchDetail", yt_signDetail);
		}
		
		return FORM_VIEW+"signdetail/"+command+"Detail";
	}
	
	
	private String trim(String str) {
		return str == null ? null : str.trim();
	}
	
	
	
}
