package com.jsp.controller;
import com.jsp.service.Personservice;

public class TestCreateTable {
	public static void main(String args[])
	{
		Personservice ps=new Personservice();
		int res=ps.createTableservice();
		if(res==0)
		{
			System.out.println("Table created");
		}
		else {
			System.out.println("please check the code");
		}
		
		}

}
