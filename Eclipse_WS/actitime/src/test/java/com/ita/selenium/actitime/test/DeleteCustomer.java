package com.ita.selenium.actitime.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.selenium.actitime.util.FileUtils;

public class DeleteCustomer {

	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver("chrome");
		ActitimeUtils.launch("http://localhost/login.do");
		String cust_name = "ITA-CUST-2";
		ActitimeUtils.login("admin", "manager");

		ActitimeUtils.clickOnTasks();
		ActitimeUtils.sleep(3000);
		ActitimeUtils.type("xpath", "//div[@id='cpTreeBlock']//input", "ITA-CUST-2");
		
		Actions act = new Actions(driver);
		act.moveToElement
		(ActitimeUtils.getElement("xpath", "//div[@class='node allCustomersNode selected']/following-sibling::div")).perform();
		act.click(ActitimeUtils.getElement("xpath", "//div[@class='node allCustomersNode selected']/following-sibling::div/div[@class='editButton available']")).perform();
		
		
		ActitimeUtils
		.waitAndclick("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='ACTIONS']");
		
		ActitimeUtils
		.click("xpath", "//div[@class='edit_customer_sliding_panel sliding_panel']//div[text()='Delete']");
		
		ActitimeUtils
		.click("id", "customerPanel_deleteConfirm_submitTitle");
		
		ActitimeUtils.validateSuccessMessage();
		
		ActitimeUtils.logout();
	
	}
}
