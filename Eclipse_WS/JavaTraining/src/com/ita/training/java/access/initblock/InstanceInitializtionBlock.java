package com.ita.training.java.access.initblock;

public class InstanceInitializtionBlock 
{
	static int count =0;
	
	{
		++count;
		System.out.println("instance block");
	}
	
	
	public InstanceInitializtionBlock() {
		System.out.println("constructor");
	
	}
	
	public static void main(String[] args) {
		
		InstanceInitializtionBlock ib1 = new InstanceInitializtionBlock();
		InstanceInitializtionBlock ib2 = new InstanceInitializtionBlock();
		InstanceInitializtionBlock ib3 = new InstanceInitializtionBlock();
		InstanceInitializtionBlock ib4= new InstanceInitializtionBlock();
		InstanceInitializtionBlock ib5 = new InstanceInitializtionBlock();
		InstanceInitializtionBlock ib6 = new InstanceInitializtionBlock();
		
		
		
		System.out.println(count);
	}

}
