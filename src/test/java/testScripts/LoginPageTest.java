package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest {
  @Test
  public void validLogin() {
	  
		WebDriver driver = new ChromeDriver();	//launch Chrome browser		
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		WebElement username = driver.findElement(By.id("username"));
		username.click();
		username.sendKeys("tomsmith");
	//	WebElement password = driver.findElement(By.id("password"));
		WebElement password = driver.findElement(By.cssSelector("#password"));

		password.click();
		password.sendKeys("SuperSecretPassword!");
		WebElement loginButton = driver.findElement(By.className("radius"));
		loginButton.click();
		
		//css selector
		driver.findElement(By.cssSelector(".radius")).click();
		//compound class
		driver.findElement(By.cssSelector(".fa.fa-2x.fa-sign-in"));
	//	driver.findElement(By.partialLinkText("Elemental Selenium")).click();
		driver.findElement(By.partialLinkText("Elemental")).click();
		
		
		
		
  }
}
