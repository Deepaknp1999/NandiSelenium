package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class TestSetup {

	public   PageObjectManager pageObjectManager;
	public  Genericutils genericUtils;
	public static WebDriver driver;
	public TestBase testBase;

	public TestSetup() throws IOException {
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		genericUtils = new Genericutils(testBase.webDriverManager());
	}
}