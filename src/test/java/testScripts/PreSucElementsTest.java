package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PreSucElementsTest {
  @Test
  public void verifyPreSucElements() {
	  
	        WebDriver driver = new ChromeDriver();		
			driver.manage().window().maximize();
			driver.get("https://www.lambdatest.com/blog/");
			List<WebElement> item1 = driver.findElements(
				By.xpath("//ul[@id='menu-side-menu']//li[.//a[text()='Playwright Testing']]/preceding-sibling::li"));
			 System.out.println("preceeding list to Playwright testing");
			 for(WebElement list:item1)
			 {
			 System.out.println(list.getText());

			 }
			 List<WebElement> item2 = driver.findElements(
						By.xpath("//ul[@id='menu-side-menu']//li[.//a[text()='Playwright Testing']]//following-sibling::li"));
					 System.out.println("\nsuccceeding list to Playwright testing");
					 for(WebElement list:item2)
					 {
					 System.out.println(list.getText());
					 }

  }
}