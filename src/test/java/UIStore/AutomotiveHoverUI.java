package UIStore;

import org.openqa.selenium.By;

public class AutomotiveHoverUI {
	
	public static By pg = By.cssSelector("img[src='/images/header_logo_png.png']");
	
	public static By pghover = By.xpath("//div[@class='navigation']//li//span[contains(text(),'Our Company')]");
	
	public static By leader = By.linkText("Leadership");
	public static By verify1 = By.xpath("//span[contains(text(),'A team with the future in mind')]");
	
}
