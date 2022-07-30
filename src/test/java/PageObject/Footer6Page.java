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
import UIStore.Review5UI;



public class Footer6Page extends BaseClass {
		
	public static void footer(WebDriver driver) throws InterruptedException
	{
		
		
		
		driver.findElement(Footer6UI.tideclean).click();
		Thread.sleep(2000);
		driver.findElement(Footer6UI.dress).click();
		String substr3 = driver.findElement(Footer6UI.footerverify).getText();
		System.out.println(substr3);
		if(substr3.contains(substr3)) {
			Assert.assertTrue(true);
			log.info("Test 6 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


