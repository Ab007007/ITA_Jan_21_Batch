package com.ita.training.java.access.pack1;

public class A {

	private int privateVariable = 10;
	int defaultVariable = 20;
	protected int protectedVariable = 30;
	public  int publilcVariable = 40;

	private void test1() {
		System.out.println("--------PRIVATE METHOD--------------");
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publilcVariable);
	}
	void test2() {
		System.out.println("--------DEFAULT METHOD--------------");
		
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publilcVariable);
	}
	protected void test3() {
		System.out.println("--------PROTECTED METHOD--------------");
		
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publilcVariable);
	}
	public  void test4() {
		System.out.println("--------PUBLIC METHOD--------------");
		
		System.out.println(privateVariable);
		System.out.println(defaultVariable);
		System.out.println(protectedVariable);
		System.out.println(publilcVariable);
	}
	
	
	
	
	public static void main(String[] args) {
		A a = new A();
		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}

}
