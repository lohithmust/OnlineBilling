package loh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import loh.dto.Cashier;
import loh.dto.Company;



public class Login {
	
	     Connection con = null;
	     PreparedStatement pst = null;
	     Statement st = null;
	     ResultSet rs = null;
	
	 public Company companyLogin(String username,String Password) {
		 
		 Company comp = new Company();
		 
		 try {
		 con = MyConnection.getConnection();
		 System.out.println(username + "," + Password);
			pst = con.prepareStatement("select * from Company where username = ? and Password = ?");
	       pst.setString(1, username);
	       pst.setString(2, Password);
			rs = pst.executeQuery();    
			
			
			while(rs.next()) {
				comp.setCompanyId(rs.getInt(1));
				comp.setCompanyName(rs.getString(2));
				comp.setUsername(rs.getString(7));
				System.out.println(rs.getString(2));
				return comp;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 return null;
	 }
	

	 public Cashier cashierLogin(String username,String password) {
		 
		 Connection con = null;
		 PreparedStatement pst = null;
		 ResultSet rs = null;
		 
		 try {
			 
			 con = MyConnection.getConnection();
			 pst = con.prepareStatement("select * from "+" "+"where username = ? and password = ?");
			 pst.setString(1, username);
			 pst.setString(2, password);
			 
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return null;
	 }
	 
	 public int cashierTable(String tCashier) {
		 
		 System.out.println(tCashier);
		 
		 try {
		 con = MyConnection.getConnection();
		 st = con.createStatement();
		 st.executeUpdate("create table "+ tCashier+"(CashierId int(5) Auto_Increment primary key, Cashiername varchar(30),Cashierlevel int(2),CashiercontactNumber bigint(20),Cashier_mailid varchar(30),CashierSalary double(8,2),Cashierusername varchar(20),Cashierpassword varchar(20) )");
		 st.executeUpdate("alter table "+tCashier+" Auto_Increment = 10 ");
		 
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 return 1;
	 }
	 
	 public int itemTable(String iCompany) {
		
		 System.out.println(iCompany);
		 try { 
			 con = MyConnection.getConnection();
			 st = con.createStatement();
			 st.executeUpdate("create table "+ iCompany+"(ItemId int(4) Auto_Increment primary key, Itemname varchar(30),ItemPrice double(8,2),Itemcode varchar(30) unique )");
			 st.executeUpdate("alter table "+iCompany+" Auto_Increment = 10 ");
			 return 1;
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
		 return 0;
	 }
	 
	 public Company detailsCompany(String username) {
		 Company company = new Company();
		 try {
			 System.out.println("username");
			 con = MyConnection.getConnection();
			 pst = con.prepareStatement("select * from Company where username = ? ");
			 pst.setString(1, username);
			 
			 rs = pst.executeQuery();
			 System.out.println("in company details");
					 while(rs.next()) {
						 company.setCompanyId(rs.getInt(1));
						 company.setCompanyName(rs.getString(2));
						 company.setCompanyOwner(rs.getString(3));
						 company.setContactNumber(rs.getDouble(4));
						 company.setMail(rs.getString(5));
						 company.setPassword(rs.getString(6));
						 company.setUsername(rs.getString(7));
						
						
					 }
			 
			 
		 }
		 catch(SQLException e) {
			 e.printStackTrace();
		 }
		 
		 return company;
	 }
}














