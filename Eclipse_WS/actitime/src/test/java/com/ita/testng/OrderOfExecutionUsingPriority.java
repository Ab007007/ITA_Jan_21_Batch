package com.ita.testng;

import org.testng.annotations.Test;

public class OrderOfExecutionUsingPriority 
{
  @Test
  public void login() 
  {
	  System.out.println("Login Test");
  }
  
  
  @Test(dependsOnMethods = {"login", "createCustomer" })
  public void createProject() 
  {
	  System.out.println(" Create Project");
  }
  
  @Test(dependsOnMethods = "login")
  public void createCustomer() 
  {
	 System.out.println(" Create Customer "); 
  }
  
  
}
