package pagepackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selectionbedpage 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"productsnilkamal-akin-queen-bed-without-storage-walnut-1\"]/div/div/div/div[1]/a")
	WebElement bedclick;
	
	@FindBy(xpath="//*[@id=\"variant-inventory\"]/div/input[1]")
	WebElement pincode;
	
	@FindBy(xpath="//*[@id=\"variant-inventory\"]/div/input[2]")
	WebElement checkpincode;
	
	@FindBy(xpath="//*[@id=\"dataLayerClickAdd\"]")
	WebElement cartclick;
	
	@FindBy(xpath="//div[@class='side__cart__items']//span[@class='icon-minus']")
	WebElement minusclick;
	
	@FindBy(xpath="//*[@id=\"sideCart\"]/div/div[2]/div/form/div[2]/div/ul/li[2]/input")
	WebElement checkoutclick ;
	
	public Selectionbedpage(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	public void functionclick()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bedclick);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();",bedclick);


	}
	public void selection()
	{
		pincode.sendKeys("682020");
		checkpincode.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cartclick);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,200);");
	    ((JavascriptExecutor) driver).executeScript("arguments[0].click();",cartclick);


	}
	public void size()
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",checkoutclick);
		 ((JavascriptExecutor) driver).executeScript("arguments[0].click();",checkoutclick);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
