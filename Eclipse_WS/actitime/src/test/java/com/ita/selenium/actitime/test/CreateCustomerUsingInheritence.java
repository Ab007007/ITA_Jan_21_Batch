package com.ita.selenium.actitime.test;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class CreateCustomerUsingInheritence extends ActitimeUtils
{

	
	public static void main(String[] args) {

		getDriver("ff");
		launch("http://localhost/login.do");
		login("admin", "manager");
		clickOnTasks();
		clickOnNewCustomerButton();
		createCustomer("ITA-CUST-3","ITA-CUST-DESC2");
		validateSuccessMessage();
		logout();
	}
}
