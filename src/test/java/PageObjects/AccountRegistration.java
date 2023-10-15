package PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountRegistration extends BasePage {

	public AccountRegistration(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
@FindBy(how=How.NAME,using="firstname")
WebElement firstName;
@FindBy(name="lastname")
WebElement lastName;
@FindBy(id="input-email")
WebElement email;
@FindBy(how=How.NAME,using="password")
WebElement pwd;
@FindBy(xpath="//label[text()='No']")
WebElement newset;
@FindBy(xpath="//button[@type='submit']")
WebElement sub;
@FindBy(xpath="//input[@name='agree']")
WebElement pp;
public void setFirstName(String fname)
{
	firstName.sendKeys(fname);
}
public void setLastName(String lname)
{
	lastName.sendKeys(lname);
}
public void setEamil(String emaiil)
{
	email.sendKeys(emaiil);
}
public void setPassword(String pass)
{
	pwd.sendKeys(pass);
}
public void clickNewset()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",newset);
}
public void clickSubmit()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",sub);
}
public void clickPpbox()
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",pp);
}
}
