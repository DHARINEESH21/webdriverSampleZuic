package testScripts;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HideImageTest {
  @Test
  public void imageHide() {
	  ChromeOptions options = new ChromeOptions();
	  
	  //this will disable the image loading - method 1
	  options.addArguments("--blink-settings=imagesEnabled=false");
	  
	   
	  //or alternately we can set direct preference - method 2
	Map<String,Object> prefs=new HashMap<String,Object>();
		  prefs.put("profile.managed_default_contect_settings.images", 2);
		  options.setExperimentalOption("prefs", prefs);
		  WebDriver driver = new ChromeDriver(options);	
		  driver.get("https://demo.opencart.com/");
  }
}
