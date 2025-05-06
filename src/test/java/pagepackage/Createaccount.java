package pagepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createaccount 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div[4]/ul/li/a/span")
	WebElement icon;
	
	@FindBy(xpath="//div[@id='first_name']//input[@id='first_name']")
	WebElement firstname;
	
	@FindBy(xpath="//div[@id='last_name']//input[@id='last_name']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	WebElement phno;
	
	@FindBy(xpath="//div[@id='email']//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//div[@id='password']//input[@id='password']")
	WebElement pass;
	
	@FindBy(xpath="//div[@class='action_bottom center']//input[@value='Sign Up']")
	WebElement signclk;

	
	public Createaccount(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	
	public void iconclk()
	{
		icon.click();
		
	}
	public void details()
	{
		firstname.sendKeys("preetha");
		lastname.sendKeys("m");
		phno.sendKeys("9098898790");
		email.sendKeys("preetha@gmail.com");
		pass.sendKeys("preetha@90");
		
	}
	public void sign()
	{
		signclk.click();
	}
	
	
}
