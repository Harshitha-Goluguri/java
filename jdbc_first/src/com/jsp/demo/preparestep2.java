package com.jsp.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class preparestep2 {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_first","root","Harshu@123");
			PreparedStatement prepareStatement=connection.prepareStatement("insert into user values(?,?,?)");
			prepareStatement.setInt(1, 11);
			prepareStatement.setString(2, "harshi");
			prepareStatement.setLong(3, 123456789);
			connection.close();
			System.out.println("Inserted");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
			
		
	}

}
