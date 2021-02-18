package com.ita.selenium.actitime.test;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class CreateProject {

	public static void main(String[] args) {

		WebDriver driver = ActitimeUtils.getDriver("chrome");
		ActitimeUtils.launch("http://localhost/login.do");
		String cust_name = "ITA-CUST-2";
		ActitimeUtils.login("admin", "manager");

		ActitimeUtils.clickOnTasks();
		
		ActitimeUtils.clickOnCreateProjectButton();
		
		ActitimeUtils.createProject("Project2"+new Random().nextInt(5555) , cust_name, "Project2-DESC");
		
		ActitimeUtils.validateSuccessMessage();
		ActitimeUtils.logout();
	}

	
}
