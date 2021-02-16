package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class FormyAppUsingFunction
{
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		ActitimeUtils.type("id", "first-name", "Aravinda");
		ActitimeUtils.type("id", "last-name", "HB");
		ActitimeUtils.type("id", "job-title", "Trainer");
		ActitimeUtils.click("id", "radio-button-3");
		ActitimeUtils.click("id", "checkbox-1");
		
			
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("4");
		Thread.sleep(2000);
		sel.selectByVisibleText("0-1");
		Thread.sleep(2000);
		
	}

}
