package Action;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebActionSearch {
	
	//Opening Catawiki URL
	public static void openUrl ( RemoteWebDriver driver,String url) {
		driver.get("https://www.catawiki.com/en/");
	}

	//Searching the text provided in the search field and navigating to search result page
	public static void search(RemoteWebDriver driver,By cookieText,By agreeButton,By searchField,By magnifierButton,String searchtext) {
	  
      String text= driver.findElement(cookieText).getText();
		
      //Accepting the cookies
		try {
		if (text.contains("Cookie Policy")) {
		    driver.findElement(agreeButton).click();
			
		}else {
			System.out.println("cookies have been accepted");
		}
		}catch(Exception e) {
			System.out.println("cookies hasnot been accepted");
		}
	
		//searching the text 
		driver.findElement(searchField).sendKeys(searchtext);
		driver.findElement(magnifierButton).click();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	}
	
	//Reading the second lot from the search results and displaying the details of the lot in console
	public static void searchResult(RemoteWebDriver driver,By listOfSearchResultLinks, By nameOfLot, By counter, By currentBidPrice,String expectedtitle) {
		
		String actualtitle =driver.getTitle();
		System.out.println(actualtitle);
		String getexpectedtitle=expectedtitle;
		
		//verifying search title
		if(getexpectedtitle.equals(actualtitle)) {
			System.out.println("Titles are  matching");
		}
		else {
			System.out.println("Titles are not matching");
		}
		
		
		System.out.println("executed successfully");
		
		//collecting all the lists of lots displayed 
		List<WebElement> list= driver.findElements(listOfSearchResultLinks);
		
		//waiting till all the lists on the page are loaded
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOfAllElements(list));
		
		//Clicking the second lot in the search page
		WebElement lot2=list.get(1);
		lot2.click();
		
		
		String name = driver.findElement(nameOfLot).getText();
		String favouriteCounter= driver.findElement(counter).getText();
 	    String currentbid = driver.findElement(currentBidPrice).getText();
		
 	    //displaying name,favourtieCounter,currentBid on console
		System.out.println("THE LOT NAME :"+" "+name);
		System.out.println("THE FavouriteCounter count :"+" "+favouriteCounter);
		System.out.println("THE LOT's Current Bid :"+" "+currentbid);
		
		
		
		
	}
	
	
}
