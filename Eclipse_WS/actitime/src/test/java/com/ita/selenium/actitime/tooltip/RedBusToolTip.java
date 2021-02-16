package com.ita.selenium.actitime.tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusToolTip {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		WebElement rPoolEle = driver.findElement(By.id("cars"));
		WebElement rbhEle = driver.findElement(By.id("redBus Bus Hire"));
		WebElement redBusEle = driver.findElement(By.id("redBus"));
		
		
		System.out.println(rPoolEle.getAttribute("title"));
		System.out.println(rbhEle.getAttribute("title"));
		System.out.println(redBusEle.getAttribute("title"));
	}
}
