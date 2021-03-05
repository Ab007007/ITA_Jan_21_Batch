package com.ita.testng.test;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.testng.page.DashBoardPage;
import com.ita.testng.page.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMTest {

	WebDriver driver = null;
	
	LoginPage lp =null;
	DashBoardPage dp = null;
	
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
		
		
	}
	@BeforeMethod
	public void launch()
	{
		driver.get("http://localhost/login.do");
	}
	@Test
	public void validLogin()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickloginButton();
		ActitimeUtils.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		dp.logout();
	}
	
	@Test
	public void createCustomer()
	{
		lp.enterUsername("admin");
		lp.enterPassword("manager");
		lp.clickloginButton();
		ActitimeUtils.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		
		dp.clickOnTasks();
		dp.clickonAddNew();
		dp.clickOnNewCustomerButton();
		
		dp.enterCustomerName("POM-CUST" + new Random().nextInt(5555));
		dp.enterCustomerDesc("POM-Cust");
		dp.clickCreateCustomer();
		
		dp.waitForSuccessMsg();

		dp.logout();
		
		
	}
	
	@AfterClass
	public void closeResources()
	{
		driver.close();
	}
}
