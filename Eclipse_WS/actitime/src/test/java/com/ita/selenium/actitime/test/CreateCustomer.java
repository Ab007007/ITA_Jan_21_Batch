package com.ita.selenium.actitime.test;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class CreateCustomer {

	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("http://localhost/login.do");

		ActitimeUtils.login("admin", "manager");

		ActitimeUtils.clickOnTasks();

		ActitimeUtils.clickOnNewCustomerButton();

		ActitimeUtils.createCustomer("ITA-CUST-2","ITA-CUST-DESC2");

		ActitimeUtils.validateSuccessMessage();

		ActitimeUtils.logout();
	}
}
