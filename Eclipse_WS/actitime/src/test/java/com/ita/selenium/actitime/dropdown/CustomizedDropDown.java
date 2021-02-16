package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class CustomizedDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/buttons");
		ActitimeUtils.click("id", "btnGroupDrop1");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//div[@class='dropdown-menu show']")));
		Thread.sleep(2000);
		ActitimeUtils.click("linktext", "Dropdown link 1");
	}
}
