package pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class LoginPage extends DriverFactory{

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="email")
	public WebElement emailtTextbox;
	
	public void enterEmail()
	{
		emailtTextbox.sendKeys("divya.kondaparthy@gmail.com");
	}

	
	public void enterInvalidEmail()
	{
		emailtTextbox.sendKeys("ivya.kondaparthy@gmail.com");
	}

	@FindBy(xpath="//input[@type=\"password\"]")
	public WebElement password;
	
	public void enterPassword()
	{
		password.sendKeys("dD@12345678");
	}

	public void enterInvalidPassword()
	{
		password.sendKeys("D@12345678");
	}

	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;

	public void clickSignInButton()
	{
		signin.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOf(emailtTextbox));
		
	}

//    @FindBy(xpath="//button[text()='Create Account']")
//    public WebElement createAccount;
//
//    public void clickLoginButton()
//	{
//		loginButton.click();
//	}

//    @FindBy(xpath="//p[text()='mens']")
//    public WebElement mens;
//    

}
