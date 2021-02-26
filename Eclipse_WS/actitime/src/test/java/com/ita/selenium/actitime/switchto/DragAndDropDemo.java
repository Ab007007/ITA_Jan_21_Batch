package com.ita.selenium.actitime.switchto;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class DragAndDropDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver("ff");
		ActitimeUtils.launch("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);

		driver.switchTo().frame(ActitimeUtils.getElement("xpath", "//iframe[contains(@src,'default')]"));
		WebElement sourceEle = ActitimeUtils.getElement("id", "draggable");
		WebElement destEle = ActitimeUtils.getElement("id", "droppable");

		System.out.println(sourceEle.getText());
		System.out.println(destEle.getText());
		Actions act = new Actions(driver);
		act.dragAndDrop(sourceEle, destEle).perform();
		Thread.sleep(2000);
		System.out.println(sourceEle.getText());
		System.out.println(destEle.getText());

		driver.switchTo().defaultContent();
		ActitimeUtils.click("linktext", "Draggable");
	}
}
