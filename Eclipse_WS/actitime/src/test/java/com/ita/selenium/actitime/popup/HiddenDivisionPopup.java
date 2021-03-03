package com.ita.selenium.actitime.popup;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class HiddenDivisionPopup {

	static String taskName = "TASK2";
	
	public static void main(String[] args) {
		WebDriver driver = ActitimeUtils.getDriver("chrome");
		ActitimeUtils.launch("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");

		ActitimeUtils.clickOnTasks();
		ActitimeUtils.click("xpath", "//div[text()='"+taskName+"']/ancestor::tr[@class='taskRow noLastTrackingDate']//div[@class='checkbox inactive']");
		ActitimeUtils.click("xpath", "//div[@class='groupOperationMenu']//div[@class='deleteButton']");
		ActitimeUtils.click("id", "deleteTaskPopup_deleteConfirm_submitBtn");
		ActitimeUtils.validateSuccessMessage();
		ActitimeUtils.logout();
	
	}
}
