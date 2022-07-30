package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import UIStore.Slides9UI;



public class Slides9Page extends BaseClass {
		
	public static void slide(WebDriver driver) throws InterruptedException
	{
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@class='lilo3746-iframe']")));
				
	   
	    driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']//following-sibling::a")).click();
		Thread.sleep(1000);*/
		//driver.findElement(Commitment3UI.commithover).click();
		
		
		driver.findElement(Slides9UI.click).click();
		Thread.sleep(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)", "");
		//WebElement flag=driver.findElement(Slides9UI.right);
		//js.executeScript("arguments[0].scrollIntoview();", flag);
		//driver.findElement(Slides9UI.right).click();
		//driver.findElement(Slides9UI.left).click();
		
		String title1=driver.getTitle();
		System.out.println(title1);
		log.info("Test 9 Matches");
		
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


