package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class LoginStepDefinations {

    @Given("^I want to write a step with precondition$")
    public void i_want_to_write_a_step_with_precondition() throws Throwable {
    	
    	System.out.println("Steps");
    }

    @When("^I complete action$")
    public void i_complete_action() throws Throwable {
    	System.out.println("Step2");
    }

    @Then("^I validate the outcomes$")
    public void i_validate_the_outcomes() throws Throwable {
    	System.out.println("Steps3");
    }



	 @Given("^User launched the login page$")
	    public void user_launched_the_login_page() throws Throwable {
	    }

	    @When("^User logged into tghe application with username\"([^\"]*)\" and password\"([^\"]*)\"$")
	    public void user_logged_into_tghe_application_with_usernamesomething_and_passwordsomething(String strArg1, String strArg2) throws Throwable {
	    System.out.println(strArg1);
	    System.out.println(strArg2);
	    }

	    @Then("^Home page is not displayed$")
	    public void home_page_is_not_displayed() throws Throwable {
	    }

	    @And("^Home page components are displayed$")
	    public void home_page_components_are_displayed() throws Throwable {
	    }

	    

	    @And("^Home page component displayed$")
	    public void home_page_component_displayed() throws Throwable {
	    	
	    	System.out.println("Home page comp");
	    	
	    }
	    @Given("^Validate the browser$")
	    public void validate_the_browser() throws Throwable {
	    	System.out.println("a");
	    }

	    @When("^Browser is opened$")
	    public void browser_is_opened() throws Throwable {
	    	System.out.println("b");
	    }

	    @Then("^Check the browser is started$")
	    public void check_the_browser_is_started() throws Throwable {
	    	System.out.println("c");
	    }
	    @When("^User logged into the application with different credentials$")
	    public void user_logged_into_the_application_with_different_credentials(DataTable data) throws Throwable {
	    	List<List<String>> ref=data.asLists();
			
			System.out.println(ref.get(0).get(0));
			
			System.out.println("DataTable value is " + ref.get(0).get(0));
			System.out.println("DataTable value is " +  ref.get(0).get(1));
			System.out.println("DataTable value is " + ref.get(0).get(2));
			
			System.out.println("DataTable value is " + ref.get(1).get(0));
			System.out.println("DataTable value is " +  ref.get(1).get(1));
			System.out.println("DataTable value is " + ref.get(1).get(2));
			
	    }

	    @When("^User logged into the application with username (.+) and password (.+)$")
	    public void user_logged_into_the_application_with_username_and_password(String username, String password) throws Throwable {

	   	 System.out.println("Username is " + username   + " and " +  "Password is " +password );
	    }
	    @And("^Home page is displayed \"([^\"]*)\"$")
	    public void home_page_is_displayed_something(String strArg1) throws Throwable {
	    	System.out.println("d");
	    	
	    }




	}
