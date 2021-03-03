package com.ita.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingDependsOn 
{
  @Test(priority = 1)
  public void login() 
  {
	  System.out.println("Login Test");
  }
  
  
  @Test(priority = 3)
  public void createProject() 
  {
	  System.out.println(" Create Project");
  }
  
  @Test(priority = 2)
  public void createCustomer() 
  {
	 System.out.println(" Create Customer "); 
  }
  
  
}
