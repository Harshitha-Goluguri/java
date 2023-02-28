package com.jsp.demo;
import java.sql.*;

public class Demo5 {
	public static void main(String args[])
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
			Statement statement=connection.createStatement();
			statement.execute("select*from User");
			connection.close();
			System.out.println("Selected Successfully");}
		
			catch(ClassNotFoundException e)
			{
				e.printStackTrace();
				
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
	}

}
