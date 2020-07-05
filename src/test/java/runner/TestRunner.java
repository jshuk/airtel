package runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import resources.base;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefination",
	   plugin = { "json:target/jsonReports/cucumber-report.json"}
//		 ,monochrome = true
		
		)


public class TestRunner {
	
//"pretty", "html:target/cucumber1-reports",
	
	

}
