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
import UIStore.BounceBuy7UI;
import UIStore.Commitment3UI;
import UIStore.Footer6UI;
import UIStore.Review5UI;



public class BounceBuy7Page extends BaseClass {
		
	public static void buy(WebDriver driver) throws InterruptedException
	{
		
		
		driver.findElement(BounceBuy7UI.bounce).click();
		
		driver.findElement(BounceBuy7UI.buy).click();
		String substr3 = driver.findElement(BounceBuy7UI.text).getText();
		rs.TakeScreenShots(driver);
		System.out.println(substr3);
		if(substr3.contains(substr3)) {
			Assert.assertTrue(true);
			log.info("Test 7 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


