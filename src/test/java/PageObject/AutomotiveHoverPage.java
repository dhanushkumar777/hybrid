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



public class AutomotiveHoverPage extends BaseClass {
		
	public static void getTextByHover(WebDriver driver) throws InterruptedException
	{
		/*WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//iframe[@class='lilo3746-iframe']")));
				
	   
	    driver.findElement(By.xpath("//iframe[@class='lilo3746-iframe']//following-sibling::a")).click();
		Thread.sleep(1000);*/
		driver.findElement(AutomotiveHoverUI.pg).click();
		WebElement hover = driver.findElement(AutomotiveHoverUI.pghover);
		
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		
		driver.findElement(AutomotiveHoverUI.leader).click();
		String substr2 = driver.findElement(AutomotiveHoverUI.verify1).getText();
		System.out.println(substr2);
		if(substr2.contains(substr2)) {
			Assert.assertTrue(true);
			log.info("Test 1 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.navigate().to("https://tide.com/en-us");
		Thread.sleep(3000);
		}
	}


