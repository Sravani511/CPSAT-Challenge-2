package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Challenge2_6 {
	ChromeDriver driver = new ChromeDriver();
	@Test
public void liveMarket() throws InterruptedException
{
		System.setProperty("webdriver.chrome.driver", "/home/sravani/Downloads/ChromeDriver76/chromedriver");
		driver.get("https://www.nseindia.com/products.htm");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[contains(text(),'Live Market')]"));
		action.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[@href='/live_market/dynaContent/live_analysis/top_gainers_losers.htm']")).click();
		
			for(int i=1;i<=11;i++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@id='topGainers']/tbody/tr[1]//th[" + i +"]")).getText());
				
			}
			
			System.out.println("second loop");
			
			for(int j=2;j<=11;j++)
			{
				System.out.println(driver.findElement(By.xpath("//table[@id='topGainers']//tbody//tr[" + j +"]//td")).getText());
			}
		}
		 
			//table[@id='topGainers']/tbody/tr[1]//th
		// String firstElement = driver.findElement(By.xpath("//table/tbody/tr[2]/td[1]")).getText();
		 //table/tbody/tr[11]
		/*
		 * for(int i=2; i<=6; i++){ 
		 * for(int j=1; j<=4; j++)
		 *  {
		 *    System.out.print(driver.findElement(By.xpath("//table[@id='BooksAuthorsTable']/tbody/tr[" + i +"]/td[" + j +
		 * "]")).getText() + "\t"); } System.out.println(""); }
		 */
		 ////table[@id='topGainers']//tbody//tr[2]//td
			 
		 }
		


