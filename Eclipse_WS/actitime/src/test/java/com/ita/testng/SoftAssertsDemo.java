package com.ita.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertsDemo {
	
	
	
	@Test
	public void printFlow()
	{
		System.out.println("--- Start of method ---");
		int a = 10, b = 20;
		SoftAssert sa  = new SoftAssert();
		sa.assertEquals((a+b), 90);
		System.out.println("--- End of method ---");
		sa.assertAll();
	}

}
