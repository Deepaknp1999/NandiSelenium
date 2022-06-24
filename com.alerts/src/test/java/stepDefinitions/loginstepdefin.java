package stepDefinitions;

import PageObjects.PageManager;
import PageObjects.loginpageobject;
import Utils.GenericUtils;
import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefin {
	public TestSetup testSetup;
	public PageManager pagemanager;
	public GenericUtils genericutils;
	public Alert alert;
	public loginstepdefin(TestSetup testSetup) {
		this.testSetup=testSetup;
	}

	
	 @Given("^launch the browser$")
	    public void launch_the_browser() throws Throwable {
		 System.out.println("hlooo");
	    }
	 @When("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	    public void login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
	    	Thread.sleep(4000);
		//PageObjects.Alert loginpage = testSetup.pagemanager.getAlert();
			
			loginpageobject log=testSetup.pagemanager.getloginpage();
			log.enterUserName(strArg1);
			Thread.sleep(2000);
			
			log.enterPassword(strArg2);
			Thread.sleep(8000);
			
			log.loginButton();
			Thread.sleep(2000);
	    	System.out.println("hut");
	    	
	    }

	    @Then("^verify the login is succcessfull$")
	    public void verify_the_login_is_succcessfull() throws Throwable {
	    }


}
