package com.jsp.controller;

import com.jsp.service.Personservice;

public class TestSavePerson {
	public static void main(String[] args)
	{
		Personservice personService=new Personservice();
		int res=personService.savepersonservice(1,"harshu",21,"harshu@gmail.com","harshu234");
		if (res>0)
		{
			System.out.println("data saved");
		}
		else
		{
			System.out.println("plz check data");
		}
		}

}
