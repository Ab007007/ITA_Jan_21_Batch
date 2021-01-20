package com.ita.training.java.variables;

class Person {
	String name;
	int age;
	long phoneNum;
	static final String country = "India";
}

public class PersonManager {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Aravinda";
		p1.age = 38;
		p1.phoneNum = 100100;
		//p1.country = "USA";
		
		Person p2 = new Person();
		p2.name = "AHB";
		p2.age = 20;
		p2.phoneNum = 200200;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.phoneNum);
		System.out.println(Person.country);
		System.out.println(Person.country);
		System.out.println(p2.phoneNum);
		System.out.println(p2.age);
		System.out.println(p2.name);
	}

}
