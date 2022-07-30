package Runner;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import ReusableComponents.Reusable;
import Utility.BrowserSupport;
import Utility.ConfigProperties;
import Utility.ExcelReader;

public class BaseClass {
	public static WebDriver driver;
	
	 protected static ExcelReader excel;
	 ConfigProperties config;
	 public static ExtentReports report;
	 
	 public static ExtentTest logger;
	 public static Logger log = LogManager.getLogger(BaseClass.class);
	 public static Reusable rs=new Reusable();
	 
	 
	 @BeforeSuite
	 public void InitializeMethods() {
	 	excel=new ExcelReader();
	 	config=new ConfigProperties();
	 	report=new ExtentReports();
	 	ExtentSparkReporter rep=new ExtentSparkReporter(new File("./ExtentReports1/"+ReusableComponents.Reusable.getDateTime()+".html"));
	 	report.attachReporter(rep);
	 	rep.config().setDocumentTitle("Mindtree");
	 	log.info("Initializing all the Methods");
	 } 
	 
	 @BeforeClass
	 public void setUp() {
	 	String BrowserTaken = config.getKey("Browser");
	 	String UrlFromConfig =config.getKey("url");
	 	driver = BrowserSupport.OpenBrowsers(driver, BrowserTaken, UrlFromConfig);
	 	log.info("Setting Up the Browser");
	 }
		
	@AfterMethod
	public void tearDownMethod(ITestResult result) 
	{
		if (result.getStatus()==ITestResult.SUCCESS) {
			Reusable.TakeScreenShots(driver);
			logger.pass("Passs ").addScreenCaptureFromPath(Reusable.TakeScreenShots(driver));
			log.info("Test Case Passed");
		
		}
		else if (result.getStatus()==ITestResult.FAILURE) {
			logger.fail("Failed ").addScreenCaptureFromPath(Reusable.TakeScreenShots(driver));
			log.warn("This test case failed");
		}
	    
		BrowserSupport.closeBrowsers(driver);
	}
	
	@AfterSuite
	public void Clear() {
		log.info("Extent Report Finish");
		BrowserSupport.closeBrowsers(driver);
		report.flush();
		
	}
}
