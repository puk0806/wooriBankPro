package admin.product.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;

import com.prodetail.model.Fos_detailDTO;
import com.prodetail.model.Fus_detailDTO;
import com.prodetail.model.Gs_detailDTO;
import com.prodetail.model.Is_detailDTO;
import com.prodetail.model.Ls_detailDTO;
import com.prodetail.model.Ss_detailDTO;
import com.prodetail.model.Yt_detailDTO;
import com.product.model.Y_itemDTO;
import com.util.ConnectionProvider;

import admin.prodetail.dao.Fos_detailDAO;
import admin.prodetail.dao.Fus_detailDAO;
import admin.prodetail.dao.Gs_detailDAO;
import admin.prodetail.dao.Is_detailDAO;
import admin.prodetail.dao.Ls_detailDAO;
import admin.prodetail.dao.Ss_detailDAO;
import admin.prodetail.dao.Yt_detailDAO;

public class ProductSignDetailSearchService {


	public Fos_detailDTO fos_signDetailSearch(String foi_sign_no) {
		Fos_detailDAO dao = Fos_detailDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			Fos_detailDTO dto = dao.selectByNo(conn,foi_sign_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService fos_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public Fus_detailDTO fus_signDetailSearch(String fui_sign_no) {
		Fus_detailDAO dao = Fus_detailDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			Fus_detailDTO dto = dao.selectByNo(conn,fui_sign_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService fus_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public Gs_detailDTO gs_signDetailSearch(String gi_sign_no) {
		Gs_detailDAO dao = Gs_detailDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			Gs_detailDTO dto = dao.selectByNo(conn,gi_sign_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService gs_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	
	public Is_detailDTO is_signDetailSearch(String ii_sign_no) {
		Is_detailDAO dao = Is_detailDAO.getInstance();

		try(Connection conn = ConnectionProvider.getConnection()){
			Is_detailDTO dto = dao.selectByNo(conn,ii_sign_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService is_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public Ls_detailDTO ls_signDetailSearch(String li_sign_no) {
		Ls_detailDAO dao = Ls_detailDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			Ls_detailDTO dto = dao.selectByNo(conn,li_sign_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService ls_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public Ss_detailDTO ss_signDetailSearch(String si_sign_no) {
		Ss_detailDAO dao = Ss_detailDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			Ss_detailDTO dto = dao.selectByNo(conn,si_sign_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService ss_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}

	public Yt_detailDTO yt_signDetailSearch(String yegeum_no) {
		Yt_detailDAO dao = Yt_detailDAO.getInstance();
		
		try(Connection conn = ConnectionProvider.getConnection()){
			Yt_detailDTO dto = dao.selectByNo(conn,yegeum_no);
			return dto;
		} catch (SQLException | NamingException e) {
			System.out.println("ProductSignDetailSearchService yt_signDetailSearch 예외 발생");
			throw new RuntimeException(e);
		}
	}
	
	

}
