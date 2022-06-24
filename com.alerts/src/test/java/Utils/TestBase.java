package Utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;

	public WebDriver WebDriverManager() throws Throwable  {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("qa");
		if (driver == null) {
			if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\src\\test\\resources\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {

			}
			if (prop.getProperty("browser").equalsIgnoreCase("ie")) {

			}
			driver.get(url);
			Thread.sleep(6000);
			driver.manage().window().maximize();
			
		}
		return driver;
	}


}
