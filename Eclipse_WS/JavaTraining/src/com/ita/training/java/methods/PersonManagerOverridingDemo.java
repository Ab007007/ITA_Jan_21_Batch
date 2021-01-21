package com.ita.training.java.methods;

class Person {
	String name;
	int age;
	long phoneNum;
	static final String country = "India";
	
	public String toString() {
		// TODO Auto-generated method stub
		String str = "Person Values are \nName - "  + this.name + "\nage -" +
		this.age + "\nPhone number - " + this.phoneNum + "\nconutry " + country; 	
		return str;
	}
}

public class PersonManagerOverridingDemo {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();

		p1.name = "Aravinda";
		p1.age = 38;
		p1.phoneNum = 100100;
		p2.name = "AHB";
		p2.age = 20;
		p2.phoneNum = 200200;
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
