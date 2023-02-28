package com.jsp.controller;

import com.jsp.service.Personservice;

public class TestUpdatePerson {
	public static void main(String[]args)
	{
		Personservice personservice=new Personservice();
		int res=personservice.savepersonservice();
		if(res>0) {
			System.out.println("Data Updated");
		}
		else {
			System.out.println("plz check the code");
		}
	}

}
