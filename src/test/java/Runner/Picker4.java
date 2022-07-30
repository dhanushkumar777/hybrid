package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;
import PageObject.Commitment3Page;
import PageObject.Picker4Page;
import PageObject.ShopProductsPage;



public class Picker4 extends BaseClass{
	
	@Test
	public void pick() throws InterruptedException
	{		
		logger = report.createTest("Picker Test");
		log.info("Extent Report Test 4 is created");
		
		//String test2 = excel.getstringdata("Page2", 1, 0);
		logger.info("Picker Activity").assignAuthor("Dhanush");
		//String test1 = excel.getstringdata("Page1", 1, 1);
		//SearchElementPage.searchelement(driver, test1);
		
		//Thread.sleep(6000);

 AutomotiveHoverPage.getTextByHover(driver);
 ShopProductsPage.ShopHover(driver);
 Commitment3Page.commitHover(driver);
 Picker4Page.picker(driver);
		log.info("Executed all test");
	}
}
