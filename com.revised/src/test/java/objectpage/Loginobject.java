package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginobject {
	
	public WebDriver driver;
	public Loginobject(WebDriver driver) {
		this.driver=driver;
	}
	By user = By.id("userName");
	By pwd = By.id("password");
	By log = By.xpath("//button[text()='Login']");
	By logt=By.xpath("//button[text()='Log out']");
	
	public void enterusername(String s1) {
		driver.findElement(user).sendKeys(s1);
	}
public void enterpassword(String s2) {
		driver.findElement(pwd).sendKeys(s2);
	}

public void enterlogin() {
	driver.findElement(log).click();
}
public boolean logoutdisplayed()
{
	return driver.findElement(logt).isDisplayed();
}
}

