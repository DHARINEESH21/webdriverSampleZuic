package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchSenerios {
  @Test(priority=2)
  public void searchJavaTest() {
	  WebDriver driver = new ChromeDriver();	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
		srcBox.sendKeys("Java Tutorial");	// typing the words in search box
		Assert.assertEquals(driver.getTitle(), "Google");
  }
  @Test(priority=3)
  public void searchSeleniumTest() {
	  WebDriver driver = new ChromeDriver();	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
		srcBox.sendKeys("Selenium Tutorial");	// typing the words in search box
		Assert.assertEquals(driver.getTitle(), "Google");
  }
  @Test(priority=1)
  public void searchCucumberTest() {
	  WebDriver driver = new ChromeDriver();	
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
		srcBox.sendKeys("Cucumber Tutorial");	// typing the words in search box
		Assert.assertEquals(driver.getTitle(), "Google");
  }
} 
