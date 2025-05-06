package pagepackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage 
{
	WebDriver driver;
	@FindBy(xpath="//input[contains(@id,'bc-sf-search-box') and contains(@class,'search-input')]")
	WebElement searchbtn;
	
	@FindBy(xpath="//form[@class='search_form']//span[@class='icon-search search-submit']")
	WebElement searchicon;
	
	public  Searchpage  (WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	public void searchfunction()
	{
		searchbtn.sendKeys("Bed",Keys.ENTER);
	}
	public void iconclk()
	{
		searchicon.click();
	}

}
