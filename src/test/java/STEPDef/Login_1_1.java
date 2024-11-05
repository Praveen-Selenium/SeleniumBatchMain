package STEPDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_1_1 
{
	@Given("user opens the testUrl")
	public void user_opens_the_test_url() 
	{
	   System.out.println("User has entered the URL");
	}

	@When("user enters valid email address {string}")
	public void user_enters_valid_email_address(String validUN) 
	{
	   System.out.println("User has entered valid username "+validUN);
	}

	@When("user enters valid password {string}")
	public void user_enters_valid_password(String validPWD) 
	{
	   System.out.println("User has entered valid password "+validPWD);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
	    System.out.println("User has clicked on the login button");
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() 
	{
	    System.out.println("User has logged in successfully");
	}

	@When("user enters invalid email address {string}")
	public void user_enters_invalid_email_address(String invalidUN) 
	{
	    System.out.println("User has entered invalid username "+invalidUN);
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String invalidPWD) 
	{
	   System.out.println("User has entered invalid password "+invalidPWD);
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
