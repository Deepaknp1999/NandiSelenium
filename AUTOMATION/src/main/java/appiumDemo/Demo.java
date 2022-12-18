package appiumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	    public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhijith\\Downloads\\Unconfirmed 452359\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        
//	        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	        driver.get("https://mktfarms.freshontable.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(5000);
	        
	        driver.findElement(By.name("mobileNumber")).sendKeys("7353388791");
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/div[2]/div/input")).sendKeys("Hanamant@1996");
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/form/div[4]/button")).click();
	        
	        Thread.sleep(5000);

	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/ul/li[2]")).click();
	        
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[3]/a")).click();
	        
	         driver.findElement(By.xpath("//div//select[@name='unitTypeId']")).click();
	         Thread.sleep(3000);
	        WebElement element=driver.findElement(By.className("fot-formControl custom-select empty"));
	         Select select = new Select(element);
	         Thread.sleep(3000);
	         select.selectByVisibleText("Bottle");
	         Thread.sleep(3000);
	         select.selectByValue("appearance: none; background-color: rgb(255, 255, 255);");
	         Thread.sleep(3000);
	         select.selectByIndex(3);
	    }


}
