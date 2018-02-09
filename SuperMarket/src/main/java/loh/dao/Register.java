package loh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import loh.dto.Company;

public class Register {


	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rs = null;
	int x=0;

	public   int addCompany(Company company) {

		System.out.println("In register dao");
		try {
			con = MyConnection.getConnection();
			pst = con.prepareStatement("insert into Company(CompanyName,CompanyOwner,MailId,ContactNumber,Password,username) values(?,?,?,?,?,?)");
			pst.setString(1,company.getCompanyName());
			pst.setString(2,company.getCompanyOwner());
			pst.setString(3,company.getMail());
			pst.setDouble(4,company.getContactNumber());
			pst.setString(5,company.getPassword());
			pst.setString(6,company.getUsername());
			x = pst.executeUpdate();
          System.out.println(x);
          
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return x;
	}

}
