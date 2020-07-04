package stepDefination;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.mainPage;
import resources.base;
import resources.variables;

public class USeCase2 extends base implements variables{
	mainPage mainPageObject = new mainPage(DRIVER);
	
	
	
	@When("Check number of items with discount")
	public void check_number_of_items_with_discount() {
		System.out.println("Number of Product With Discount"+mainPageObject.getProductWithDiscount().size());
	}

	@Then("Verify that final price after discount is correct")
	public void verify_that_final_price_after_discount_is_correct() {
	    List<WebElement> elements = mainPageObject.getProductWithDiscount();
	    for(int i=1;i<=elements.size();i++) {
	    	//
	    	//String currentPrice = e.findElement(By.xpath("./parent::div/span[1]")).getText();
	    	double currentPrice = Double.parseDouble(DRIVER.findElement(By.xpath("(//ul[@id='homefeatured']//div[@class='right-block']//span[@class='price-percent-reduction'])["+i+"]/parent::div/span[1]")).getText().substring(1));
	    	double previousPrice =Double.parseDouble(DRIVER.findElement(By.xpath("(//ul[@id='homefeatured']//div[@class='right-block']//span[@class='price-percent-reduction'])["+i+"]/parent::div/span[2]")).getText().substring(1));
	    	String Discount = DRIVER.findElement(By.xpath("(//ul[@id='homefeatured']//div[@class='right-block']//span[@class='price-percent-reduction'])["+i+"]/parent::div/span[3]")).getText().substring(1);
	    	String removePercentage = Discount.replaceAll("%", "");
	    	double FinalDiscount = Double.parseDouble(removePercentage);
	    	//calculate
	    	System.out.println("Discount Applied "+FinalDiscount);
	    	double d = previousPrice-(previousPrice*FinalDiscount/100);
	    	System.out.println(d);
	    	System.out.println(currentPrice);
	    	Assert.assertTrue(Double.toString(d).contains(Double.toString(currentPrice)));
	    	System.out.println("Dicount applied is correct");
	    }
	    DRIVER.quit();
	}
	
}
