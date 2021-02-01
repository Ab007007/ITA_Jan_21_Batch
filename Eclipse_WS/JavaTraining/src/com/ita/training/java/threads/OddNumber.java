package com.ita.training.java.threads;

public class OddNumber implements Runnable {

	public void run() 
	{
		printOddNum();
	}
	
	private synchronized void printOddNum()
	{
		System.out.println("--- Printing Odd numbers from 1-10 ---");
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(Thread.currentThread().getName() + i);
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
