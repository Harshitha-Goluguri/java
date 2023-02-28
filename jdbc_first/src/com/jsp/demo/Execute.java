package com.jsp.demo;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class Execute {
	public static void main(String[]args)
	{
		try {
		DriverManager.registerDriver(new Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("Select * from User");
		while(resultSet.next()) {
			System.out.println("User id:"+resultSet.getInt(1));
			System.out.println("User name"+resultSet.getString(2));
			System.out.println("phone"+resultSet.getLong(3));
		}
		System.out.println(resultSet);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		
		
		
	     
		
	}
	

}
