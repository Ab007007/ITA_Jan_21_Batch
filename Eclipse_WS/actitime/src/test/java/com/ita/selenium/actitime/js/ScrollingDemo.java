package com.ita.selenium.actitime.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class ScrollingDemo {

	@Test
	public void scrollingTest() {
		WebDriver driver = ActitimeUtils.getDriver();
		driver.get("http://formy-project.herokuapp.com/scroll");
		ActitimeUtils.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, 500);");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.id("name")));
		
	}
}
