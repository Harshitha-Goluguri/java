package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class Exexecuteupdate {
	public static void main(String[]args)
	{try {
		DriverManager.registerDriver(new Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
		PreparedStatement prepareStatement=connection.prepareStatement("insert into User values"(?,?,?)");"
		PreparedStatement.setInt(1,102);
		PreparedStatement.SetName(2,"neeha");
		PreparedStatement.SetPhone(3,23456456);
		int res=preparedStatement
		
	}

}
