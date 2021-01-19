package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps 
{
	@Given("usr is on login page")
	public void usr_is_on_login_page() 
	{
	   System.out.println("usr is on login page");
	}
    @When("user enters username and password")
	public void user_enters_username_and_password() 
    {
    	System.out.println("user enters username and password");
	}
    @When("clicks on login button")
	public void clicks_on_login_button() 
    {
    	System.out.println("clicks on login button");
	}
    @Then("user is navigated to Home screen")
	public void user_is_navigated_to_home_screen()
    {
    	System.out.println("user is navigated to Home screen");
	}
    @When("user enters yalagalapolaiah@tvarana.com and Tvarana2020@")
	public void user_enters_yalagalapolaiah_tvarana_com_and_tvarana2020() 
	{
    	System.out.println("user enters yalagalapolaiah@tvarana.com and Tvarana2020@");
	}
    @When("user enters abhishek.dutta@tvarana.com and Entally2004")
	public void user_enters_abhishek_dutta_tvarana_com_and_entally2004() 
	{
    	
	System.out.println("user enters abhishek.dutta@tvarana.com and Entally2004");
     }
}