
  package stepDefinations;
  
  import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
  import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
  import io.cucumber.java.en.Then;
  import io.cucumber.java.en.When;
import pageObjects.Formpage;
import pageObjects.Homepage;
import pageObjects.PageObjectManager;
import utils.TestSetup;
  
  public class FormDefinations {
	  TestSetup testSetup;
	  PageObjectManager pageObjectManager;
  
  public FormDefinations(TestSetup testSetup) {
	  this.testSetup=testSetup; 
	  }
  WebDriver driver;
  @Then("Verify the login is success1")
	public void verify_the_login_is_success() throws InterruptedException {
		Thread.sleep(8000);
		Homepage homePage =testSetup.pageObjectManager.getHomePage();
		boolean logout = homePage.logoutDisplayed();
//   Boolean logout=testSetup.driver.findElement(By.xpath("//button[text()='Log out']")).isDisplayed();
		Assert.assertTrue(logout, "User is not logged to the application");
		System.out.println("Logout is" + logout);
		Thread.sleep(5000);

	}

	@Given("Navigate to the practice form")
	public void navigate_to_the_practice_form() throws InterruptedException {
		Thread.sleep(6000);
//		testSetup.driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[2]/span/div/div[2]"))
//				.click();
//		testSetup.driver.findElement(By.xpath("//*[@id=\"item-0\"]/span[text()='Practice Form']")).click();
//	
		Homepage homePage = testSetup.pageObjectManager.getHomePage();
		homePage.formExapnd();
		homePage.Formpage();
	
	}
	@When("Enter the firstname {string} and lastname {string}")
	public void enter_the_firstname_and_lastname(String firstname, String lastname) throws InterruptedException {
//		PracticeForm practiceForm=new PracticeForm(testSetup.driver);
//		 pageObjectManager=new PageObjectManager(testSetup.driver);
		Formpage practiceForm = testSetup.pageObjectManager.getFormpage();
		practiceForm.enterFirstName(firstname);
		practiceForm.enterLastName(lastname);

		// testSetup.driver.findElement(By.id("firstName")).sendKeys(firstname);
//		testSetup.driver.findElement(By.id("lastName")).sendKeys(lastname);
		Thread.sleep(5000);
	}

	@And("Enter the emailid {string}")
 public void enter_the_emailid(String emailid) throws InterruptedException {
//		PracticeForm practiceForm=new PracticeForm(testSetup.driver);
		Formpage practiceForm = testSetup.pageObjectManager.getFormpage();
		practiceForm.enterEmailId(emailid);
		Thread.sleep(5000);
	}

	@Then("Verify the successfully filled")
 public void verify_the_successfully_filled() throws InterruptedException {
		System.out.println("First name is" );
//		testSetup.driver.quit();
	}

	 @Then("^Verify the successfully filled1$")
	    public void verify_the_successfully_filled1() throws Throwable {

	 }

}


      