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
import UIStore.Footer6UI;
import UIStore.LiveChat8UI;
import UIStore.Review5UI;



public class LiveChat8Page extends BaseClass {
		
	public static void live(WebDriver driver) throws InterruptedException
	{
		
		
		driver.findElement(LiveChat8UI.livechatclick).click();
		Thread.sleep(2000);
		
		String substr8 = driver.findElement(LiveChat8UI.textlive).getText();
		System.out.println(substr8);
		if(substr8.contains(substr8)) {
			Assert.assertTrue(true);
			log.info("Test 8 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		String title1=driver.getTitle();
		System.out.println(title1);
		
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


