package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Challenge2_5 {

	ChromeDriver driver = new ChromeDriver();

	@Test(priority = 1)
	public void bannerSlider() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/sravani/Downloads/ChromeDriver76/chromedriver");
		driver.get("https://www.shoppersstop.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement target = driver.findElement(By.xpath("//a[@title='MEN']"));
		actions.moveToElement(target).perform();
		Thread.sleep(2000);
		/*
		 * WebElement target1 = driver.findElement(By.xpath(""));
		 * actions.moveToElement(target1).perform();
		 * //(//a[contains(text(),"Men's Fragrance")])[3]
		 */
		}

	  @Test(priority = 2) public void allStores() throws InterruptedException {
	  
	  driver.findElement(By.xpath("(//a[contains(text(),\"All Stores\")])[1]")). click();
	  Thread.sleep(2000); 
	  Select dropdown = new Select(driver.findElement(By.id("city-name"))); 
	  List<WebElement> options = dropdown.getOptions();
	  int count = options.size(); 
	  for(int i=0;i<count;i++) {
	  System.out.println( options.get(i).getText());
	  }
	  System.out.println("Printing the page title" +driver.getTitle());
	  }
	 

}