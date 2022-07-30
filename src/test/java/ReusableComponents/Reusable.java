package ReusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusable {
public static String TakeScreenShots(WebDriver driver) 
{		
	    File sr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dt = new File("./ScreenShots/"+getDateTime()+".png");
	    
	    try 
	    {
	    	FileUtils.copyFile(sr, dt);
		} 
	    catch (IOException e) 
	    {
			System.out.println("Unable to Capture the ScreenShot");
		}
	return  dt.getAbsolutePath();
	}
	
	public static  String getDateTime() 
	{		
		DateFormat datetimeformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date=new Date();
		return	datetimeformat.format(date);
	
	}
}
