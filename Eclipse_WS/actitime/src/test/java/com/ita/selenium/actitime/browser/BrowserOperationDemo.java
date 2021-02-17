package com.ita.selenium.actitime.browser;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class BrowserOperationDemo {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("https://jqueryui.com/");
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
//		driver.quit();
		
	}

}
