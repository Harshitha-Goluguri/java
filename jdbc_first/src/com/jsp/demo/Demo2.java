package com.jsp.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Demo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
					System.out.println(connection);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
