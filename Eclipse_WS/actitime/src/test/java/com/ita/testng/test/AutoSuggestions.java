package com.ita.testng.test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {

	
WebDriver driver = null;
	
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	
	
	@Test
	public void printAllSuggestion() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("IBM");
		Thread.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul/li[@role='presentation']"));
		
		System.out.println("--- Total AutoSuggestions Displayed are --- " + autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) 
		{
			System.out.println(suggestion.getText());
		}
	}
	
	@AfterClass
	public void cleanup()
	{
		driver.close();
	}
	
}
