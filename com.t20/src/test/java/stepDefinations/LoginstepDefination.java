package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObjects;
import pageObjects.PageObjectManager;
import utils.TestSetup;

public class LoginstepDefination {
	TestSetup testSetup;
	PageObjectManager pageObjectManager;
	public LoginstepDefination(TestSetup testsetup)
	{
		this.testSetup=testsetup;
	}
	

	public WebDriver driver;

	@Given("^Launch the browser$")
	public void launch_the_browser() throws Throwable {
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Git hub training files\\chromedriver_win32 (2)\\chromedriver.exe");
		 * 
		 * TestSetup.driver = new ChromeDriver();
		 * TestSetup.driver.get("https://demoqa.com/login");
		 * TestSetup.driver.manage().window().maximize(); Thread.sleep(5000);
		 * System.out.println("launch ");
		 */
	}

	@When("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		LoginPageObjects loginPage=new LoginPageObjects(TestSetup.driver);		
		loginPage.enterUsername(strArg1);		
		loginPage.enterPassword(strArg2);		
		loginPage.loginButton();
		/*
		 * testSetup.driver.findElement(By.id("userName")).sendKeys("deepak123");
		 * testSetup.driver.findElement(By.id("password")).sendKeys("Deepak123$");
		 * testSetup.driver.findElement(By.xpath("//button[text()='Login']")).click();
		 * Thread.sleep(5000);
		 */

		System.out.println("login ");
	}

	@Then("^Verify the login is successful$")
	public void verify_the_login_is_successful() throws Throwable {
		LoginPageObjects loginPage=new LoginPageObjects(TestSetup.driver);	
		boolean logout1=loginPage.logoutButton();
	Boolean logout=testSetup.driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
	 Assert.assertTrue(logout1, "User is not logged to the application");

		/*
		 * boolean Logout =
		 * driver.findElement(By.xpath("//*[text()='Log out']")).isDisplayed();
		 * 
		 * Assert.assertTrue(Logout, "Logout is not displayed");
		 */
		System.out.println("verify ");
		//Thread.sleep(10000);
	//	driver.quit();
		
	}

}
