package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagepackage.Searchpage;

public class SearchTest extends BaseClass 
{
	@Test
	public void function() throws InterruptedException
	{
		Thread.sleep(1000);
		Searchpage ob1=new Searchpage(driver);
		ob1.searchfunction();
		ob1.iconclk();
		
	}

}
