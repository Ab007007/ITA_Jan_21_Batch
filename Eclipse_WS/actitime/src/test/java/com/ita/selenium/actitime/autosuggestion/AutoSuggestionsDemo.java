package com.ita.selenium.actitime.autosuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.google.com/
public class AutoSuggestionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
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
}
