package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagepackage.Createaccount;

public class CreateaccountTest extends BaseClass
{
	@Test
	public void createset()
	{
		Createaccount ob=new Createaccount(driver);
		ob.iconclk();
		ob.details();
		ob.sign();
	}

}
