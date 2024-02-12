package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PopupWinTest {
  @Test
  public void f() {
	  
	  WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://stqatools.com/demo/Windows.php");
		
		String parentWin = driver.getWindowHandle();   //handling the parent page
		System.out.println("Parent window Handle :" + parentWin);
		driver.findElement(By.xpath("//button[contains(text(), 'new Tab')]")).click();
		
		Set<String> tabs = driver.getWindowHandles();   //storing the pages as a set of unique strings
		System.out.println("Number of windows :" + tabs.size());
		for(String childWin:tabs) {
			System.out.println(childWin);
			if(!childWin.equalsIgnoreCase(parentWin)) {
				driver.switchTo().window(childWin); //control is switch to child window
				driver.findElement(By.xpath("//a[contains(text(), 'Java')]")).click();
				
				
				driver.close();
				driver.switchTo().window(parentWin);//switching the access to parent window
				driver.findElement(By.xpath("//a[contains(text(), 'new Window')]")).click();
				
			
				// to handle windows in new browser in new browser window
				Set<String> wins=driver.getWindowHandles();
				System.out.println("Number of windows:"+wins.size());
				for(String childWins:wins) {
					System.out.println(childWins);
					if(!childWins.equalsIgnoreCase(parentWin)) {
						driver.switchTo().window(childWins);
					}
				}
				//driver.close();
				//driver.close();
				driver.quit();
			}
		}
  }
}
