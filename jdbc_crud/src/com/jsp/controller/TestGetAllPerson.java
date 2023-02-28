package com.jsp.controller;
import java.util.List;
import com.jsp.dto.Person;

import com.jsp.service.Personservice;

public class TestGetAllPerson {
	public static void main(String[] args)
	{
		Personservice personservice=new Personservice();
		List<Person> res=personservice.getAllservice();
		for(Person p:res) {
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getEmail());
			System.out.println(p.getPassword());
		}
		
	}

}
