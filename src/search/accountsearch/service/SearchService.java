package search.accountsearch.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.util.ConnectionProvider;

import search.accountsearch.dao.DepositDAO;
import search.accountsearch.dao.ForeignDAO;
import search.accountsearch.dao.FundDAO;
import search.accountsearch.dao.GoldDAO;
import search.accountsearch.dao.InsuranceDAO;
import search.accountsearch.dao.LoanDAO;
import search.accountsearch.dao.MutualDAO;
import search.accountsearch.dao.SavingDAO;
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

public class SearchService {
	
	public List<SearchDTO> searchSelect(String user_id) {
		SearchDAO dao = SearchDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<SearchDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService searchSelect 예외 발생");
			throw new RuntimeException(e);
		}
	}
	
	public List<DepositDTO> depositSelect(String user_id){
		DepositDAO dao = DepositDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<DepositDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService depositSelect 예외 발생");
			throw new RuntimeException(e);
		}
		
	}
	
	public List<SavingDTO> savingSelect(String user_id){
		SavingDAO dao = SavingDAO.getInstance();
		try(Connection conn = ConnectionProvider.getConnection()){
			List<SavingDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService savingSelect 예외 발생");
			throw new RuntimeException(e);
		}
	}
	
	public List<LoanDTO> loanSelect(String user_id){
		LoanDAO dao = LoanDAO.getInstance();
		try(Connection conn = ConnectionProvider.getConnection()){
			List<LoanDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService loanSelect 예외 발생");
			throw new RuntimeException(e);
		}
		
	}
	
	public List<ForeignDTO> foreignSelect(String user_id){
		ForeignDAO dao = ForeignDAO.getInstance();
		try(Connection conn = ConnectionProvider.getConnection()){
			List<ForeignDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService foreignSelect 예외 발생");
			throw new RuntimeException(e);
		}
		
	}
	
	public List<GoldDTO> goldSelect(String user_id){
		GoldDAO dao = GoldDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<GoldDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService goldSelect 예외 발생");
			throw new RuntimeException(e);
		}
	}
	
	public List<InsuranceDTO> insuranceSelect(String user_id){
		InsuranceDAO dao = InsuranceDAO.getInstance();
		try(Connection conn = ConnectionProvider.getConnection()){
			List<InsuranceDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService goldSelect 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public List<FundDTO> fundSelect(String user_id){
		FundDAO dao = FundDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<FundDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService fundSelect 예외 발생");
			throw new RuntimeException(e);
		}
		
	}
	
	public List<MutualDTO> mutualSelect(String user_id){
		MutualDAO dao = MutualDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			List<MutualDTO> list = dao.selectList(conn,user_id);
			return list;
		} catch (SQLException | NamingException e) {
			System.out.println("SearchService mutualSelect 예외 발생");
			throw new RuntimeException(e);
		}
		
	}
}
