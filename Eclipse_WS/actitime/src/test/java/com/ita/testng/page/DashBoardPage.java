package com.ita.testng.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ita.selenium.actitime.util.ActitimeUtils;

public class DashBoardPage {

	WebDriver driver ;
	
	@FindBy(id = "logoutLink")
	WebElement logoutButton;
	
	@FindBy(xpath = "//div[text()='TASKS']/parent::a")
	WebElement tasksModule;
	
	@FindBy(xpath = "//div[@class='addNewContainer']")
	WebElement addNewButton;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer ellipsis']")
	WebElement newCustomerButton;
	
	@FindBy(id = "customerLightBox_nameField")
	WebElement customerNameTxtBox;
	
	@FindBy(id = "customerLightBox_descriptionField")
	WebElement customerDescTxtBox;
	
	@FindBy(id = "customerLightBox_commitBtn")
	WebElement createCustomerButton;
	
	
	
	
	
	public void waitForSuccessMsg()
	{

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement ele = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		System.out.println("Success message --->>> " + ele.getText());

		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));

	}
	public void enterCustomerName(String cn)
	{
		customerNameTxtBox.sendKeys(cn);
	}
	
	public void enterCustomerDesc(String cn)
	{
		customerDescTxtBox.sendKeys(cn);
	}
	public void clickCreateCustomer()
	{
		createCustomerButton.click();
	}
	
	
	public void clickonAddNew()
	{
		addNewButton.click();
	}
	
	public void clickOnNewCustomerButton()
	{
		newCustomerButton.click();
	}
	
	public void clickOnTasks()
	{
		tasksModule.click();
	}
	
	
	public void logout()
	{
		logoutButton.click();
	}
	public DashBoardPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	
	}
}

