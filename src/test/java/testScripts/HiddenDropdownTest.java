package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenDropdownTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://automationbookstore.dev/");
  }
}
