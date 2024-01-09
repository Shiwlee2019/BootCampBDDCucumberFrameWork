package com.qa.Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	public static Properties initalizeConfigPropertiesFile() throws Exception {
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\rshiw\\eclipse-workspace\\BootCamp_BDD_Cucumber_FrameWork\\src\\test\\resources\\properties_files\\config.properties");
		prop.load(ip);
		return prop;
	}
}