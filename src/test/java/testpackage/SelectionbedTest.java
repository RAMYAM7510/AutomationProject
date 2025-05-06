package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagepackage.Selectionbedpage;

public class SelectionbedTest extends BaseClass
{
	@Test
	public void set() throws InterruptedException
	{
		Selectionbedpage ob2=new Selectionbedpage(driver);
		Thread.sleep(1000);
		ob2.functionclick();
		Thread.sleep(1000);
		ob2.selection();
		Thread.sleep(1000);
		ob2.size();
		Thread.sleep(1000);
	}

}
