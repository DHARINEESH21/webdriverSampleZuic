package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InputFieldsTest {
  @Test
  public void validInputFields() {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");
		
		//Single input fields
		WebElement messBox = driver.findElement(By.id("user-message")); 
		messBox.sendKeys("Holiday!");
		driver.findElement(By.xpath("//form[@id='get-input']//button")).click();
		
		//Two input fields
		WebElement valueA = driver.findElement(By.id("value1")); 
		valueA.sendKeys("3");
		WebElement valueB = driver.findElement(By.id("value2")); 
		valueB.sendKeys("4");
		driver.findElement(By.xpath("//form[@id='gettotal']//button")).click();
  }
}
