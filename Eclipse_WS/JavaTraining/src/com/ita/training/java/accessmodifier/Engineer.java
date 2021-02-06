package com.ita.training.java.accessmodifier;

public class Engineer extends Employee
{
	@Override
	public void getCompleteInfo(Employee emp) {
		emp.empInfo(emp);;
		System.out.println(emp.name + " is a Engineer");
		
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Engineer e = new Engineer();
		e.name = "AHB";
		e.emp_id = "emp1234";
		e.salary = 10010;
		e.getCompleteInfo(e);
		
		//Engineer e1 = (Engineer) e.clone();
		
	}
	
}
