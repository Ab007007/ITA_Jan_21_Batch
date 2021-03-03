package com.ita.testng.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.testng.ActitimeTestData;

public class CreateCustomerUsingTestNG {

	WebDriver driver = null;
	
	@Parameters("browser")
	@BeforeTest
	public void createDriver(String br)
	{
		driver = ActitimeUtils.getDriver(br);
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver = null;
	}
	
	@Parameters({"url", "username" , "password"})
	@BeforeClass
	public void setup(String url, String un, String pwd) {
		
		ActitimeUtils.launch(url);
		ActitimeUtils.login(un, pwd);
		ActitimeUtils.clickOnTasks();
	}

	@AfterClass
	public void teardown() {
		ActitimeUtils.logout();
	}

	@Test(dataProvider = "createcustomer", dataProviderClass = ActitimeTestData.class)
	public void createcustomer(String cn, String cd) {
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer(cn, cd);
		ActitimeUtils.validateSuccessMessage();
	}

}
