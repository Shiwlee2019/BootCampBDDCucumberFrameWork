package com.bdd.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdd.DriverLogic.Driverfactory;
import com.bdd.pages.Homepage;
import com.bdd.pages.ProductInfoPage;
import com.bdd.pages.ProductPage;
import com.qa.Utilities.DataPropReader;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCart {

	
	public WebDriver driver;
	public Homepage homepage;
	public ProductPage productpage;
	public ProductInfoPage productinfopage;
	public DataPropReader dataprop;
	
	
	
	
	@Given("Users open the application")
	public void users_opens_the_application() {
		driver = Driverfactory.getdriver();

}
	@And("User clicks on product dropdown menu")
	public void user_clicks_on_product_dropdown_menu() {
		homepage = new Homepage(driver);
		homepage.productdropdownmenu();
		productpage = homepage.selectalllaptopsAndNoteBookOption();
	
	}
	@And("user selects {string}")
	public void user_selects_product(String productText) {
		productinfopage = productpage.clickOnproduct();
		
	}
	@Then("user clicks add to cart button")
	public void user_clicks_add_to_cart_button(){
		productinfopage.clickOnAddtoCartButton();
		
		
	}
	@And("User gets success product added to cart message")
	public void user_gets_success_product_added_to_cart_message() {
		Assert.assertTrue(productinfopage.addToCartsuccessMessage());
		
	}
	
}