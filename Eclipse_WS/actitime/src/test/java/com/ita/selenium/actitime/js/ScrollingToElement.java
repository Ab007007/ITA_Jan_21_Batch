package com.ita.selenium.actitime.js;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class ScrollingToElement {

	@Test
	public void scrollingTest() {
		WebDriver driver = ActitimeUtils.getDriver();
		driver.get("https://testng.org/doc/documentation-main.html#parallel-running");
		ActitimeUtils.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("window.scrollTo(0, 500);");
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//h4/a[text()='5.14 - Running TestNG programmatically']")));
		
	}
}
