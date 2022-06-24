package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class TestNGRunner {
	@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true,
			plugin={"html:target/cucumer.html","json:target/cucumber.json"})



			public class TestNgRunner extends AbstractTestNGCucumberTests {

			}

}
