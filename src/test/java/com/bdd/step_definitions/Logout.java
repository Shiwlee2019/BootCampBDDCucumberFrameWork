package com.bdd.step_definitions;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdd.DriverLogic.Driverfactory;
import com.bdd.pages.AccountLogoutPage;
import com.bdd.pages.AccountPage;
import com.bdd.pages.Homepage;
import com.bdd.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout {
	public WebDriver driver;
	public Homepage homepage;
	public LoginPage loginpage;
	public AccountPage accountpage;
	public Properties dataprop;
	public AccountLogoutPage accountlogoutpage;
	
	
	  @Given("User navigates to LoginPage")
	public void user_navigates_to_login_page() {
		driver = Driverfactory.getdriver();
		homepage = new Homepage(driver);
		homepage.clickOnMyaccount();
		loginpage = homepage.selectLoginOption();
		accountpage = new AccountPage(driver);

}
	  
	  @When("User enters validemail {string} into email textbox field")
      public void user_enters_validemail_email_into_email_textbox_field(String validemailtext) {
   	  loginpage.enterEmail(validemailtext);

}
     @And("User enters validpassword {string} into password textbox field")
     public void user_enters_validpassword_password_into_password_textbox_field(String validpasswordtext) {
   	 loginpage.enterPassword(validpasswordtext);
  
}
     @And("User clicks on Login button")
     public void user_clicks_on_login_button() {
   	accountpage =  loginpage.clickOnLogin();
 
}
     @Then("user is navigating to Accountpage")
      public void user_is_navigating_to_accountpage() {
   	accountpage.validateDisplayStatusOfEditAccountInfoLink();
   
}
	@When("User click on My Account dropdown")
	public void user_clicks_on_my_account_dropdown() {
		accountpage = new AccountPage(driver);
		accountpage.myaccountdropdown();
		
	}
	@And("User clicks on Logout option")
	public void user_clicks_on_logout_option() {
		accountlogoutpage = accountpage.clickOnLogout();
	}
	@Then("User will be navigated to AccountLogoutPage")
	public void user_will_be_nagigated_to_accountlogoutpage() {
		Assert.assertTrue(accountlogoutpage.accountLogoutMessage());
		
	}
}