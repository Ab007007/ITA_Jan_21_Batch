package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class FormyAppDemo
{
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Aravinda");
		driver.findElement(By.id("last-name")).sendKeys("HB");
		driver.findElement(By.id("job-title")).sendKeys("Trainer");
		driver.findElement(By.id("radio-button-3")).click();
		driver.findElement(By.id("checkbox-1")).click();
		
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("4");
		Thread.sleep(2000);
		sel.selectByVisibleText("0-1");
		Thread.sleep(2000);
		
	}

}
