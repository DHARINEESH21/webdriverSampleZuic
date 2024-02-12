package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDev {
  @Test
  public void cssSelectorsTest() {
	  WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://www.selenium.dev/");
			driver.findElement(By.cssSelector("li*="));
  }
}
