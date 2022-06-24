package Utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class GenericUtils {
	
	public WebDriver driver;
	public GenericUtils genericutils;

	public GenericUtils(WebDriver driver) {
		this.driver=driver;
		
	}

	public void switchToAlert(){
		Alert alert = driver.switchTo().alert();
		String alertText1 = alert.getText();
		System.out.println("Alert text is :" + alertText1);
		alert.accept();	

		

	}


		
		
		
		
	}
	
	
	
	

	
	
	


