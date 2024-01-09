package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
public WebDriver driver;
	
	@FindBy(linkText = "Edit your account information")
	private WebElement editAccountInfoLink;
	
   @FindBy(linkText = "My Account")
   private WebElement myAccountDropdown;
   
   @FindBy(linkText = "Logout")
   private WebElement logoutOption;
   
	
	
	public AccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateDisplayStatusOfEditAccountInfoLink() {
		boolean displayStatus = editAccountInfoLink.isDisplayed();
		return displayStatus;
	}
	public void myaccountdropdown() {
		myAccountDropdown.click();
	}
	
	public AccountLogoutPage clickOnLogout() {
		 logoutOption.click();
		return new AccountLogoutPage(driver);
	}
}