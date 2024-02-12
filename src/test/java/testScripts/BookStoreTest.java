package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookStoreTest {
  @Test
  public void verifyTestBox() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://automationbookstore.dev/");
		WebElement searchBox = driver.findElement(By.id("searchBar"));
		searchBox.click();
		searchBox.sendKeys("hello");
		Thread.sleep(1000);
		WebElement closeBar = driver.findElement(By.xpath("//a[contains(text(),'Clear text')]"));
		if(closeBar.isDisplayed())
		{
			closeBar.click();
			System.out.println("Text Cleared");
		}
		else {
			System.out.println("Text clear icon is hidden");
		}
		
		
		
		
		
  }
}
