package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountLogoutPage {
	
public WebDriver driver;
	
	@FindBy(xpath = "//p[contains(text(),'You have been logged off your account. It is now s')]")
	private WebElement logoutMessage;
	
	public AccountLogoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public boolean accountLogoutMessage() {
		 return logoutMessage.isDisplayed();
	}

}