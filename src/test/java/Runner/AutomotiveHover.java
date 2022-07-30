package Runner;

import org.testng.annotations.Test;

import PageObject.AutomotiveHoverPage;



public class AutomotiveHover extends BaseClass{
	
	
	@Test
	public void HoverElement() throws InterruptedException
	{		
		logger = report.createTest("Hovering Element Test");
		log.info("Extent Report Test 2 is created");
		
		//String test2 = excel.getstringdata("Page2", 1, 0);
		logger.info("Hover Element Activity").assignAuthor("Dhanush");
		//String test1 = excel.getstringdata("Page1", 1, 1);
		//SearchElementPage.searchelement(driver, test1);
		
		//Thread.sleep(6000);

 AutomotiveHoverPage.getTextByHover(driver);
//		
		log.info("Executed all test");
	}
}
