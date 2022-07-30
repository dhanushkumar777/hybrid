package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;
import PageObject.Commitment3Page;
import PageObject.Footer6Page;
import PageObject.Picker4Page;
import PageObject.Review5Page;
import PageObject.ShopProductsPage;



public class Footer6 extends BaseClass{
	
	@Test
	public void foot() throws InterruptedException
	{		
		logger = report.createTest("Footer Test");
		log.info("Extent Report Test 6 is created");
		
		
		logger.info("Footer Activity").assignAuthor("Dhanush");
		
		String test2 = excel.getstringdata("Page1", 1, 1);
 AutomotiveHoverPage.getTextByHover(driver);
 ShopProductsPage.ShopHover(driver);
 Commitment3Page.commitHover(driver);
 Picker4Page.picker(driver);
 Review5Page.review(driver,test2);
 Footer6Page.footer(driver);
		log.info("Executed all test");
	}
}
