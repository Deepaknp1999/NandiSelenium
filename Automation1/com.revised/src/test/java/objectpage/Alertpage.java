package objectpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alertpage {
	
			
			public WebDriver driver;
	public Alertpage(WebDriver driver) {
		this.driver=driver;
	}	
	
	By alertclick=By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[3]/span/div/div[2]/div[2]");	
	By clickonalertbutton=By.xpath("//*//span[text()='Alerts']");	
By clickonclickmebutton=By.xpath("//*[@id=\"alertButton\"]");

  //By secondndalertbutton=By.xpath("//*[@id=\"timerAlertButton\"]");

	
	public void alertclick(){
		driver.findElement(alertclick).click();
			
	}
	public void clickonalertbutton(){
		driver.findElement(clickonalertbutton).click();
	}
		
	public void clickonclickmebutton(){
		driver.findElement(clickonclickmebutton).click();
	}
	
	


}
