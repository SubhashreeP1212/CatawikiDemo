package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import Action.WebActionSearch;
import Utilities.ConfigReader;

public class SearchPage {
	
	RemoteWebDriver driver;
	
	//initializing the driver object
	public SearchPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	//page class for all locators
	By cookieText=By.xpath("//div[@class='u-margin-b u-margin-t-small']");
	By agreeButton=By.cssSelector("#cookie_bar_agree_button");
	By searchField= By.xpath("//input[@id='textField11']");
	By magnifierButton=By.xpath("(//div[@class='c-text-field__prefix u-color-dark-gray u-cursor-pointer']/button)[1]");
	By listOfSearchResultLinks=By.xpath("//a[@class='c-extended-lot-card__overlay']");
	By nameOfLot=By.tagName("h1");
	By counter=By.xpath("//span[@class='FoB7Rgal7smxcF0TQEc9 yjcq3OerDzMBCKFPpI0T']");
	By currentBidPrice=By.xpath("//div[@class='be-lot-bid-status-section__bid-amount u-typography-h2']");
	
	//initializing the WebAction class
	public void searchAction() {
		ConfigReader config = new ConfigReader();
		String url=config.geturl();//sending url from propertyfile
		String searchText =config.getsearchText(); //sending searchText from propertyfile
		String expectedTitle=config.getexpectedtitle();// sending expectedTitle from propertyfile
		
		WebActionSearch.openUrl(driver, url);
		WebActionSearch.search(driver, cookieText, agreeButton, searchField, magnifierButton,searchText);
		WebActionSearch.searchResult(driver, listOfSearchResultLinks, nameOfLot, counter, currentBidPrice,expectedTitle);
		
	}
	
	
	
	
	
	

}
