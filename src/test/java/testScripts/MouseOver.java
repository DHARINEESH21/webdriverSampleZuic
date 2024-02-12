package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOver {
  @Test
  public void mouseOverAction() {
	  WebDriver driver = new ChromeDriver();
	  Actions actions = new Actions(driver);
			driver.manage().window().maximize();
			driver.get("https://demo.opencart.com/");
			WebElement menu = driver.findElement(By.cssSelector("ul.nav.navbar-nav li.dropdown:nth-child(3)"));
			actions.moveToElement(menu).perform();
  }
}
