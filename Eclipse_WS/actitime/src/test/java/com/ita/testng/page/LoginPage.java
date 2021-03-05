package com.ita.testng.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(id = "username")
	WebElement usernameTextBox;
	
	
	@FindBy(name = "pwd" )
	WebElement passwordTextBox;
	
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	
	public void enterUsername(String un)
	{
		usernameTextBox.sendKeys(un);
	}
	
	public void enterPassword(String un)
	{
		passwordTextBox.sendKeys(un);
	}
	
	public void clickloginButton()
	{
		loginButton.click();
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
}
