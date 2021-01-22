package com.ita.training.java.employee;

class Employee {
	String empID;
	String officialEmailId;
	long officePhoneNum;
	
	public Employee(String empID,String officialEmailId, long officePhoneNum)
	{
		this.empID = empID;
		this.officialEmailId = officialEmailId;
		this.officePhoneNum = officePhoneNum;
	}
	
	public Employee() {
		System.out.println();
	}
	
	public String toString()
	{
		return "Employee Details are \nEmployee_ID - " + this.empID  + "\nEmployee_Email - " + this.officialEmailId + "\nEmployeePhone - " + this.officePhoneNum 
				+ "\n-------------------------------------------";
	}
}

public class EmployeeManager {

	public static void main(String[] args) {
		Employee e1 = new Employee("emp_id1","abc@domain.com",23232);
		Employee e2 = new Employee("emp_id2","pqr@domain.com",23232);
		Employee e3 = new Employee();
		
		System.out.println(e1);
		System.out.println(e2);
	}
}
