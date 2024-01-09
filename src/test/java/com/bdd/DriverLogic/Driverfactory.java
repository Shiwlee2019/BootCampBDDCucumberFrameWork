package com.bdd.DriverLogic;

import java.util.Arrays;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driverfactory {

	public static WebDriver driver;
	public static ChromeOptions options;
	
	
	public static void initalizeBrowser(String browserName) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized", "--incognito");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));

		
		driver =new ChromeDriver(options);
		
				
	}
	public static WebDriver getdriver() {
		return driver;
		
	}
	
}