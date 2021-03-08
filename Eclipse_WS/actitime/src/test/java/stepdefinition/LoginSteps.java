package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.ita.selenium.actitime.util.ActitimeUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

	WebDriver driver  = null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
	}

	@When("user enter valid username")
	public void user_enter_valid_username() {
		driver.findElement(By.id("username")).sendKeys("admin");
	}

	@When("user enter valid password")
	public void user_enter_valid_password() {
		driver.findElement(By.name("pwd")).sendKeys("manager");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
		ActitimeUtils.sleep(5000);
	}

	@Then("user should see dashboard page")
	public void user_should_see_dashboard_page() {
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}

	@Then("user validate the title")
	public void user_validate_the_title() {
		Assert.assertEquals(driver.getTitle(), "actiTIME - Enter Time-Track");
	}

	@When("user click on logout button")
	public void user_click_on_logout_button() {
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

	@Then("user come back to login page")
	public void user_come_back_to_login_page() {
		Assert.assertEquals(driver.getTitle(), "actiTIME - Login");
	}

	@When("user enter invalid username")
	public void user_enter_invalid_username() {
		driver.findElement(By.id("username")).sendKeys("admin1");
	}

	@Then("user see an error message")
	public void user_see_an_error_message() {
		String errorMsg = driver.findElement(By.className("errormsg")).getText();
		Assert.assertEquals(errorMsg, "Username or Password is invalid. Please try again.");
	}

	@Then("user print the error message")
	public void user_print_the_error_message() {
		String errorMsg = driver.findElement(By.className("errormsg")).getText();
		System.out.println(errorMsg);
	}

	@When("user enter invalid password")
	public void user_enter_invalid_password() {
		driver.findElement(By.name("pwd")).sendKeys("manager2");
	}

}
