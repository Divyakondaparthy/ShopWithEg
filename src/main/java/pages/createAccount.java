package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class createAccount extends DriverFactory {
	
	public createAccount(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="firstName")
	public WebElement firstname;
	
	@FindBy(name="lastName")
	public WebElement lastName;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@id=\":r7:\"]")
	public WebElement Birthday;
	
	@FindBy(xpath="//button[@aria-label=\"create account\"]")
	public WebElement createAccount;
	
	
	
	
	
	
	
}
