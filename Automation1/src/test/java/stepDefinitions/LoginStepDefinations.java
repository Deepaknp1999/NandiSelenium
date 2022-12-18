
  package stepDefinitions;
  
  import org.junit.runner.RunWith;
  
  import io.cucumber.java.en.Given; import io.cucumber.java.en.Then; import
  io.cucumber.java.en.When;
  
 public class LoginStepDefinations {
  
  @Given("^I want to write a step with precondition$") public void
  i_want_to_write_a_step_with_precondition() throws Throwable {
  
  System.out.println("Steps"); }
  
  @When("^I complete action$") public void i_complete_action() throws Throwable
  { System.out.println("Step2"); }
  
  @Then("^I validate the outcomes$") public void i_validate_the_outcomes()
  throws Throwable { System.out.println("Steps3"); }
  
  
  }
  
  
 