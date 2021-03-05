package com.ita.testng.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.selenium.actitime.util.DriverUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver = null;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void validLogin()
	{
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		ActitimeUtils.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
		driver.findElement(By.id("logoutLink")).click();
	
	}
	
	
	@Test
	public void invalidLogin()
	{
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin1");
		driver.findElement(By.name("pwd")).sendKeys("manager1");
		driver.findElement(By.id("loginButton")).click();
		ActitimeUtils.sleep(5000);
//		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
	
	@AfterMethod
	public void checkStatus(ITestResult result)
	{
		if(result.getStatus() == ITestResult.FAILURE)
		{
			try {
				TakesScreenshot ss = (TakesScreenshot) driver;
				File screenShot = ss.getScreenshotAs(OutputType.FILE);
				
				FileUtils.copyFile(screenShot, new File("reports/screenShot_"+ DriverUtils.getCurrentDate() + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@AfterClass
	public void cleanup()
	{
		driver.close();
	}
	
	
	
}
