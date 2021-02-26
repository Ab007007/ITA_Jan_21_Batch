package com.ita.selenium.actitime.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.ita.selenium.actitime.util.ActitimeUtils;
import com.ita.selenium.actitime.util.FileUtils;

public class TabbedBrowserDemo extends ActitimeUtils {
	
	public static void main(String[] args) {
		driver = getDriver();
		System.out.println(driver.getWindowHandle());
		launch(FileUtils.getPropertyValue("url"));

		click("xpath", "//a[text()='actiTIME Inc.']");
		sleep(2000);
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it = windowIDs.iterator();
		String parentWindowID = it.next();
		String childWindowID = it.next();
		
		System.out.println("Parent Window id - " + parentWindowID);
		System.out.println("Child Window id - " + childWindowID);
		sleep(2000);
		driver.switchTo().window(childWindowID);
		sleep(2000);
		
		List<WebElement> headings = driver.findElements(By.xpath("//h2"));
		
		for (WebElement heading : headings) {
			System.out.println(heading.getText());
		}

		driver.close();
		driver.switchTo().window(parentWindowID);
		ActitimeUtils.login(FileUtils.getPropertyValue("username"), FileUtils.getPropertyValue("password"));
		ActitimeUtils.logout();
		
	}

}
