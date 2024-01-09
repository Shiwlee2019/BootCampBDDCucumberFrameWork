package com.bdd.step_definitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.bdd.DriverLogic.Driverfactory;
import com.bdd.pages.Homepage;
import com.bdd.pages.SearchPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	public WebDriver driver;
	Homepage homepage;
	SearchPage searchpage;

	@Given("User opens the application")
	public void user_opens_the_application() {
		driver = Driverfactory.getdriver();

	}

	@When("User enters the search product {string}")
	public void user_enters_the_search_product(String validproducttext) {
		homepage = new Homepage(driver);
		homepage.enterProductDetail(validproducttext);

	}

	@And("User clicks on the search button")
	public void user_clicks_on_the_search_product() {
		homepage = new Homepage(driver);

		searchpage = homepage.selectSearchButton();

	}

	@Then("User gets valid product info display in search page")
	public void user_gets_valid_product_info_display_in_search_page() {
		searchpage.verifyDisplayStatusOfValidProduct();

	}

	@When("User enters the invalid product {string}")
	public void user_enters_the_invalid_product(String invalidproducttext) {
		homepage = new Homepage(driver);
		homepage.enterProductDetail(invalidproducttext);

	}

	@Then("User gets a warning message")
	public void user_gets_a_warning_message() {
		searchpage = new SearchPage(driver);
		Assert.assertTrue(searchpage.verifyDisplayStatusOfinvalidProduct());

	}
}