package com.ita.training.java.threads;

public class SyncronizedDemo {

	
	public static void main(String[] args) {
		
		
		EvenNumber ev = new EvenNumber();
		Thread t1 = new Thread(ev);
		Thread t2 = new Thread(ev);
		
		t1.setName("Thread1 : ");
		t2.setName("Thread2 : ");
		
		t1.start();
		t2.start();
		
	}
}
