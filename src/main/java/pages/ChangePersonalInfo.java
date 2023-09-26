package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class ChangePersonalInfo extends DriverFactory {
	
	public ChangePersonalInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstName")
	public WebElement firstName;
	public void EnterfirstName()
	{
		firstName.sendKeys("DIVYA");
	}
	
	
	
	
	@FindBy(xpath="//input[@name=\"phoneMobile\"]")
	public WebElement phonenumber;
	public void EnterPhoneNumber()
	{
		phonenumber.sendKeys("9849787217");
	}
	
	
	
}
