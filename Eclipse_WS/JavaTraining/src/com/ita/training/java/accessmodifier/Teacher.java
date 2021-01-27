package com.ita.training.java.accessmodifier;

public class Teacher extends Employee
{

	@Override
	public void getCompleteInfo(Employee emp) {
		System.out.println("My Teacher is good : " + emp.name);
		emp.empInfo(emp);
		
	}

}
