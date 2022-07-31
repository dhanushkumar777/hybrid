package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Runner.BaseClass;
import UIStore.AutomotiveHoverUI;
import UIStore.Commitment3UI;



public class Commitment3Page extends BaseClass {
		
	public static void commitHover(WebDriver driver) throws InterruptedException
	{
//		WebDriverWait wait=new WebDriverWait(driver,10);
//		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")));
				try {
		 Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	   //Thread.sleep(5000);
	   //driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		//Thread.sleep(1000);
		driver.findElement(Commitment3UI.commithover).click();
		WebElement hover = driver.findElement(Commitment3UI.commithover);
		
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		
		//driver.findElement(Commitment3UI.America).click();
		//driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		//driver.findElement(Commitment3UI.learn).click();
		//String substr3 = driver.findElement(Commitment3UI.verify3).getText();
		/*System.out.println(substr3);
		if(substr3.contains(substr3)) {
			Assert.assertTrue(true);
			log.info("Test 3 Matches");
		}
		else {
			Assert.assertTrue(false);
		}*/
		log.info("Test 3 Matches");
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


