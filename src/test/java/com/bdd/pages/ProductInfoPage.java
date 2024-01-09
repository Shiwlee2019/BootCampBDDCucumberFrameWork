package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
public WebDriver driver;
	
	
	
	@FindBy(id = "button-cart")
	private WebElement addToCartButtonInProductInfoPage;
	
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement addToCartSuccessMessage;
	
	
	
	public ProductInfoPage(WebDriver driver) {
	    this.driver = driver;
	    PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnAddtoCartButton() {
		addToCartButtonInProductInfoPage.click();
	}
	
	public boolean addToCartsuccessMessage() {
		 return addToCartSuccessMessage.isDisplayed();
	
	
	}
}