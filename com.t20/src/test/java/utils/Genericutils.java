package utils;

import org.openqa.selenium.WebDriver;

public class Genericutils  {

	public WebDriver driver;

	public Genericutils(WebDriver driver) {
		this.driver=driver;
	}

	public void switchToWindow(){
		System.out.println("Test");
	}

}