package tests;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utilities.BrowserUtil;
import Utilities.ConfigReader;
import pages.SearchPage;

public class SearchTest {
	
		
	RemoteWebDriver driver;
	
	//Open the browser before the Test starts
	@BeforeTest
	public void openBrowser() {
		
	driver=BrowserUtil.getDriver();	
		
	}
	
	//Execution of the Test
	@Test
	
	public void search() {
	SearchPage page =new SearchPage(driver);
	page.searchAction();
		
		
	}
	
	//Closing the Browser after the Test
	@AfterTest
	public void CloseBrowser() {
		 driver.close();
		 driver.quit();
		
	}
	
	  


}
