package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LoginPageObjects loginPage;
	public Formpage practiceForm;
	public Homepage homePage;
	public WebDriver driver;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPageObjects getLoginPage() {
		loginPage = new LoginPageObjects(driver);
		return loginPage;
	}

	public Formpage getFormpage() {
		practiceForm = new Formpage(driver);
		return practiceForm;
	}

	public Homepage getHomePage() {
		homePage = new Homepage(driver);
		return homePage;
	}

}