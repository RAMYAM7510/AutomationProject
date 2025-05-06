package pagepackage;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Loginpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div[4]/ul/li/a")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id=\"customer_email\"]")
	WebElement mail;
	
	@FindBy(xpath="//*[@id=\"customer_password\"]")
	WebElement password;
	

	@FindBy(xpath="//input[@value='Login']")
	WebElement signin;
	
	@FindBy(xpath="//*[@id=\"shopify-section-header\"]/header[2]/div/div[2]/div/div[2]/a")
	WebElement logo;
	
	public Loginpage (WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	
	}
	
	public void text()
	{
		String exp="Home Furniture | Office Furniture | Mattresses | Nilkamal Furniture";
		String act=driver.getTitle();
		System.out.println(act);
		Assert.assertEquals(exp, act);	
		System.out.println("Title Matched");
		Reporter.log("title verified");
		}
	public void buttonclk()
	{
		myaccount.click();
		
	}
	
	public void values(String email,String pass)
	{
		mail.sendKeys(email);
		password.sendKeys(pass);
	}
	public void click()
	{
		signin.click();
	}
	public void logosearch()
	{
		boolean l=logo.isDisplayed();
		if(l==true)
		{
			System.out.println("logo is present");
		}
		else
		{
			System.out.println("logo is not present");
		}
	}
	public void screenshot() throws Exception
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(s,new File("./Screenshots/Login_screen.png"));
	
		System.out.println("Screenshot saved successfully");
		
	}
	
		
	}
	
	
	
