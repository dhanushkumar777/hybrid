package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;
import PageObject.Commitment3Page;
import PageObject.Picker4Page;
import PageObject.Review5Page;
import PageObject.ShopProductsPage;



public class Review5 extends BaseClass{
	
	@Test
	public void rev() throws InterruptedException
	{		
		logger = report.createTest("Review Element Test");
		log.info("Extent Report Test 5 is created");
		
		String test2 = excel.getstringdata("Page1", 1, 1);
		logger.info("Picker Activity").assignAuthor("Dhanush");
		//String test1 = excel.getstringdata("Page1", 1, 1);
		//SearchElementPage.searchelement(driver, test1);
		
		//Thread.sleep(6000);

 AutomotiveHoverPage.getTextByHover(driver);
 ShopProductsPage.ShopHover(driver);
 Commitment3Page.commitHover(driver);
 Picker4Page.picker(driver);
 Review5Page.review(driver,test2);
		log.info("Executed all test");
	}
}
