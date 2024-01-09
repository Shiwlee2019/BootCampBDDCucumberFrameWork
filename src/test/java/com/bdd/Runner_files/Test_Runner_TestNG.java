package com.bdd.Runner_files;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			dryRun = false,
		    monochrome = true,
			features = "classpath:feature_files" ,
		    glue     = {"com.bdd.step_definitions", "com.bdd.Hooks"},
		    tags =  "@TutorialsNinjaLogin or @TutorialsNinjaRegister or @TutorialsNinjaSearchProduct or @TutorialsNinjaLogout or @TutorialsNinjaAddToCart",
		    plugin = {"pretty", "html:target/site/cucumber-html", "json:target/cucumber1.json"})
			
			
			

			public class Test_Runner_TestNG extends AbstractTestNGCucumberTests{
		}