package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JsExecTest {
  @Test
  public void executingJsTestCommand() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
//	  driver.get("https://demo.opencart.com/");
//	  JavascriptExecutor js = (JavascriptExecutor )driver;
//	  
//	  String strTitle = (String)js.executeScript("return document.title");
//	  System.out.println(strTitle);
//	  WebElement searchBox = (WebElement)js.executeScript("return document.getElementsByName('search')[0]");
//	  searchBox.sendKeys("Phone");
//	  driver.findElement(By.cssSelector("button.btn.btn-light.btn-lg")).click();
//	  js.executeScript("history.go(-1)");
//	  js.executeScript("history.scrollBy(10, 700)");
//	  js.executeScript("history.scrollBy(10, document,body.scrollHeight)");
//	  
	  driver.get("https://demoqa.com/automation-practice-form");
	  JavascriptExecutor js = (JavascriptExecutor )driver;
	//  Thread.sleep(1000);
	 js.executeScript("return document.getElementsByName('dateOfBirthInput').values='01 Mar 2024'");
	  //document.getElementById('dateOfBirthInput').value='01 Mar 2024'
	  
  }
}
