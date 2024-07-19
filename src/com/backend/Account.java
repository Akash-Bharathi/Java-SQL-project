package com.backend;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Account extends DBConnect{
	public boolean login(String username,String password)
	{
		try
		{
			String q="select * from tblusers where  username=? and password=?";
			PreparedStatement pst = con.prepareStatement(q);
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs = pst.executeQuery();
			return rs.next();//true if matchin record is found. Else false.
		}
		catch(SQLException e)
		{
			System.out.println("Connection failed.");
			System.out.println(e);
		}
		return false;
	}
}
