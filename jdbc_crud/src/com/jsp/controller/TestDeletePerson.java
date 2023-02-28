package com.jsp.controller;
import com.jsp.service.Personservice;

public class TestDeletePerson {
	public static void main(String[]args) {
		Personservice personservice=new Personservice();
		int res=personservice.savepersonservice();
		if(res>0) {
			System.out.println("Data Deleted");
		}
		else {
			System.out.println("plz check the code");
		}
	}

}
