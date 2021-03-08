package stepdefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.ita.selenium.actitime.util.ActitimeUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	WebDriver driver = null;

	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@When("user enters {}")
	public void user_enter(String string) {
		driver.findElement(By.name("q")).sendKeys(string);
	}

//	@When("user enter ibm")
//	public void user_enter_ibm() {
//		driver.findElement(By.name("q")).sendKeys("IBM");
//
//	}

	@When("application display auto suggestions")
	public void dispaly_autosuggestion() {
		ActitimeUtils.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul/li[@role='presentation']"));
		
		Assert.assertTrue(autoSuggestions.size() > 0);
	}

	@Then("user print all the auto suggestions")
	public void print_all_auto_suggetions() {
		ActitimeUtils.sleep(3000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul/li[@role='presentation']"));
		
		System.out.println("--- Total AutoSuggestions Displayed are --- " + autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) 
		{
			System.out.println(suggestion.getText());
		}
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
