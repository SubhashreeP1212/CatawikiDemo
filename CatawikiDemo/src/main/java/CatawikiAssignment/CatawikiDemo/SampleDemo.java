/*
 * package CatawikiAssignment.CatawikiDemo;
 * 
 * import java.time.Duration; import java.util.List;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.chrome.ChromeDriver; import
 * org.openqa.selenium.firefox.FirefoxDriver; import
 * org.openqa.selenium.remote.RemoteWebDriver; import
 * org.openqa.selenium.support.ui.ExpectedConditions; import
 * org.openqa.selenium.support.ui.WebDriverWait;
 * 
 * public class SampleDemo {
 * 
 * public static void main(String[] args) throws InterruptedException {
 * 
 * RemoteWebDriver driver= new ChromeDriver();
 * 
 * driver.manage().window().maximize();
 * 
 * 
 * 
 * 
 * driver.get("https://www.catawiki.com/en/"); Thread.sleep(3000);
 * 
 * String text=
 * driver.findElement(By.xpath("//div[@class='u-margin-b u-margin-t-small']")).
 * getText();
 * 
 * try { if (text.contains("Cookie Policy")) {
 * driver.findElement(By.cssSelector("#cookie_bar_agree_button")).click();
 * 
 * }else { System.out.println("cookies have been accepted"); } }catch(Exception
 * e) { System.out.println("cookies hasnot been accepted"); }
 * 
 * driver.findElement(By.xpath("//input[@id='textField11']")).sendKeys("train");
 * driver.findElement(By.
 * xpath("(//div[@class='c-text-field__prefix u-color-dark-gray u-cursor-pointer']/button)[1]"
 * )).click();
 * driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60)); String
 * actualtitle =driver.getTitle(); System.out.println(actualtitle); String
 * expectedtitle="Find train at Catawiki's auctions - Catawiki";
 * 
 * //verifying search title if(expectedtitle.equals(actualtitle)) {
 * System.out.println("Titles are  matching"); } else {
 * System.out.println("Titles are not matching"); }
 * 
 * 
 * 
 * System.out.println("executed successfully");
 * 
 * 
 * 
 * 
 * List<WebElement> list=
 * driver.findElements(By.xpath("//a[@class='c-extended-lot-card__overlay']"));
 * 
 * for(WebElement lot:list) {
 * 
 * System.out.println(lot.getText()+" "+lot.getAttribute("href")); }
 * 
 * System.out.println("for loop executed"); WebDriverWait wait = new
 * WebDriverWait(driver,Duration.ofSeconds(60));
 * wait.until(ExpectedConditions.visibilityOfAllElements(list));
 * 
 * WebElement lot2=list.get(1); lot2.click();
 * 
 * String name = driver.findElement(By.tagName("h1")).getText(); String
 * favouriteCounter= driver.findElement(By.
 * xpath("//span[@class='FoB7Rgal7smxcF0TQEc9 yjcq3OerDzMBCKFPpI0T']")).getText(
 * ); String currentbid = driver.findElement(By.
 * xpath("//div[@class='be-lot-bid-status-section__bid-amount u-typography-h2']"
 * )).getText();
 * 
 * System.out.println("THE LOT NAME :"+" "+name);
 * System.out.println("THE FavouriteCounter count :"+" "+favouriteCounter);
 * System.out.println("THE LOT's Current Bid :"+" "+currentbid);
 * 
 * 
 * driver.close();
 * 
 * 
 * 
 * 
 * // // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */