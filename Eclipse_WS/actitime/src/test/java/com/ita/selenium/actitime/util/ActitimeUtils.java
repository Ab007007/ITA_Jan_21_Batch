package com.ita.selenium.actitime.util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ActitimeUtils extends DriverUtils {

	public static void launch(String url) {
		System.out.println("--- Launching Application " + url);
		driver.get(url);
		
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}

	/**
	 * 
	 */
	public static void logout() {
		ActitimeUtils.click("id", "logoutLink");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
		driver.close();
	}

	/**
	 * @param driver
	 */
	public static void validateSuccessMessage() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait
				.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//div[@class='toast']")));
		System.out.println("Success message --->>> " + ele.getText());

		wait.until(ExpectedConditions.invisibilityOf(ActitimeUtils.getElement("xpath", "//div[@class='toast']")));
	}

	/**
	 * 
	 */
	public static void createCustomer(String cn,String cd) {
		ActitimeUtils.type("id", "customerLightBox_nameField", cn);
		ActitimeUtils.type("id", "customerLightBox_descriptionField", cd);
		ActitimeUtils.click("id", "customerLightBox_commitBtn");
	}

	/**
	 * 
	 */
	public static void clickOnNewCustomerButton() {
		ActitimeUtils.click("xpath", "//div[@class='addNewContainer']");
		ActitimeUtils.click("xpath", "//div[@class='item createNewCustomer ellipsis']");
	}

	/**
	 * 
	 */
	public static void clickOnTasks() {
		ActitimeUtils.click("xpath", "//div[text()='TASKS']/parent::a");
		Assert.assertEquals(driver.getTitle(), "actiTIME - Task List");
	}

	/**
	 * 
	 */
	public static void login(String un, String pwd) {
		ActitimeUtils.type("id", "username", un);
		ActitimeUtils.type("name", "pwd", pwd);
		ActitimeUtils.click("id", "loginButton");
		ActitimeUtils.sleep(5000);
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}
	
	/**
	 * @param projectname
	 * @param cust_name
	 */
	public static void createProject(String projectname, String cust_name, String project_desc) {
		ActitimeUtils.type("id", "projectPopup_projectNameField", projectname);
		ActitimeUtils.click("id", "projectPopup_customerSelectorPlaceholder");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(ActitimeUtils.getElement("xpath", "//div[contains(@class,'customerSelectorMenu')]")));
		
		ActitimeUtils.click("xpath", "//a[text()='" + cust_name + "']");
		ActitimeUtils.type("id", "projectPopup_projectDescriptionField", project_desc);
		ActitimeUtils.click("id", "projectPopup_commitBtn");
	}

	/**
	 * 
	 */
	public static void clickOnCreateProjectButton() {
		ActitimeUtils.click("xpath", "//div[@class='addNewContainer']");
		ActitimeUtils.click("xpath", "//div[@class='item createNewProject ellipsis']");
	}

}
