package common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.mainPage;
import resources.base;
import resources.variables;

public class CommonFunctions extends base implements variables{
	static mainPage mainPageObject = new mainPage(DRIVER);
	
	public static String lowestprice() {
		List<WebElement> elements = mainPageObject.getPrices();
		float lowest = 1000;
		for(WebElement e:elements) {
			//to int
			String text = e.getText().substring(1);
			
			float d=Float.parseFloat(text);
			
			if(lowest > d) {
				lowest = d;
			}
			
		}
		Actions actions = new Actions(DRIVER);
		actions.moveToElement(DRIVER.findElement(By.xpath("//ul[@id='homefeatured']//div[@class='right-block']//span[contains(text(),'"+lowest+"')]"))).perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DRIVER.findElement(By.xpath("//span[contains(text(),'"+lowest+"')]/ancestor::div[@class='right-block']//div[@class='button-container']//a[@title='Add to cart']")).click();
	    return Float.toString(lowest);
	
	}
	 
	
	 

}
