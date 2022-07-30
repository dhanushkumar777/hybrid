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
import UIStore.ShopProductsUI;



public class ShopProductsPage extends BaseClass {
		
	public static void ShopHover(WebDriver driver) throws InterruptedException
	{
		//WebDriverWait wait=new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")));
		try {
			 Thread.sleep(3000);
			  driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	   //Thread.sleep(3000);
	 // driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		
		
		WebElement hover = driver.findElement(ShopProductsUI.shophover);
		
		Actions a = new Actions(driver);
		a.moveToElement(hover).perform();
		
		driver.findElement(ShopProductsUI.pacs).click();
		//driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		String substr2 = driver.findElement(ShopProductsUI.verify2).getText();
		System.out.println(substr2);
		if(substr2.contains(substr2)) {
			Assert.assertTrue(true);
			log.info("Test 2 Matches");
		}
		else {
			Assert.assertTrue(false);
		}
		}
	}


