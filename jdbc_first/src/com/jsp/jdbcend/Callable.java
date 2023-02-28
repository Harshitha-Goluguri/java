package com.jsp.jdbcend;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Callable {
public static void main(String[] args) {
	try {
		DriverManager.registerDriver(new Driver());
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first?user=root&password=Harshu@123");
		CallableStatement cs=c.prepareCall("call first_jdbc(?,?,?)");
		cs.setInt(1, 1);
		cs.setString(2, "Hello");
		cs.setInt(3, 26);
		cs.executeUpdate();
		c.close();
		System.out.println("Data Saved");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
