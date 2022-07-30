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
import PageObject.Slides9Page;



public class AmainRunnerClass extends BaseClass{
	
	@Test
	public void HoverElement() throws InterruptedException
	{		
		logger = report.createTest("Automotive Hover Element Test");
		log.info("Extent Report Test 1 is created");
		logger.info("Hover Activity").assignAuthor("Dhanush");
		logger = report.createTest("Shop Products Element Test");
		log.info("Extent Report Test 2 is created");
		logger.info("Shop Activity").assignAuthor("Dhanush");
		logger = report.createTest("commitment Element Test");
		log.info("Extent Report Test 3 is created");
		logger.info("commitment Activity").assignAuthor("Dhanush");
		logger = report.createTest("picker Element Test");
		log.info("Extent Report Test 4 is created");
		logger.info("picker Activity").assignAuthor("Dhanush");
		logger = report.createTest("Review Element Test");
		log.info("Extent Report Test 5 is created");
		logger.info("Review Activity").assignAuthor("Dhanush");
		logger = report.createTest("footer Element Test");
		log.info("Extent Report Test 6 is created");
		logger.info("footer Activity").assignAuthor("Dhanush");
		logger = report.createTest("bounce buy Element Test");
		log.info("Extent Report Test 7 is created");
		logger.info("buy Activity").assignAuthor("Dhanush");
		logger = report.createTest("liveChat Element Test");
		log.info("Extent Report Test 8 is created");
		logger.info("Livechat Activity").assignAuthor("Dhanush");
		logger = report.createTest("Slides Element Test");
		log.info("Extent Report Test 9 is created");
		logger.info("slides Activity").assignAuthor("Dhanush");
		
		
	
		
/*AutomotiveHover a= new AutomotiveHover();
a.HoverElement();
ShopProducts s=new ShopProducts();
s.shop();
Commitment3 c=new Commitment3();
c.commit();
Picker4 p=new  Picker4();
p.pick();
Review5 r=new Review5();
r.rev();
Footer6 f=new Footer6();
f.foot();
BounceBuy7 b=new BounceBuy7();
b.buyy();
LiveChat8 l=new LiveChat8();
l.livee();
Slides9Page.slide(driver);*/
String test2 = excel.getstringdata("Page1", 1, 1);

 AutomotiveHoverPage.getTextByHover(driver);
// ShopProductsPage.ShopHover(driver);
// Commitment3Page.commitHover(driver);
 //Picker4Page.picker(driver);
 Review5Page.review(driver,test2);
 Footer6Page.footer(driver);
 BounceBuy7Page.buy(driver);
 LiveChat8Page.live(driver);
 Slides9Page.slide(driver);
 ShopProductsPage.ShopHover(driver);
 Commitment3Page.commitHover(driver);
 

	}
}
