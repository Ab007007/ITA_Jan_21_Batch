package com.ita.testng;

import org.testng.annotations.DataProvider;

public class ActitimeTestData 
{

	
	  @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { 1, "a" ,"ARA"},
	      new Object[] { 2, "b" ,"CSC"},
	    };
	  }
	  
	  
	  
	  @DataProvider
	  public Object[][] createcustomer() {
	    return new Object[][] {
	      new Object[] {"ITA-TestNG-Custo-7","ITA-TestNG-Custo-1" },
	      new Object[] {"ITA-TestNG-Custo-8","ITA-TestNG-Custo-2" },
	      new Object[] {"ITA-TestNG-Custo-9","ITA-TestNG-Custo-6" }
	    };
	  }
	  
	  
	  @DataProvider
	  public Object[][] createproject() {
	    return new Object[][] {
	      new Object[] {"ITA-TestNG-Custo-1","Project1" , "ITA-ProjectDesc-1" },
	      new Object[] {"ITA-TestNG-Custo-1","Project2" , "ITA-ProjectDesc-1" },
	      new Object[] {"ITA-TestNG-Custo-1","Project3" , "ITA-ProjectDesc-1" },
	      new Object[] {"ITA-TestNG-Custo-2","Project1" , "ITA-ProjectDesc-1" },
	      new Object[] {"ITA-TestNG-Custo-3","Project1" , "ITA-ProjectDesc-1" },
	      new Object[] {"ITA-TestNG-Custo-3","Project4" , "ITA-ProjectDesc-1" },
	      new Object[] {"ITA-TestNG-Custo-6","Project1" , "ITA-ProjectDesc-1" },
	    };
	  }
}
