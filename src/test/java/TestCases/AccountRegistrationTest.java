package TestCases;

import org.testng.annotations.Test;

import PageObjects.AccountRegistration;
import PageObjects.HomePage;

public class AccountRegistrationTest extends BaseClass {
	@Test
void test_account_regestration()
{
		logger.debug("application logs");
		logger.info("**** starting of AccountRegistrationTest");
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	logger.info("**** clicked on myaccount");
	//hp.clickRegister();
	logger.info("**** clicked on register");
	AccountRegistration a=new AccountRegistration(driver);
	logger.info("****providig customer data");
	a.setFirstName(randomString());
	a.setLastName(randomNumber());
	a.setEamil("rao@gmail.com");
	a.setPassword("uma123456");
	a.clickNewset();
	a.clickPpbox();
	logger.info("****clikcing submit");
	a.clickSubmit();
	logger.info("****Finished AccountRegistrationTest");
}
}
