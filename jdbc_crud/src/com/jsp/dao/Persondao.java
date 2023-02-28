package com.jsp.dao;

import java.util.ArrayList;
import java.util.List;

import com.jsp.dto.Person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Persondao {
	String Driver = "com.mysql.cj.jdbc.Driver";
	String query = "jdbc:mysql://localhost:3306/jdbc_crud?user=root&password=Harshu@123";

	public int createTable() {
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(query);
			Statement statement = connection.createStatement();
			int res = statement.executeUpdate(
					"create table person(id int primarykey,name varchar(45),age int,email varchar(45),password varchar(45))");
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	public Persondao(String driver, String query) {
		super();
		Driver = driver;
		this.query = query;
	}

	public int savePerson(int id, String name, int age, String email, String password) {
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(query);
			PreparedStatement preparedStatement = connection.prepareStatement("insert into Person values(?,?,?,?,?)");
			preparedStatement.setInt(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setString(4, email);
			preparedStatement.setString(5, password);
			int res = preparedStatement.executeUpdate();
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int updatePerson(int id) {
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(query);
			Statement statement = connection.createStatement();
			int res = statement.executeUpdate("update Person set id=1002,name=Harshitha Reddy,age=23,email=harshithareddy@gmail.comwhere password=Harshitha123");
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int deletePerson(int id) {
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(query);
			PreparedStatement preparestatement = connection.prepareStatement("delete from Person where id=?");
			int res = preparestatement.executeUpdate();
			connection.close();
			return res;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<Person> getAll() {
		List<Person> list = new ArrayList<Person>();
		try {
			Class.forName(Driver);
			Connection connection = DriverManager.getConnection(query);
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from Person");
			while (rs.next()) {
			int id = rs.getInt(1);
			String name = rs.getString(2);
			int age = rs.getInt(3);
			String email = rs.getString(4);
			String password = rs.getString(5);

			Person p = new Person();
			p.setId(id);
			p.setName(name);
			p.setAge(age);
			p.setEmail(email);
			p.setPassword(password);
         	System.out.println(p);
		    list.add(p);
		} 
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public Person getPersonById(int id) {
		Person p=new Person();
		try {
			Class.forName(Driver);
			Connection connection=DriverManager.getConnection(query);
			PreparedStatement preparedStatement=connection.prepareStatement("select*from Person where id=?");
			preparedStatement.setInt(1, id);
			ResultSet rs=preparedStatement.executeQuery();
			while(rs.next()) {
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setAge(rs.getInt(3));
				p.setEmail(rs.getString(4));
				p.setPassword(rs.getString(5));
			}
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
				
			}
		    return p;
			}
	
		
	}

