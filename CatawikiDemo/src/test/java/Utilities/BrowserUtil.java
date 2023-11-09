package Utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;



public class BrowserUtil {
	
public static RemoteWebDriver getDriver() {
		ConfigReader config = new ConfigReader();
				
		String browser= config.getbrowser();//reading browser from propertyfile
		RemoteWebDriver driver=null;
		
   //opening the browser as per the browser details mentioned in the propertyfile.
   
		if(browser!=null&&browser.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser!=null&&browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser!=null&&browser.equals("edge")) {
			driver=new EdgeDriver();
		}
		else {
			driver=new ChromeDriver();
		}
		
		driver.manage().window().maximize();//window will be maximized
		return driver;
		
	}
}
