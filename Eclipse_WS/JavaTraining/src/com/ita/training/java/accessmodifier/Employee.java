package com.ita.training.java.accessmodifier;

public abstract class Employee {

	String name;
	String emp_id;
	double salary;
	String role;
	
	public void empInfo(Employee emp)
	{
		System.out.println(emp.name + " - " + emp.emp_id + " - " + emp.salary);
	}
	
	public void greetings()
	{
		System.out.println("--- Welcome to Employee info ---");
	}
	
	public abstract void getCompleteInfo(Employee emp);
	
}
