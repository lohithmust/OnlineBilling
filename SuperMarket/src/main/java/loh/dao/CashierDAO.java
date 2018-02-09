package loh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import loh.dto.Cashier;

public class CashierDAO {
	
	Connection con = null;
	PreparedStatement pst=null;
	Statement st = null;
	ResultSet rs = null;
	public int addCashier(Cashier cashier,int id) {
		
		System.out.println("In CashierDAO");
		try {
			
			con = MyConnection.getConnection();
			pst = con.prepareStatement("insert into "+id+"cashiers(Cashiername,Cashierlevel,Cashiercontactnumber,Cashier_mailid,Cashiersalary,Cashierusername,Cashierpassword) values(?,?,?,?,?,?,?)" );       
			pst.setString(1,cashier.getCashierName());
			pst.setInt(2, cashier.getCashierLevel());
			pst.setDouble(3, cashier.getCashierContactNumber());
            pst.setString(4,cashier.getCashiermail_id());
            pst.setFloat(5,cashier.getCashierSalary());
            pst.setString(6,cashier.getcUsername());
            pst.setString(7, cashier.getcPassword());
            int x = pst.executeUpdate();
            
            if(x > 0) {
            	return 1;
            }
            
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	public Cashier cashierLogin(String username,String password,int id) {
	
		Cashier cashier = new Cashier(); {
			
			try {
				
				System.out.println("In cashier Dao");
				con = MyConnection.getConnection();
				pst = con.prepareStatement("select * from "+ id+"cashiers where Cashierusername=? and Cashierpassword=?");
				pst.setString(1, username);
                pst.setString(2, password);
				rs = pst.executeQuery();
				
				while(rs.next()) {
					
					cashier.setCashierId(rs.getInt(1));
					cashier.setCashierName(rs.getString(2));
					cashier.setCashierLevel(rs.getInt(3));
					cashier.setCashierContactNumber(rs.getDouble(4));
					cashier.setCashiermail_id(rs.getString(5));
					cashier.setCashierSalary(rs.getFloat(6));
					cashier.setcUsername(rs.getString(7));
					cashier.setcPassword(rs.getString(8));
				}
				
			}
			catch(SQLException e) {
				e.printStackTrace();
			}
			
			return cashier;
		}
		
	}

}




























