package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
public WebDriver driver;
	
	@FindBy(linkText = "My Account")
	private WebElement MyAccountDropdown;
	
	@FindBy(linkText = "Login")
	private WebElement LoginOption;
	
	@FindBy(linkText = "Register")
	private WebElement RegisterOption;
	
	@FindBy(name = "search")
	private WebElement searchTextbox;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	@FindBy(linkText = "Laptops & Notebooks")
    private WebElement productDropdown;
	
	@FindBy(xpath = "//a[contains(text(),'Show AllLaptops & Notebooks')]")
	private WebElement selectAlllaptopsAndNotebooks;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnMyaccount() {
		MyAccountDropdown.click();
	}
	public LoginPage selectLoginOption() {
		LoginOption.click();
		return new LoginPage(driver) ;
		
	}
	public RegisterPage selectregisterOption() {
		 RegisterOption.click();
		 return new RegisterPage(driver);
	}
	public void enterProductDetail(String producttext) {
		searchTextbox.sendKeys(producttext);
	}
	public SearchPage selectSearchButton() {
		searchButton.click();
		return new SearchPage(driver);
	}
	public void productdropdownmenu() {
		productDropdown.click();
	}
	public ProductPage selectalllaptopsAndNoteBookOption() {
		selectAlllaptopsAndNotebooks.click();
		return new ProductPage(driver);
	}
	
}