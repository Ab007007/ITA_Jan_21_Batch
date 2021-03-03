package com.ita.testng;

import org.testng.annotations.Test;

public class GroupingTests {

	@Test(groups = {"mahendra" , "bigcar"})
	public void xuv500()
	{
		
	}
	@Test(groups = {"mahendra" , "smallcar"})
	public void xuv300()
	{
		
	}
	
	@Test(groups = {"suzuki" , "smallcar"})
	public void swift()
	{
		
	}
	@Test(groups = {"suzuki" , "bigcar"})
	public void ertiga()
	{
		
	}

	@Test(groups = {"kia" , "smallcar"})
	public void celtos()
	{
		
	}
	@Test(groups = {"kia" , "bigcar"})
	public void carnival()
	{
		
	}
	
}
