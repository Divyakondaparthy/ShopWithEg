package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ChangePersonalInfo;
import pages.LandingPage;
import pages.LoginPage;
import pages.MensProductsPage;
import pages.ProductDetailsPage;
import utility.DriverFactory;

public class StepDefination extends DriverFactory {
	
	LandingPage landingPage=new LandingPage(driver);
	LoginPage loginPage=new LoginPage(driver);
	ChangePersonalInfo changePersonalInfo=new ChangePersonalInfo(driver);
	MensProductsPage mensProductsPage=new MensProductsPage(driver);
	ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);
	
	
	@Given("user launches shopwitheg application")
	public void user_launches_shopwitheg_application()
	{
		driver.get("https://stg.shopwitheg.com/"); 
		}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() 
	{
		landingPage.clickLoginButton();
	 	}

	@When("user enters invalid username and password")
	public void user_enters_invalid_username_and_password() {
			}

	@When("user clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		loginPage.clickSignInButton();
		}

	
	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		loginPage.enterEmail();
		loginPage.enterPassword();
	  	}

	@Then("verify user is successfully logged in")
	public void verify_user_is_successfully_logged_in() {
	  }

	
	
	@Given("user launches shopwitheg personal information page")
	public void user_launches_shopwitheg_personal_information_page() {
		DriverFactory.driver.navigate().to("https://stg.shopwitheg.com/account/personal-information"); 
	   
	}

	@Given("user changes first name")
	public void user_changes_first_name() {
		
		changePersonalInfo.EnterfirstName();
	}

	@Given("user changes second name")
	public void user_changes_second_name() {
		
	    
	}

	@Then("user changes email")
	public void user_changes_email() {
	    
	}

	@Then("user clicks on save changes")
	public void user_clicks_on_save_changes() {
	    
	}

	@Then("verify success message")
	public void verify_success_message() {
	    
	}
	
	
	@Then("user clicks on mens")

	public void user_clicks_on_mens() {
		landingPage.clickMens();

	}

	@Then("user select a product")
	public void user_select_a_product() {
		mensProductsPage.clickfirstProduct();
		
	  	}

	@Then("user select size")
	public void user_select_size() {
		productDetailsPage.clickSize();
	}

	@Then("user select color")
	public void user_select_color() {
		productDetailsPage.clickColor();
		}

	@Then("user clicks add to cart")
	public void user_clicks_add_to_cart() {
		productDetailsPage.clickAddtoCart();
	}

	@Then("verify product is added successfully")
	public void verify_product_is_added_successfully() {
	}

	
	@Then("user navigate to shopwitheg reset password")
	public void user_navigate_to_shopwitheg_reset_password() {
		DriverFactory.driver.navigate().to("https://stg.shopwitheg.com/account/reset-password");   
	}

	@Then("user enter old password")
	public void user_enter_old_password() {
	    
	}

	@Then("user enter new password")
	public void user_enter_new_password() {
	   
	}

	@Then("user reenter the confirm password")
	public void user_reenter_the_confirm_password() {
	   
	}

	@Then("user clicks save changes")
	public void user_clicks_save_changes() {
	   
	}

	@Then("verify the password changed successfully")
	public void verify_the_password_changed_successfully() {
	    

	}


}
