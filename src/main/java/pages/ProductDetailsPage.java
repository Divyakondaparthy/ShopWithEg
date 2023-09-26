package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.DriverFactory;

public class ProductDetailsPage extends DriverFactory {

	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@aria-labelledby=\"select-label\"][1]")
	public WebElement size;
	public void clickSize()
	{
		size.click();
	}
	
	@FindBy(xpath="//div[@aria-labelledby=\"select-label\"][2]")
	public WebElement color;
	public void clickColor()
	{
		color.click();
	}
	
	@FindBy(xpath="//span[text()='S']")
	public WebElement smallsize;
	public void selectsmallSize()
	{
		smallsize.click();
	}
//	@FindBy(xpath="//span[text()='L']")
//	public WebElement largesize;
//	
//	
//	public void selectlargeSize()
//	{
//		largesize.click();
//	}
	
	@FindBy(xpath="//span[text()='Beige']")
	public WebElement color1;
	public void selectColor1()
	{
		color1.click();
	}
	
	
	
	@FindBy(xpath="//p[text()='add to cart']")
	public WebElement addTocart;
	
	
	public void clickAddtoCart()
	{
		addTocart.click();
	}
	
//	@FindBy(xpath="//button[@aria-label=\"save to wishlist\"]")
//	public WebElement saveTowishlist;
//	public void clicksavetoWhislist()
//	{
//		saveTowishlist.click();
//	}
//	
	@FindBy(xpath="//p[text()='continue shopping']")
	public WebElement continueShopping;
	public void clickcontinueShopping()
	{
		continueShopping.click();
	}
	
	@FindBy(xpath="//p[text()='view cart']")
	public WebElement viewcart;
	public void clickviewcart()
	{
		viewcart.click();
	}
}
