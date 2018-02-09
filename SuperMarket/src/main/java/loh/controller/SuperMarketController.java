package loh.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import loh.dao.Login;
import loh.dao.Register;
import loh.dto.Cashier;
import loh.dto.Company;
import loh.dto.Item;
import loh.helper.Helper;

@Controller
public class SuperMarketController {

	@RequestMapping("/SuperMarket")

	public  ModelAndView homePage(){

		ModelAndView mv = new ModelAndView("HomePage");

		return mv;
	}


	@RequestMapping("/RegisterCompany")
	public ModelAndView registerCompany(Company register) {
		Register add = new Register();
		Helper helper = new Helper();
		System.out.println(register);
		int x = helper.addCompany(register);
		if(x > 0) {
			ModelAndView mv = new ModelAndView("success");
			return mv;
		}
		ModelAndView mv = new ModelAndView("failure");
		return mv;
	}

	@RequestMapping("/login")
	public ModelAndView login(@RequestParam("loginas") String loginas,@RequestParam("username") String username,
			@RequestParam("password") String password,HttpServletRequest request) {

		System.out.println("in login");

		Company company = new Company();
		Helper helper = new Helper();
		Cashier cashier = new Cashier();

		System.out.println(loginas);

		if(loginas.equals("companylogin")) {

			System.out.println("In company Login");

			company =  helper.companyLogin(username, password,request);

			if(company != null) {

				ModelAndView mv = new ModelAndView("LoginPage");

				mv.addObject("company", company.getCompanyName()) ;
				return mv;
			}
			else {
				ModelAndView mv = new ModelAndView("LoginFailed");
				return mv;  
			}
		}


		if(loginas.equals("cashierlogin")) {

			System.out.println("In Cashier Login");


			cashier = helper.cashierLogin(username, password, request);
			System.out.println(cashier);
			if(cashier != null) {
				System.out.println("In success");
				ModelAndView mv = new ModelAndView("cashierLoginPage");
				mv.addObject("cashiername", cashier.getCashierName());
				return mv;

			}
			else {

				ModelAndView mv = new ModelAndView("cashierLoginFailed");
				return mv;
			}

		}
		System.out.println("nothing");
		return null;
	}

	@RequestMapping("/cashier")
	public ModelAndView cashier(@RequestParam ("cashier") String cashier,@RequestParam ("username") String username,
			@RequestParam ("password") String password) {
		Login login = new Login();
		Cashier Rcashier = new Cashier();
		System.out.println(cashier);
		if(cashier == "cashierlogin") {

			Rcashier = login.cashierLogin(username,password);
		}		

		return null;
	}

	@RequestMapping("/addcashier")
	public ModelAndView addCashier(Cashier cashier ,HttpServletRequest request) {

		Helper helper = new Helper();


		int x = helper.addCashier(cashier, request);

		if(x > 0) {

			ModelAndView mv = new ModelAndView("cashiersuccess");
			return mv;
		}
		else {

			ModelAndView mv = new ModelAndView("addcashierfailure");
			return mv;

		}

	}


	@RequestMapping("/billing")
	public ModelAndView billing(HttpServletRequest request) {
        
		List<Item> itemsList = new ArrayList<Item>();
		
		Helper helper = new Helper();
		 itemsList = helper.itemList(request);
		ModelAndView mv = new ModelAndView("billingpage");
		System.out.println(itemsList);
       
		



		return null;
	}

	@RequestMapping("/additem")
	public ModelAndView addItem(Item item,HttpServletRequest request) {
		Helper helper = new Helper();

		int x = helper.addItem(item, request);

		if(x > 0) {

			ModelAndView mv = new ModelAndView("additems");
			mv.addObject("successfull", "Item Added successfully");
			return mv;
		}
		else {
			ModelAndView mv = new ModelAndView("failure");
			return mv;
		}   		

	}
}











