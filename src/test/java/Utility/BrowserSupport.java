package Utility;

//import java.awt.Dimension;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserSupport {
	public static WebDriver OpenBrowsers(WebDriver driver, String browserName, String browserURL) {
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver=new ChromeDriver();
			//ChromeOptions p = new ChromeOptions();
			//p.addArguments("--disable-notifications");
			
			/*Dimension d=new Dimension(1500,800);
			driver.manage().window().setSize(d);
			Map<String, String> mobileEmulation = new HashMap<String, String>();
			mobileEmulation.put("deviceName", "Nexus 5");
			Map<String, Object> chromeOptions = new HashMap<String, Object>();
			chromeOptions.put("mobileEmulation", mobileEmulation);
			DesiredCapabilities cap = DesiredCapabilities.chrome();
			cap.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
			driver = new ChromeDriver(cap);
			//Dimension d=new Dimension(1500,800);
			//driver.manage().window().setSize(d);*/

		} else {
			System.out.println("Sorry the browser is not available");
		}
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//Dimension d=new Dimension(1500,800);
		//driver.manage().window().setSize(d);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(browserURL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;
	}

	public static void closeBrowsers(WebDriver driver) {
		driver.quit();
	}
}
