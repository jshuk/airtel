package pageObjects;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPage {
	
	
public WebDriver driver;

     public mainPage(WebDriver driver) 
     {
	       this.driver = driver;
      }
	
     
     

	By popularTab = By.xpath("//a[text()='Popular']");
    By logo = By.xpath("//img[@class='logo img-responsive']");
    By prices = By.xpath("//ul[@id='homefeatured']//div[@class='right-block']//span[@class='price product-price']");
    By checkout = By.xpath(("//span[contains(text(),'Proceed to checkout')]"));
    By priceCheckout = By.xpath("//td[@id='total_product']");
    By productWithDiscount = By.xpath("//ul[@id='homefeatured']//div[@class='right-block']//span[@class='price-percent-reduction']");
    
	public WebElement getPopulatTab()
	{
		return driver.findElement(popularTab);
	}
	
	public WebElement getLogo()
	{
		return driver.findElement(logo);
	}
	
	public List<WebElement> getPrices(){
		return driver.findElements(prices);
	}
	public WebElement getCheckoutPage(){
		return driver.findElement(checkout);
	}
	
	public WebElement getpriceCheckout(){
		return driver.findElement(priceCheckout);
	}

	public List<WebElement> getProductWithDiscount(){
		return driver.findElements(productWithDiscount);
	}
}
