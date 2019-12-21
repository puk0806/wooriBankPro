package search.accountsearch.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.command.CommandHandler;
import com.model.UserDTO;

import search.accountsearch.dao.SearchDAO;
import search.accountsearch.model.DepositDTO;
import search.accountsearch.model.ForeignDTO;
import search.accountsearch.model.FundDTO;
import search.accountsearch.model.GoldDTO;
import search.accountsearch.model.InsuranceDTO;
import search.accountsearch.model.LoanDTO;
import search.accountsearch.model.MutualDTO;
import search.accountsearch.model.SavingDTO;
import search.accountsearch.model.SearchDTO;
import search.accountsearch.service.SearchService;

public class SearchHandler implements CommandHandler{

private static final String FORM_VIEW= "/search/accountsearch";
	
	@Override
	public String process(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String command  = request.getRequestURI();
		if(command.indexOf(FORM_VIEW)==15) {
			command = command.substring(FORM_VIEW.length()+15,command.length()-3);
		}
		
		SearchService service  = new SearchService();
		UserDTO user = (UserDTO) request.getSession().getAttribute("authUser");
		
		
		if(command.equals("/search")) {
			List<SearchDTO> searchList = service.searchSelect(user.getUser_id());
			List<DepositDTO> depositList = service.depositSelect(user.getUser_id());
			List<SavingDTO> savingList = service.savingSelect(user.getUser_id());
			
			request.setAttribute("searchList", searchList);
			request.setAttribute("depositList", depositList);
			request.setAttribute("savingList", savingList);
		}else if(command.equals("/fundSearch")) {
			List<FundDTO> fundList = service.fundSelect(user.getUser_id());
			List<MutualDTO> mutualList = service.mutualSelect(user.getUser_id());
			
			request.setAttribute("fundList", fundList);
			request.setAttribute("mutualList", mutualList);
		}else if(command.equals("/loanSearch") ) {
			List<LoanDTO> loanList = service.loanSelect(user.getUser_id());
			request.setAttribute("loanList", loanList);
		}else if(command.equals("/foreignSearch")) {
			List<ForeignDTO> foreignList = service.foreignSelect(user.getUser_id());
			request.setAttribute("foreignList", foreignList);
		}else if(command.equals("/goldSearch")) {
			List<GoldDTO> goldList = service.goldSelect(user.getUser_id());
			request.setAttribute("goldList", goldList);
		}else if(command.equals("/insuranceSearch")) {
			List<InsuranceDTO> insuranceList = service.insuranceSelect(user.getUser_id());
			request.setAttribute("insuranceList", insuranceList);
		}else if(command.equals("/allSearch")) {
			List<SearchDTO> searchList = service.searchSelect(user.getUser_id());
			List<DepositDTO> depositList = service.depositSelect(user.getUser_id());
			List<SavingDTO> savingList = service.savingSelect(user.getUser_id());
			List<FundDTO> fundList = service.fundSelect(user.getUser_id());
			List<MutualDTO> mutualList = service.mutualSelect(user.getUser_id());
			List<LoanDTO> loanList = service.loanSelect(user.getUser_id());
			List<ForeignDTO> foreignList = service.foreignSelect(user.getUser_id());
			List<GoldDTO> goldList = service.goldSelect(user.getUser_id());
			List<InsuranceDTO> insuranceList = service.insuranceSelect(user.getUser_id());
			
			request.setAttribute("searchList", searchList);
			request.setAttribute("depositList", depositList);
			request.setAttribute("savingList", savingList);
			request.setAttribute("fundList", fundList);
			request.setAttribute("mutualList", mutualList);
			request.setAttribute("loanList", loanList);
			request.setAttribute("foreignList", foreignList);
			request.setAttribute("goldList", goldList);
			request.setAttribute("insuranceList", insuranceList);
			
		}
		
		
		return FORM_VIEW+command;
	}
	
}
