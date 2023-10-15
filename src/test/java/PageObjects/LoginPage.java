package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(name="email")
	WebElement name;
	@FindBy(name="password")
	WebElement pwd;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	public void setUsername(String uname)
	{
		name.sendKeys(uname);
	}
	public void setPassword(String pad)
	{
		pwd.sendKeys(pad);
	}
	public void clickSubmit()
	{
		submit.click();
	}

}
