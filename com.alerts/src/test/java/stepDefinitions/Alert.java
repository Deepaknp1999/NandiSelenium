package stepDefinitions;

import PageObjects.PageManager;
import Utils.GenericUtils;
import Utils.TestSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alert {
	public TestSetup testSetup;
	public PageManager pagemanager;
	public GenericUtils genericutils;
	public Alert alert;
	public Alert(TestSetup testSetup) {
		this.testSetup=testSetup;
	}
	
	
	
	    @Given("^Navigate to the Alert box$")
	    public void navigate_to_the_alert_box() throws Throwable {
	    	System.out.println("hiii");
	    	
	    }

	    

	    @When("^click the alert box$")
	    public void click_the_alert_box() throws Throwable {
	PageObjects.Alert alert= testSetup.pagemanager.getAlert();
	Thread.sleep(4000);
	
	alert.click();
	    	
	    	
	    }

	    @Then("^verify the alert box$")
	    public void verify_the_alert_box() throws Throwable {
	    }

	}


