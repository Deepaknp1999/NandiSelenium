package appiumDemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumBasics {
@Test
public void AppiumTest() throws MalformedURLException


{
	DesiredCapabilities dsp = new DesiredCapabilities();
	/*
	 * UiAutomator2Options options = new UiAutomator2Options();
	 * options.setDeviceName("Pixel_3a_API_33_x86_64"); options.setApp(
	 * "G:\\JuneWorkspace\\AUTOMATION\\src\\main\\java\\resources\\ApiDemos-debug.apk"
	 * );
	 * 
	 * AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),
	 * options);
	 */
	
	dsp.setCapability(MobileCapabilityType.PLATFORM_NAME, false);
	
}
}
