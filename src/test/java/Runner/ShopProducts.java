package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;
import PageObject.ShopProductsPage;



public class ShopProducts extends BaseClass{
	
	@Test
	public void shop() throws InterruptedException
	{		
		logger = report.createTest("shop Element Test");
		log.info("Extent Report Test 2 is created");
		
		//String test2 = excel.getstringdata("Page2", 1, 0);
		logger.info("Shop hover Activity").assignAuthor("Dhanush");
		//String test1 = excel.getstringdata("Page1", 1, 1);
		//SearchElementPage.searchelement(driver, test1);
		
		//Thread.sleep(6000);

 AutomotiveHoverPage.getTextByHover(driver);
 ShopProductsPage.ShopHover(driver);
//		
		log.info("Executed all test");
	}
}
