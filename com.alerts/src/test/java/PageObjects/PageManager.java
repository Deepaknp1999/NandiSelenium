package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageManager{
	public WebDriver driver;
	public Alert alert;
	public loginpageobject login;
	
	
	public PageManager(WebDriver driver) {
		this.driver=driver;
	}
	public loginpageobject getloginpage() {
		login=new loginpageobject(driver);
		return login;
		
		
		
	}
		
	
	
	public Alert getAlert() {
		alert=new Alert(driver);
		return alert;
		
		
		
	}

}
