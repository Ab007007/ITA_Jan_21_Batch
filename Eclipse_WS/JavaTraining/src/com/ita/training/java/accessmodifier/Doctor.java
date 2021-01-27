package com.ita.training.java.accessmodifier;

public class Doctor extends Employee
{

	@Override
	public void getCompleteInfo(Employee emp) {
		emp.empInfo(emp);;
		System.out.println(emp.name + " is a Doctor");
		
	}
	
	
	public static void main(String[] args) {
		Doctor d = new Doctor();
		
		d.name = "suresh";
		d.emp_id =  "apolo_123sr";
		d.salary = 1231546;
		d.getCompleteInfo(d);
	}
}
