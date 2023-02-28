package com.jsp.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
			Statement statement=connection.createStatement();
			statement.execute("create table User(id int primary key,name varchar(20),phone bigint(10))");
			connection.close();
			System.out.println("table created");
		}
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
