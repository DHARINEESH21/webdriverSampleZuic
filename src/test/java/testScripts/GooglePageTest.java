package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class GooglePageTest {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver(options);	//launch Chrome browser	
		
	//	WebDriver driver = new EdgeDriver();	
		driver.get("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
		srcBox.sendKeys("Java Tutorial");	// typing the words in search box	
		srcBox.sendKeys(Keys.ENTER);//Press Enter key
	

	}

}
