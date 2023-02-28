package com.jsp.service;
import com.jsp.dao.Persondao;
import com.jsp.dto.Person;

import java.util.List;
public class Personservice {
	Persondao dao=new Persondao();
	public int createTableservice() {
		int res=dao.createTable();
		return dao.createTable();
	}
	public int savepersonservice(int id ,String name,int age,String email,String password)
	{
		return dao.savePerson(id, name, age, email, password);
				
	}
	public List<Person>getAllservice(){
		return dao.getAll();
		
	}
	public Person getPersonByIdservice(int id) {
		return dao.getPersonById(id);
	}
	
}
