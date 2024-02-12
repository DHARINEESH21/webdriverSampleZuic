package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class IFrameCherTest {
  @Test
  public void iFrameTest() {
	  
	  WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//From main page to frame1
		driver.switchTo().frame("frame1");
		
		WebElement inpBox = driver.findElement(By.xpath("//input[@type='text']"));
		
		inpBox.sendKeys("Hello Welcome");
		
		//from frme1 to frame3
		driver.switchTo().frame("frame3");
		WebElement typeBox = driver.findElement(By.cssSelector("input#a"));
		typeBox.click();
		driver.switchTo().defaultContent();
	//	driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		Select sinSel = new Select (driver.findElement(By.cssSelector("select#animals")));
		
		sinSel.selectByVisibleText("Baby Cat");
		List<WebElement> items=sinSel.getAllSelectedOptions();
		  for(WebElement list:items)
		  {
			  System.out.println(list.getText());
		  }
	 
	
		
		
	  
  }
}
