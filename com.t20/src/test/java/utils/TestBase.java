package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static WebDriver driver;

	public WebDriver webDriverManager() throws IOException {

		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\test\\resources\\info.properties");
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

			if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			}


			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;
	}

}