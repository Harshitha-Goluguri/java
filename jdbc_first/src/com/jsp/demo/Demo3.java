package com.jsp.demo;
import java.sql.*;
public class Demo3 {
	 public static void main(String args[])
	 {
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
			 Statement statement= connection.createStatement();
			 statement.execute("insert into  User values(101,'Harshitha',6281122646)");
			 connection.close();
			 System.out.println("Values inserted");
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

