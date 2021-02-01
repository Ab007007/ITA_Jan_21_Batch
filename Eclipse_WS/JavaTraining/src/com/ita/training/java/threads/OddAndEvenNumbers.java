package com.ita.training.java.threads;

public class OddAndEvenNumbers {

	
	public static void main(String[] args) throws InterruptedException {
		
		OddNumber od = new OddNumber();
		EvenNumber ev = new EvenNumber();
		
		Thread t1 = new Thread(ev);
		t1.setPriority(Thread.MIN_PRIORITY);
		t1.setName("EvenNumber " );
		Thread t2 = new Thread(od);
		t2.setName("OddNumber ");
		
		t1.start();
		t2.start();
	
		
		System.out.println("--- Printing  numbers from 1-10 ---");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println("main" + i);
			Thread.sleep(1000);
		}
	}
}
