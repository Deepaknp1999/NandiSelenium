package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multipleinvaliddata {

	WebDriver driver;

	@Given("^User launched the login1 page$")
	public void user_launched_the_login1_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Git hub training files\\chromedriver_win32 (2)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		// driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
	}

	@When("^User logged1 into the application with username (.+) and password (.+)$")
	public void user_logged1_into_the_application_with_username_and_password(String username, String password)
			throws Throwable {
		driver.findElement(By.id("userName")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		System.out.println("Username is " + username + " and " + "Password is " + password);
	}

	@Then("^Home page1 is not displayed$")
	public boolean home_page1_is_not_displayed() throws Throwable {
		
		Thread.sleep(5000);

		boolean errormessage = driver.findElement(By.xpath("//p[text()='Invalid username or password!']"))
				.isDisplayed();
		
		System.out.println(errormessage);
		Assert.assertTrue(errormessage, "error message is displayed");
		return errormessage;
//		String actual="Invalid username or password!";
////		String expected=driver.findElement(By.xpath("//*[text()='Invalid username or password!']")).getText();
//		if(actual.equalsIgnoreCase(expected)) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
//		// boolean errormessage =driver.findElement(By.xpath("//*[text()='Invalid username or password!']")).isDisplayed();
//		 
//		  //Assert.assertTrue(errormessage, "error message is displayed");
//	// return errormessage;
	}

}
