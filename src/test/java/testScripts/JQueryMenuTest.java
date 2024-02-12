package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JQueryMenuTest {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://the-internet.herokuapp.com/jqueryui/menu#");
			driver.findElement(By.xpath("//a[text() ='Enabled']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text() ='Downloads']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text() ='PDF']")).click();
			
	  
		
	  
	 
  }
}

