package com.bdd.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	 
	@FindBy(id ="input-email")
	private WebElement emailtextbox;
	
	@FindBy(id ="input-password")
	private WebElement passwordtextbox;
	
   @FindBy(css ="input.btn.btn-primary")
   private WebElement loginbutton;
   
   @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
   private WebElement credenatilsmismatchwarningmessage;
   
   
   public LoginPage(WebDriver driver) {
   this.driver = driver;
   PageFactory.initElements(driver,this);
   }
   
   public void enterEmail(String emailtext) {
	   emailtextbox.sendKeys(emailtext);
   }
   public void enterPassword(String passwordtext) {
	   passwordtextbox.sendKeys(passwordtext);
   }
   public AccountPage clickOnLogin() {
	   loginbutton.click();
	   return new AccountPage(driver);
   }
   public String retrievecredenatilsmismatchwarningmessage() {
   return credenatilsmismatchwarningmessage.getText();
}
}