package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FileDownloadTest {
  @Test
  public void f() throws InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	  Map<String, Object> prefs = new HashMap<String, Object>(); //it is a key value pair so storing in maps
	  prefs.put("download.prompt_for_download", false); //to just download for true, false- download in folder
	  options.setExperimentalOption("prefs", prefs);
	  WebDriver driver = new ChromeDriver(options);		
			driver.manage().window().maximize();
			driver.get("https://chromedriver.storage.googleapis.com/index.html?path=79.0.3945.36/");
			Thread.sleep(1000);
			WebElement btnDownload = driver.findElement(By.xpath(".//a[text()='chromedriver_win32.zip']"));
			btnDownload.click();
			Thread.sleep(1000);
	  
	  
	  
  }
}
