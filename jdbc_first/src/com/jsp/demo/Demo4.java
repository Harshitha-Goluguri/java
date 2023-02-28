package com.jsp.demo;
import java.sql.*;
public class Demo4 {
public static void main(String[]args)
{
	try { 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
	Statement statement=connection.createStatement();
	statement.execute("update User set name='HarshithaGoluguri',phone=1234567890 where id=101");
	connection.close();
	System.out.println("updated the values");
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
