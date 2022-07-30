package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.BaseClass;
import UIStore.AutomotiveHoverUI;
import UIStore.Commitment3UI;
import UIStore.Review5UI;
//import UIStore.SearchElementUI;



public class Review5Page extends BaseClass {
		
	public static void review(WebDriver driver,String data1) throws InterruptedException
	{
			
		WebElement sear = driver.findElement(Review5UI.search);
		sear.sendKeys(data1);
		sear.sendKeys(Keys.ENTER);
		
		//driver.findElement(Review5UI.search).sendKeys("liquid");
		//driver.findElement(Review5UI.search).sendKeys(Keys.ENTER);
		driver.findElement(Review5UI.product).click();
		String substr3 = driver.findElement(Review5UI.review).getText();
		System.out.println(substr3);
		if(substr3.contains(substr3)) {
			Assert.assertTrue(true);
			log.info("Test 5 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(4000);
		}
	}


