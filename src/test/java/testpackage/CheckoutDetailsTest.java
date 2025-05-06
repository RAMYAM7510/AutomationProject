package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagepackage.CheckoutDetailspage;

public class CheckoutDetailsTest extends BaseClass
{
	@Test
	public void datas() throws Exception
	{
		CheckoutDetailspage ob=new CheckoutDetailspage(driver);
		ob.checkout_info(
	            "Kadavanthra",
	            "Kochi",
	            "Kerala",
	            "682020",
	            "9098898790"
	        );
		Thread.sleep(1000);
		ob.screenshot1();
	}
	

}
