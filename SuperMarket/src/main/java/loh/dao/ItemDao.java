package loh.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import loh.dto.Item;

public class ItemDao {

	Connection con = null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	Statement st = null;


	public int addItem(Item item,int id) {

		try {
			con = MyConnection.getConnection();
			pst = con.prepareStatement("insert into "+id+"Items(Itemname,ItemPrice,ItemCode) values(?,?,?)");
			pst.setString(1,item.getItemName());
			pst.setFloat(2,item.getItemPrice());
			pst.setString(3, item.getItemCode());
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


	public List itemList(int id) {

		List <Item> itemList = null; 

		try {

			con = MyConnection.getConnection();
			pst = con.prepareStatement("select * from "+id+"Items");
			rs = pst.executeQuery();

			if(rs.next()) {
				itemList = new ArrayList<Item>();
				do {
					Item item = new Item();

					item.setItemId(rs.getInt(1));
					item.setItemName(rs.getString(2));
					item.setItemPrice(rs.getFloat(3));
					item.setItemCode(rs.getString(4));

					itemList.add(item);

				}while(rs.next());
			}
		}
		catch(SQLException e) {

			e.printStackTrace();

		}

          return itemList;

	}

}
































