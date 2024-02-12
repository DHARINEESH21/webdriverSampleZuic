package testScripts;
 
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
 
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
 
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
 
public class DemoBlazeTest {
	
	   WebDriver driver;
	   Properties prop;
	   @Parameters("browser")
	   @BeforeClass
	   public void setup() throws IOException
	   {
		   String path = System.getProperty("user.dir")+"//src//test//resources//configFiles//demofig.properties";
		   FileInputStream fin = new FileInputStream(path);
		   prop = new Properties();
		   prop.load(fin);
		   String strBrowser = prop.getProperty("browser");
			System.out.println("Browser name:.."+strBrowser);
			if(strBrowser.equalsIgnoreCase("chrome"))
			{
				driver = new ChromeDriver();
			}
			else if(strBrowser.equalsIgnoreCase("edge"))
		
				{
					driver = new EdgeDriver();
					
				}
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
			}
		   
		   
	   
	   
	   
	   @Test
	   public void validLogin() throws InterruptedException {
		    
		    driver.get(prop.getProperty("url"));
		    //Thread.sleep(1000);
		    
		    
		    driver.findElement(By.id("login2")).click();
		 //   Thread.sleep(1000);
		//    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	        driver.findElement(By.cssSelector("input#loginusername")).sendKeys(prop.getProperty("username"));
	        Thread.sleep(1000);
	        driver.findElement(By.cssSelector("input#loginpassword")).sendKeys(prop.getProperty("password"));
	        Thread.sleep(1000);
			driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
 
	   }
	   
	   @Test(dependsOnMethods = "validLogin")
	   public void searchItem() throws InterruptedException
	   {
		   String item1 = prop.getProperty("item1");
		  
		   driver.navigate().refresh();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	        
	        WebElement itemLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + item1 + "')]")));
	        itemLink.click();
	        Thread.sleep(1000);
	        driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
	        Thread.sleep(1000);
	        Alert alert = driver.switchTo().alert();
	  	    Assert.assertEquals(alert.getText(), "Product added");
	  	    alert.accept();
	  	    
//	  	  String item2 = prop.getProperty("item2");
//	  	    
//	  	    driver.switchTo().defaultContent();
//	        driver.navigate().back();
//	        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(11));
//        //WebElement item2Link = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + item2 + "')]")));
//	        WebElement item2Link = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'" + item2 + "')]")));
//
//	        item2Link.click();
//            driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
// 
//		   
	   }
	   
	   
	   
	   
	   
 
			
			
			
	   
}
