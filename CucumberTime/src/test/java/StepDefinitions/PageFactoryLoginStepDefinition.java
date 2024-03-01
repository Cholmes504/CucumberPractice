package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageFactory.HomePageFactory;
import PageFactory.LoginPageFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageFactoryLoginStepDefinition {

	static WebDriver driver;
	LoginPageFactory login;
	HomePageFactory home;
	
	
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/v1/");
	}

	//@When("User enters username and password")
	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
	//public void user_enters_username_and_password() {
	    //driver.findElement(By.id("user-name")).sendKeys(username);
	    //driver.findElement(By.id("password")).sendKeys(password);
	    //Thread.sleep(2000);
		login = new LoginPageFactory(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
	  //  driver.findElement(By.id("login-button")).click();
		login.clickLogin();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	   home = new HomePageFactory(driver);
	   home.isCartDisplayed();
	   
		
		//Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size()>0,"User has been navigated to the homepage");
	}

	@And("Close the Browser")
	public void close_the_browser() {
	    driver.close();
	}
	
	
}



