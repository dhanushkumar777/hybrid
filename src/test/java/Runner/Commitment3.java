package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;
import PageObject.Commitment3Page;
import PageObject.ShopProductsPage;



public class Commitment3 extends BaseClass{
	
	@Test
	public void commit() throws InterruptedException
	{		
		logger = report.createTest("Commitment Test");
		log.info("Extent Report Test 2 is created");
		
		//String test2 = excel.getstringdata("Page2", 1, 0);
		logger.info("commitment hover Activity").assignAuthor("Dhanush");
		//String test1 = excel.getstringdata("Page1", 1, 1);
		//SearchElementPage.searchelement(driver, test1);
		
		//Thread.sleep(6000);

 AutomotiveHoverPage.getTextByHover(driver);
 ShopProductsPage.ShopHover(driver);
 Commitment3Page.commitHover(driver);
		log.info("Executed all test");
	}
}
