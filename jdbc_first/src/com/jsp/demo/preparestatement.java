package com.jsp.demo;

import java.sql.DriverManager;

import com.mysql.cj.jdbc.Driver;

public class preparestatement {
	try {
		DriverManager.registerDriver(new Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
		prepareStatement.setInt(1,11);
		prepareStatement.setSting(2,"Harshi")
		
	}

}
