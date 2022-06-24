package Utils;

import org.openqa.selenium.WebDriver;

import PageObjects.PageManager;

public class TestSetup {
	public WebDriver driver;
	public TestBase testBase;
	public PageManager pagemanager;
	
	public TestSetup(WebDriver driver) throws Throwable {
		testBase = new TestBase();
		pagemanager = new PageManager(testBase.WebDriverManager());
	
	}

}
