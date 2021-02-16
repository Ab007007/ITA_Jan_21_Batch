package com.ita.selenium.actitime.sync;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/ITA/ITAutomation_Jan_21_Batch/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		
		System.out.println("Demo " + driver.findElement(By.id("demo")).getText());
		System.out.println("Demo2 " + driver.findElement(By.id("demo2")).getText());
		
	}
	
	
}
