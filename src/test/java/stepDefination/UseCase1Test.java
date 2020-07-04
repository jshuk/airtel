package stepDefination;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import common.CommonFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.mainPage;
import resources.base;
import resources.variables;

public class UseCase1Test extends base implements variables {
	
	mainPage mainPageObject = new mainPage(DRIVER);
	public static Logger log =LogManager.getLogger(base.class.getName());
	String lowestPrice;
	
	@Given("^User is at the main page$")
	public void user_is_at_the_main_page() throws IOException {
		DRIVER.get(getGlobalValue("url"));
		System.out.println("url has been entered");
		Assert.assertTrue(mainPageObject.getLogo().isDisplayed());
		System.out.println("Navigated to main page");
	    //
	    
	}

	@When("^User navigated to popular items section$")
	public void user_navigated_to_popular_items_section() {
		System.out.println("Move to Popular section");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", mainPageObject.getPopulatTab());
		System.out.println("Popular section is visible");
	}

	@When("^Add lowest price product$")
	public void add_lowest_price_product() {
	   //get the prices of all the products
		lowestPrice = CommonFunctions.lowestprice();
		System.out.println("Lowest price has been added ");
		
	}

	@Then("^Navigated to cart page$")
	public void navigated_to_cart_page() {
		mainPageObject.getCheckoutPage().click();
		//validation
		
		//
		
	}

	@Then("^Screenshot has been taken$")
	public void screenshot_has_been_taken() {
	   try {
		base.getScreenShotPath("usecase1", DRIVER);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	@Then("^Verify that product has been added successfully$")
	public void verify_that_product_has_been_added_successfully() {
		Assert.assertTrue(mainPageObject.getpriceCheckout().getText().contains(lowestPrice));
		
	}

}
