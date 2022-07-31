package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.BaseClass;
import UIStore.AutomotiveHoverUI;
import UIStore.Commitment3UI;
import UIStore.Picker4UI;



public class Picker4Page extends BaseClass {
		
	public static void picker(WebDriver driver) throws InterruptedException
	{
		try {
			 Thread.sleep(3000);
			  driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		
		driver.findElement(Picker4UI.up1).click();
		
		String substr1=driver.findElement(Picker4UI.name1).getText();
		System.out.println(substr1);
		if(substr1.contains(substr1)) {
			Assert.assertTrue(true);
			log.info("Test 4 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(Picker4UI.learn1).click();
		String title=driver.getTitle();
//		
		System.out.println(title);
		
		log.info("Test 4 Matches");
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


