package com.myapp.dao;

public class MyDAOImpl {

	public boolean saveEmployee(String name) {
		//complex logic to save employee in DB
		System.out.println(name +" has been saved successfully..!");
		return true;
	}
}
