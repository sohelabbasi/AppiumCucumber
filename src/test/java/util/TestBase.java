package util;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.support.PagedListHolder;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase extends PageInitializer {
	
	public static AppiumDriver driver;
	public static Properties prop;

	
	public static void initialization() throws MalformedURLException{
		CofigReader.readProperties();
		String browsername = CofigReader.getPropertyValue("browser");
		if(browsername.equals("appium")){
			File appDir = new File("apk"); 
			File app = new File(appDir, "TestApp.apk");   
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"60");
			capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, ""); // or other browsers
		    capabilities.setCapability("noReset", true );
		    capabilities.setCapability("deviceName","emulator-5554");
			capabilities.setCapability("platformName", "Android");
			capabilities.setCapability("automatorName", "UiAutomator2");
			capabilities.setCapability("noSign", "true");
			capabilities.setCapability("appPackage", CofigReader.getPropertyValue("apppackage"));
			capabilities.setCapability("appActivity", CofigReader.getPropertyValue("appactivity"));
			URL u = new URL("http://127.0.0.1:4723/wd/hub");
			 driver = new AppiumDriver(u, capabilities);
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			 //driver.resetApp();
			System.out.println("Application launched");
			initializeObject();
	}

	}
	
	public static void intentionalWait() throws InterruptedException{
		Thread.sleep(3000);
	}
	
	public static void tearDown() throws InterruptedException{
		driver.closeApp();
		Thread.sleep(3000);
	}
}
