package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleIframeTest {
  @Test
  public void IframeTest() {

	  WebDriver driver = new ChromeDriver();	
		  
		  driver.manage().window().maximize();
		  driver.get("https://the-internet.herokuapp.com/iframe");
		  
		  driver.switchTo().frame("mce_0_ifr");
		  driver.findElement(By.tagName("p")).sendKeys("Helloo!!");
		  
		  driver.switchTo().defaultContent();
		  driver.findElement(By.linkText("POWERED BY TINY")).click();
		  
		  
	
  }
}
