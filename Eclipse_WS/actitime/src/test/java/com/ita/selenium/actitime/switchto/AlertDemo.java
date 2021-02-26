package com.ita.selenium.actitime.switchto;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.selenium.actitime.util.FileUtils;

public class AlertDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver =  ActitimeUtils.getDriver("chrome");
		ActitimeUtils.launch(FileUtils.getPropertyValue("url"));
		ActitimeUtils.login(FileUtils.getPropertyValue("username"), FileUtils.getPropertyValue("password"));
		ActitimeUtils.clickOnTasks();
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.type("id", "customerLightBox_nameField", "JUNKKKKKK");
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		ActitimeUtils.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().dismiss();
		ActitimeUtils.sleep(2000);
		
		ActitimeUtils.click("id", "customerLightBox_cancelBtn");
		ActitimeUtils.sleep(2000);
		
		driver.switchTo().alert().accept();
		ActitimeUtils.sleep(2000);
		
		ActitimeUtils.logout();
	
	
	}

}
