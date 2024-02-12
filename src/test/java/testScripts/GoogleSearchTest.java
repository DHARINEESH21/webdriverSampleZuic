package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GoogleSearchTest {
  @Test
  public void searchJavaTest() throws InterruptedException {
	//	ChromeOptions options = new ChromeOptions();
	//	options.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver();	//launch Chrome browser	
		
	//	WebDriver driver = new EdgeDriver();	
	//	driver.get("https://www.google.com/");
		
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
		srcBox.sendKeys("Java Tutorial");	// typing the words in search box	
		
		Thread.sleep(1000);
		List<WebElement> items = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]//li//descendant::div[@class=='InnVSe'])"));
		System.out.println("No. of items.."+items.size());
		for(WebElement item:items) {
			System.out.println(item.getText());
			if(item.getText().equalsIgnoreCase("java tutorial pdf")) {
				item.click();
				break;
			}
		}
		
//		srcBox.sendKeys(Keys.ENTER);//Press Enter key
//		
//		System.out.println("Before clicking back.. Page Title:.." + driver.getTitle());
//		driver.navigate().back();
//		
//		System.out.println("After clicking .. Page Title:.." + driver.getTitle());
//		driver.navigate().forward();
//		
//		System.out.println("URL..."+ driver.getCurrentUrl());
//		
  }
}
