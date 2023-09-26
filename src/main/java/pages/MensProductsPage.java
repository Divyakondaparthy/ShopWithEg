package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class MensProductsPage extends DriverFactory  {

	public MensProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="((//p[text()='view details'])[1]")
	public WebElement product1;
	public void clickfirstProduct()
	{
		product1.click();
	}

	
//	@FindBy(xpath="((//p[text()='view details'])[5]")
//	public WebElement product2;
//	public void clickSecondProduct()
//	{
//		product2.click();
//	}
//
//	@FindBy(xpath="((//p[text()='view details'])[5]")
//	public WebElement product3;
//	public void clickThirdProduct()
//	{
//		product3.click();
//	}
//
//	
//	@FindBy(xpath="((//p[text()='view details'])[5]")
//	public WebElement product4;
//	public void clickFourthProduct()
//	{
//		product4.click();
//	}

	
	
	
	
}
