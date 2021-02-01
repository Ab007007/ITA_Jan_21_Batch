package com.ita.training.java.threads;

public class OddEvenUsingThreadClass {

	
	public static void main(String[] args) {
		
		EvenNumberUsingThread evt = new EvenNumberUsingThread();
		OddNumberUsingThread ont = new OddNumberUsingThread();
		
		evt.start();
		ont.start();
	}
}
