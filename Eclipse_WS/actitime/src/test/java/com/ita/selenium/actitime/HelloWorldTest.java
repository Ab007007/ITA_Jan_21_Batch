package com.ita.selenium.actitime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldTest {

	static 
	{
		try 
		{
			Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost/login.do");
		
		driver.close();
	}
}
