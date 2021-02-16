package com.ita.selenium.actitime.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class FormyAppDemo
{
	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("http://formy-project.herokuapp.com/form");
		
		WebElement ele = driver.findElement(By.id("first-name"));
		
		System.out.println(ele.isDisplayed());
		System.out.println(ele.isSelected());
		System.out.println(ele.isEnabled());
		System.out.println(ele.getAttribute("placeholder"));
		
		
		
		/*
		 * driver.findElement(By.id("last-name")).sendKeys("HB");
		 * driver.findElement(By.id("job-title")).sendKeys("Trainer");
		 * driver.findElement(By.id("radio-button-3")).click();
		 * driver.findElement(By.id("checkbox-1")).click();
		 */
	}

}
