package cucumberOptions;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features", glue = "stepDefinations",tags="@tag121")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
