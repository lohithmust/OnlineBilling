package loh.helper;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import loh.dao.CashierDAO;
import loh.dao.ItemDao;
import loh.dao.Login;
import loh.dao.Register;
import loh.dto.Cashier;
import loh.dto.Company;
import loh.dto.Item;

public class Helper {
	
	public int  addCompany(Company register) {
		
		Register add = new Register();
		Company company = new Company();
		Login login = new Login();
		
		int x = add.addCompany(register);
		       
		company = login.detailsCompany(register.getUsername());
		
		System.out.println(company);
		   
			   String tCashier = ""+ company.getCompanyId()+"cashiers";
			  int y = login.cashierTable(tCashier);
			  
			  String iCompany = "" + company.getCompanyId() + "Items";
			     int z = login.itemTable(iCompany);
		   
			    if(x != 0 && y!=0) {
			    	return 1;
			    }
			    	 return 0;
		
		
	}
	
	public Company companyLogin(String username,String password,HttpServletRequest request) {
		Company company = new Company();
		Login login = new Login();
		company = login.companyLogin(username, password);
		System.out.println(company);
		if(company != null) {
			HttpSession session = request.getSession(true);
			session.setAttribute("companyid", company.getCompanyId());
			session.setAttribute("companyname", company.getCompanyId());
			return company;
		}
		return null;
	}
	
	public int addCashier(Cashier cashier,HttpServletRequest request) {
		
		System.out.println("In addCashier helper");
		CashierDAO addcashier = new CashierDAO();
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("companyid");
		
		System.out.println(id);
		int x = addcashier.addCashier(cashier, id);
		if(x>0) {
			return 1;
		}
		
		return 0;
	}

	public Cashier cashierLogin(String username,String password,HttpServletRequest request) {
		
		System.out.println("In Helper Cashier Login");
		Cashier cashier = new Cashier();
		CashierDAO cashierlogin = new CashierDAO();
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("companyid");
		
		System.out.println(id);
		cashier = cashierlogin.cashierLogin(username, password,id);
		
		System.out.println(cashier);
		if(cashier != null) {
			
			 session = request.getSession();
			session.setAttribute("companyid", id);
			session.setAttribute("cashierid", cashier.getCashierId());
			
			return cashier;
			
		}
		return null;
	}
	

	public int addItem(Item item,HttpServletRequest request) {
		
		ItemDao itemdao = new ItemDao();
		
		HttpSession session = request.getSession(false);
		int id = (int) session.getAttribute("companyid");
		
		int x = itemdao.addItem(item, id);
		if(x > 0) {
			return x;
		}
		
		return 0;
		
	}
	
	public List itemList(HttpServletRequest request) {
		
		ItemDao itemdao = new ItemDao();
		List<Item> itemList = new ArrayList<Item>();
		HttpSession session = request.getSession(false);
		int companyid = (int) session.getAttribute("companyid");
		int cashierid = (int) session.getAttribute("cashierid");
		
		 itemList = itemdao.itemList(companyid);
		
		 return itemList;
		
	}
}

























