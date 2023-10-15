package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//span[normalize-space()='My Account']")
     WebElement myAccount;
	@FindBy(how=How.XPATH,using="//a[normalize-space()='Register']")
	WebElement register;
	@FindBy(how=How.LINK_TEXT,using="Login")
	WebElement login;
	public void clickMyAccount() {
		myAccount.click();
	}
	public void clickRegister()
	{
		register.click();
	}
	public void clickLoginLink()
	{
		login.click();
	}
}

