package com.ita.selenium.actitime.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class MouseMovementDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://www.flipkart.com/");
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		WebElement closeButton = wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"))));
		
		closeButton.click();
		
		WebElement fashion = ActitimeUtils.getElement("xpath", "//div[text()='Fashion']");
		WebElement electronics = ActitimeUtils.getElement("xpath", "//div[text()='Electronics']");
		WebElement home = ActitimeUtils.getElement("xpath", "//div[text()='Home']");
		WebElement appliances = ActitimeUtils.getElement("xpath", "//div[text()='Appliances']");
		WebElement toys = ActitimeUtils.getElement("xpath", "//div[text()='Beauty, Toys & More']");

		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		Thread.sleep(2000);
		act.moveToElement(electronics).perform();
		Thread.sleep(2000);
		act.moveToElement(home).perform();
		Thread.sleep(2000);
		act.moveToElement(appliances).perform();
		Thread.sleep(2000);
		act.moveToElement(toys).perform();
		Thread.sleep(2000);
	
	
	
	}

}
