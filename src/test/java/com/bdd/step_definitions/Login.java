package com.bdd.step_definitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdd.DriverLogic.Driverfactory;
import com.bdd.pages.AccountPage;
import com.bdd.pages.Homepage;
import com.bdd.pages.LoginPage;
import com.qa.Utilities.Util;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	public WebDriver driver;
	public Homepage homepage;
	public LoginPage loginpage;
	public AccountPage accountpage;
	public Properties dataprop;

	@Given("User navigate to LoginPage")
	public void user_navigate_to_login_page() {
		driver = Driverfactory.getdriver();
		homepage = new Homepage(driver);
		homepage.clickOnMyaccount();
		loginpage = homepage.selectLoginOption();

	}

	@When("^User enters valid email (.+) into email textbox field$")
	public void user_enters_valid_email_email_into_email_textbox_field(String validemailtext) {
		loginpage.enterEmail(validemailtext);

	}

	@And("^User enters valid password (.+) into password textbox field$")
	public void user_enters_valid_password_password_into_password_textbox_field(String validpasswordtext) {
		loginpage.enterPassword(validpasswordtext);

	}

	@And("User click on Login button")
	public void user_click_on_login_button() {
		accountpage = loginpage.clickOnLogin();

	}

	@Then("user is navigated to Accountpage")
	public void user_is_navigated_to_accountpage() {
		accountpage.validateDisplayStatusOfEditAccountInfoLink();

	}

	@When("user enters invalid email into email textbox field")
	public void user_enters_invalid_email_into_email_textbox_field() {
		loginpage.enterEmail(Util.emailWithDateTimeStamp());

	}

	@And("User enters invalid password {string} into password textbox field")
	public void user_enters_invalid_password_into_password_textbox_field(String invalidpasswordtext) {
		loginpage.enterPassword(invalidpasswordtext);

	}

	@Then("User gets warning message about mismatch credentails")
	public void user_gets_warning_message_about_mismatch_credentails() {
		String actualWarningMessage = loginpage.retrievecredenatilsmismatchwarningmessage();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}

}