package com.ita.selenium.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class MultiSelectDemo {

	
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launch("file:///D:/ITA/ITAutomation_Jan_21_Batch/html/multiSelect.html");
		
		Select sel = new Select(driver.findElement(By.tagName("select")));
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		sel.deselectByValue("mercedes");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Mercedes");
		Thread.sleep(2000);
		sel.deselectAll();
	}
}
