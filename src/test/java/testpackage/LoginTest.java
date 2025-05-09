package testpackage;

import org.testng.annotations.Test;

import basepackage.BaseClass;
import pagepackage.Loginpage;
import utilitiespackage.Excelutils;


public class LoginTest extends BaseClass
{
	@Test
	public void datadriven() throws Exception
	{
		Loginpage ob=new Loginpage(driver);
		ob.text();
		ob.buttonclk();
		String xl="C:\\Users\\user\\OneDrive\\Desktop\\Nilkamal.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutils.getRowCount(xl,Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			
			String Username=Excelutils.getCellValString(xl,Sheet,i,0);
			System.out.println("Username="+Username);
			
			String pwd=Excelutils.getCellValString(xl,Sheet,i,1);
			System.out.println("Password="+pwd);

			ob.values(Username, pwd);
			ob.click();
			String expurl="https://www.nilkamalfurniture.com/account";
			String acturl=driver.getCurrentUrl();
			
			if(acturl.equals(expurl))
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Login Fail");
				driver.get("https://www.nilkamalfurniture.com/account/login?return_url=%2Faccount");
				
				
			}
	}
		ob.logosearch();
		ob.screenshot();

}
}

