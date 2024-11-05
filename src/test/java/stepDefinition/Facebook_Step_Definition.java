package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebook_Step_Definition 
{
	public WebDriver driver;
	@Given("user opens the testUrl")
	public void user_opens_the_test_url() 
	{
	   System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.facebook.com/");
	}

	@When("user enters valid email address {string}")
	public void user_enters_valid_email_address(String validUN) 
	{
		driver.findElement(By.id("email")).sendKeys(validUN);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String validPWD) 
	{
	   driver.findElement(By.id("pass")).sendKeys(validPWD);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    driver.findElement(By.name("login")).click();
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() 
	{
	    System.out.println("User has logged in to facebook");
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidUN) 
	{
		driver.findElement(By.id("email")).sendKeys(invalidUN);
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPWD) 
	{
		driver.findElement(By.id("pass")).sendKeys(invalidPWD);
	}

	@Then("user should get warning message")
	public void user_should_get_warning_message() 
	{
	    System.out.println("Invalid credentials");
	}

	@When("user enters no credentials")
	public void user_enters_no_credentials() 
	{
	    System.out.println("Credentials cannot be empty");
	}
}
