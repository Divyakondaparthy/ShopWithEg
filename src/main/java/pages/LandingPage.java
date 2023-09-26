package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.DriverFactory;

public class LandingPage extends DriverFactory {
	
	public LandingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;
	
	public void clickLoginButton()
	{
		loginButton.click();
	}

	  @FindBy(xpath="//a[text()=\"men's\"]")
      public WebElement mens;
	  
	  public void clickMens()
		{
		  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(mens));
		 
		  JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",mens);
		}
    
	  @FindBy(xpath="//p[text()='womens']")
      public WebElement womens;
	  
	  public void clickWomen()
		{
		  womens.click();
		}
	  
	  @FindBy(xpath="//p[text()='fashion for all']")
      public WebElement forall;
	  
	  public void clickFashionForAll()
		{
		  forall.click();
		}
	  
	  @FindBy(xpath="//p[text()='beauty']")
      public WebElement beauty;
	  
	  public void clickBeauty()
		{
		  beauty.click();
		}
}
