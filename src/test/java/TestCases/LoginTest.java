package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import Utilities.DataProvider1;

public class LoginTest extends BaseClass {
	@Test(dataProvider = "TestData", dataProviderClass = DataProvider1.class)
public void tets_login(String u,String p,String s)
{
	logger.info("Testcase started");
	 HomePage hp=new HomePage(driver);
	 hp.clickMyAccount();
	 hp.clickLoginLink();
	 LoginPage lp=new LoginPage(driver);
	 logger.info("Providing logindet");
	lp.setUsername(u); 
	lp.setPassword(p);
	lp.clickSubmit();
	System.out.println(s);
	
}
}
