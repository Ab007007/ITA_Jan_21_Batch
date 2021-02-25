package com.ita.selenium.actitime.test;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.selenium.actitime.util.FileUtils;

public class CreateCustomerUsingExternalData {

	public static void main(String[] args) {
		
		String url , un, pwd, browser, sheetName,customerName, customerDesc;
		
		url = FileUtils.getPropertyValue("url");
		un = FileUtils.getPropertyValue("username");
		pwd = FileUtils.getPropertyValue("password");
		browser = FileUtils.getPropertyValue("browser");
		sheetName = "create_customer";
		WebDriver driver = ActitimeUtils.getDriver(browser);
		
		ActitimeUtils.launch(url);

		ActitimeUtils.login(un,pwd);

		ActitimeUtils.clickOnTasks();

		int rowCount = FileUtils.getRowCount(sheetName);
		for (int i = 1; i < rowCount; i++)
		{
			customerName = FileUtils.getCellValue(sheetName, i, 0);
			customerDesc = FileUtils.getCellValue(sheetName, i, 1);
			
			ActitimeUtils.clickOnNewCustomerButton();

			ActitimeUtils.createCustomer(customerName, customerDesc);

			ActitimeUtils.validateSuccessMessage();
			
		}
		

		ActitimeUtils.logout();
	}
}
