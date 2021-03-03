package com.ita.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
 
	
  @Test(dataProvider = "dp", dataProviderClass = ActitimeTestData.class)
  public void f(Integer n, String s, String s1) 
	{
		System.out.println(n + " - "+s +  " - "+ s1 +" - ");
  }


}
