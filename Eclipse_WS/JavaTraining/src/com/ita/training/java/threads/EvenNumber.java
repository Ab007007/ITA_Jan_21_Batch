package com.ita.training.java.threads;

public class EvenNumber implements Runnable
{

	@Override
	public void run() {
		printEven();
	}
	
	
	private synchronized void printEven()
	{
		System.out.println("--- Printing Even numbers from 1-10 ---");
		for (int i = 2; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName()  + i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
