package com.ita.assignments.advanced;

public class Person implements Cloneable
{

	String name;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Person) super.clone();
	}
	
	public Person(String name) {
		System.out.println("constructor called ");
		this.name = name;
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
		Person p1 = new Person("Ahb");
		try
		{
			Person p2 = (Person)p1.clone();
			System.out.println(p2.name);
			p2.name = "XYZ";
			System.out.println("p1 name " + p1.name);
			System.out.println("p2 name " + p2.name);
			
		}
		catch(Exception ex)
		{
			System.out.println("error");
		}
	}
}
