package com.ita.testng.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.selenium.actitime.util.DriverUtils;
import com.ita.testng.ActitimeTestData;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class CreateCustomerUsingTestNG {

	WebDriver driver = null;
	ExtentReports reports = null;
	ExtentTest test = null;
	@BeforeSuite
	public void setupReport()
	{
		reports = new ExtentReports("reports/Automation_Execution_Report_"+ DriverUtils.getCurrentDate() + ".html");
	}
	
	@AfterSuite
	public void saveReports()
	{
		reports.flush();
	}
	
	
	@Parameters("browser")
	@BeforeTest
	public void createDriver(String br)
	{
		test = reports.startTest("createDriver");
		test.log(LogStatus.INFO	, "Opening " + br + " browser");
		driver = ActitimeUtils.getDriver(br);
		test.log(LogStatus.PASS, "Browser opened successfully");
		reports.endTest(test);
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver = null;
	}
	
	@Parameters({"url", "username" , "password"})
	@BeforeClass
	public void setup(String url, String un, String pwd) {
		test = reports.startTest("launch login ");
		test.log(LogStatus.INFO, "launching the application");
		ActitimeUtils.launch(url);
		test.log(LogStatus.PASS, "application is launcted successfully");
		
		test.log(LogStatus.INFO, "login to  the application using " + un + " and " + pwd);
		ActitimeUtils.login(un, pwd);
		test.log(LogStatus.PASS, "successfull login to  the application");
		
		
		test.log(LogStatus.INFO, "Clicking on tasks");
		ActitimeUtils.clickOnTasks();
		test.log(LogStatus.PASS, "Tasks page is opened");
		reports.endTest(test);
	}

	@AfterClass
	public void teardown() {
		ActitimeUtils.logout();
	}

	@Test(dataProvider = "createcustomer", dataProviderClass = ActitimeTestData.class)
	public void createcustomer(String cn, String cd) {
		test = reports.startTest("Create customer");
		test.log(LogStatus.INFO, "Opening customer creation page");
		ActitimeUtils.clickOnNewCustomerButton();
		test.log(LogStatus.PASS, "customer creation page is opened successfully");
		test.log(LogStatus.INFO, "Creating customer with " + cn + " and " + cd);
		ActitimeUtils.createCustomer(cn, cd);
		test.log(LogStatus.PASS, "Creating customer successfully");
		
		test.log(LogStatus.INFO, "Validating the success message");
		ActitimeUtils.validateSuccessMessage();
		test.log(LogStatus.PASS, "Validated the success message");
		reports.endTest(test);
	}

}
