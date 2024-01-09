package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
public WebDriver driver;
	
	@FindBy(linkText= "MacBook Air")
	private WebElement applelaptop;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public ProductInfoPage clickOnproduct() {
		applelaptop.click();
		return new ProductInfoPage(driver);
	}
}