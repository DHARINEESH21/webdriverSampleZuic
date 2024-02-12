package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleOneTest {
	

	WebDriver driver;//declaration
	
	@BeforeMethod
	@BeforeTest
	
	public void setup() {
		driver = new ChromeDriver();//initialization
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
//	  @Test(dependsOnMethods = "searchSeleniumTest")
//	  public void searchJavaTest() throws InterruptedException{
//		 
//			driver.navigate().to("https://www.google.com/");
//			SoftAssert softAssert = new SoftAssert();
//			softAssert.assertEquals(driver.getTitle(), "Google");
//			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
//			srcBox.sendKeys("Java Tutorial");	// typing the words in search box
//			srcBox.submit();
//			softAssert.assertEquals(driver.getTitle(), "Google");
//			softAssert.assertAll();
//	  }
	//  @Test(enabled=false)
//	  public void searchSeleniumTest() throws InterruptedException{
//
//			driver.navigate().to("https://www.google.com/");
//			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
//			srcBox.sendKeys("Selenium Tutorial");	// typing the words in search box
//			srcBox.submit();
//			Assert.assertEquals(driver.getTitle(), "Google");
//	  }
	//  @Test(priority=1)
//	  public void searchCucumberTest() throws InterruptedException{
//		
//			driver.navigate().to("https://www.google.com/");
//			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
//			srcBox.sendKeys("Cucumber Tutorial");	// typing the words in search box
//			srcBox.submit();
//			Assert.assertEquals(driver.getTitle(), "Google");
//	  }
//	  
	  
	  
		  @Test
	  public void searchSeleniumTest() throws InterruptedException{

			driver.navigate().to("https://www.google.com/");
			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
			srcBox.sendKeys("Selenium Tutorial");	// typing the words in search box
			srcBox.submit();
			Assert.assertEquals(driver.getTitle(), "Google page");
	  }
	  
	  
	  
		 @Test(alwaysRun=true, dependsOnMethods = "searchSeleniumTest")
	  public void searchCucumberTest() throws InterruptedException{
		
			driver.navigate().to("https://www.google.com/");
			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
			srcBox.sendKeys("Cucumber Tutorial");	// typing the words in search box
			srcBox.submit();
			Assert.assertEquals(driver.getTitle(), "Google");
	  }
	  
	  
	  @AfterMethod
	  @AfterTest
	  
	  
	  public void closeMethod() {
		  driver.close();
		  
	  }
	  
}
