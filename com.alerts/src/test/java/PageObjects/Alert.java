package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.GenericUtils;

public class Alert {
	public WebDriver driver;
	public GenericUtils genericutils;

	public Alert(WebDriver driver) {
		this.driver = driver;
		genericutils=new GenericUtils(driver);
		

	}
	By click = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[1]");
	By alertclick = By.xpath("//*[text()='Alerts']");
	By alertpopup = By.xpath("//button[@id='alertButton']");
	
	

	public void click() {
		driver.findElement(click);
		genericutils.switchToAlert();

	}

	public void alertclick() {
		driver.findElement(alertclick);

	}

	public void aleertpopup() {
		driver.findElement(alertpopup);

	}

}
