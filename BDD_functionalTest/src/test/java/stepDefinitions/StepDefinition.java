package stepDefinitions;

import java.io.FileNotFoundException;

import baseClassPKG.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjcets.LoginPage;

public class StepDefinition {
	
	
	LoginPage lp;
	
	@BeforeStep
	public void readLP()
	{
		lp=new LoginPage(BaseClass.driver);
		
	}

	@Given("user will launch the browser and will pass the {string}")
	public void user_will_launch_the_browser_and_will_pass_the(String Url) {
		try {
			BaseClass.launchBrowser(Url);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user will enter the username {string} and password {string}")
	public void user_will_enter_the_username_and_password(String Username, String Password) {
		
		lp.enterUsername(Username);
		lp.enterPassword(Password);
		
	}

	@And("user will click on login button")
	public void user_will_click_on_login_button() {
		lp.enterLoginBtn();
	}

	@Then("user will go to the home page")
	public void user_will_go_to_the_home_page() {
		
	}

}
