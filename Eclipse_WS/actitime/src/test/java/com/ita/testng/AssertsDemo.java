package com.ita.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertsDemo {
	
	
	
	@Test
	public void printFlow()
	{
		System.out.println("--- Start of method ---");
		int a = 10, b = 20;
		Assert.assertEquals((a+b), 90);
		System.out.println("--- End of method ---");
		
	}

}
