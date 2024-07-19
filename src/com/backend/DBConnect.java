package com.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect 
{
	protected Connection con;
	public DBConnect()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection("jdbc:mysql://localhost:3307/project003","root","root");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Driver class not found");
		}
		catch(SQLException e)
		{
			System.out.println("Connection failed.");
			System.out.println(e);
		}
	}	
}
