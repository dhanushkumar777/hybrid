package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;
import PageObject.BounceBuy7Page;
import PageObject.Commitment3Page;
import PageObject.Footer6Page;
import PageObject.LiveChat8Page;
import PageObject.Picker4Page;
import PageObject.Review5Page;
import PageObject.ShopProductsPage;



public class LiveChat8 extends BaseClass{
	
	@Test
	public void livee() throws InterruptedException
	{		
		logger = report.createTest("LiveChat Test");
		log.info("Extent Report Test 8 is created");
		
		
		logger.info("LiveChat Activity").assignAuthor("Dhanush");
		
		String test2 = excel.getstringdata("Page1", 1, 1);
 AutomotiveHoverPage.getTextByHover(driver);
 ShopProductsPage.ShopHover(driver);
 Commitment3Page.commitHover(driver);
 Picker4Page.picker(driver);
 Review5Page.review(driver,test2);
 Footer6Page.footer(driver);
 BounceBuy7Page.buy(driver);
 LiveChat8Page.live(driver);
		log.info("Executed all test");
	}
}
