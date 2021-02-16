package com.ita.selenium.actitime.sync;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static <T> void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///D:/ITA/ITAutomation_Jan_21_Batch/html/tiimeout.html");
		driver.findElement(By.tagName("button")).click();
		
		// STEP-1
		FluentWait<WebElement> wait  =null;
		wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
		.withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofMillis(250))
		.ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class);
		
		
		//STEP-2
		Function<WebElement,Boolean > fun = new Function<WebElement, Boolean>() {

			@Override
			public Boolean apply(WebElement ele) 
			{
				if(ele.getText().equals("Hello"))
				{
					System.out.println("Element is visible!!!!");
					return true;
				}
				else
				{
					System.out.println("Waiting!!!!!!");
					return false;
				}
			}
			
		};
		
		//STEP-3
		
		wait.until(fun);
				
		System.out.println("Demo " + driver.findElement(By.id("demo")).getText());
		System.out.println("Demo2 " + driver.findElement(By.id("demo2")).getText());
		
	}
	
	
}
