package pagepackage;

import java.io.File;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutDetailspage {
    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//*[@id='shipping-address1']")
    WebElement address;

    @FindBy(css = "input[placeholder='City']")
    WebElement city;

    @FindBy(name = "zone")
    WebElement state;

    @FindBy(xpath = "//input[@placeholder='PIN code']")
    WebElement pincode;

    @FindBy(name = "phone")
    WebElement phn_no;

    @FindBy(xpath = "//*[@id='billing_address_selector-shipping_address']")
    WebElement checkbox;

    @FindBy(xpath = "//*[@id='checkout-pay-button']")
    WebElement pay_btn;

    public CheckoutDetailspage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void checkout_info(String addressText, String cityText, String stateText, String pinCode, String phoneNumber) throws Exception
    {
        address.clear();
        address.sendKeys(addressText);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 300)");

        wait.until(ExpectedConditions.visibilityOf(city));
        city.clear();
        city.sendKeys(cityText);

        wait.until(ExpectedConditions.elementToBeClickable(state));
        Select sob = new Select(state);
        sob.selectByVisibleText(stateText);

        wait.until(ExpectedConditions.visibilityOf(pincode));
        pincode.clear();
        pincode.sendKeys(pinCode);

        js.executeScript("arguments[0].scrollIntoView(true);", phn_no);
        wait.until(ExpectedConditions.elementToBeClickable(phn_no));
        phn_no.clear();
        phn_no.sendKeys(phoneNumber);

        wait.until(ExpectedConditions.elementToBeClickable(checkbox));
        checkbox.click();

        js.executeScript("arguments[0].scrollIntoView(true);", pay_btn);
        wait.until(ExpectedConditions.elementToBeClickable(pay_btn));
        pay_btn.click();
        Thread.sleep(5000);
    }
    public void screenshot1() throws Exception
	{
   
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		FileHandler.copy(s,new File("./Screenshots/Payment_screen.png"));
	
		System.out.println("Screenshot saved successfully");
		
	}
}