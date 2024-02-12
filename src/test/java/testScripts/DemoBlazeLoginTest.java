package testScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoBlazeLoginTest {
	  WebDriver driver;
	   Properties prop;
	   
	 
	   @BeforeMethod
	   public void setup() throws IOException
	   {
		   String path = System.getProperty("user.dir")+
				   "//src//test//resources//configFiles//demofig.properties";
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
	   public void blankPassword() throws InterruptedException {
		   
		   driver.get(prop.getProperty("url"));
		   
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 
			  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
			   login.click();
			   
			 WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
			 usrname.sendKeys("Dharineesh");
			 
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
		 wait.until(ExpectedConditions.alertIsPresent());
			 Alert alert=driver.switchTo().alert();
			 
			 Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
			 alert.accept();
 

	   }
	   
	   @Test
	   public void blankUserName() throws InterruptedException {
		   driver.get(prop.getProperty("url"));
		   
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 
			  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
			   login.click();
			   
			 WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginpassword']")));
			 
			 password.sendKeys("123456");
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
			 
		    wait.until(ExpectedConditions.alertIsPresent());
			 Alert alert=driver.switchTo().alert();
			 Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
			 alert.accept();
 

	   }
	   
	   @Test
	   public void usernameInValid() throws InterruptedException {
		   driver.get(prop.getProperty("url"));
		   
		   WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		   WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
		   login.click();
		   
			 WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
			 usrname.sendKeys("Dharinees");
			 
			 WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
			 password.sendKeys("123456");
			 
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
			 
		    wait.until(ExpectedConditions.alertIsPresent());
			 Alert alert=driver.switchTo().alert();
			 Assert.assertEquals(alert.getText(), "User does not exist.");
			 alert.accept();
	 
 

	   }
	   
	   @Test
	   public void passwordInValid() throws InterruptedException {
		   
		   driver.get(prop.getProperty("url"));
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
			   login.click();
			   
			 WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
			 usrname.sendKeys("Dharineesh");
			 
			 WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
			 password.sendKeys("1234");
			 
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
			 
		 wait.until(ExpectedConditions.alertIsPresent());
			 Alert alert=driver.switchTo().alert();
			 Assert.assertEquals(alert.getText(), "Wrong password.");
			 alert.accept();
 

	   }
	   
	   
		@Test
		 public void blankUsrname_blankpassword() throws InterruptedException
		 {
			 driver.get(prop.getProperty("url"));
	 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
			   login.click();
			   
			 WebElement usrname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
			 usrname.sendKeys("");
			 
			 WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']")); 
			 password.sendKeys("");
			 
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
			 
		    wait.until(ExpectedConditions.alertIsPresent());
			 Alert alert=driver.switchTo().alert();
			 Assert.assertEquals(alert.getText(), "Please fill out Username and Password.");
			 alert.accept();
			 }
	 
		
		@Test
		 public void bothValidCredential() throws InterruptedException
		 {
			 driver.get(prop.getProperty("url"));
	 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 
			  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
			   login.click();
			   
			 WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
			 username.sendKeys("Dhairneesh");
			 
			 WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
			 password.sendKeys("123456");
			 
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
			 
	
			 }
		
		
		@Test
		 public void bothInvalidCredential() throws InterruptedException
		 {
			 driver.get(prop.getProperty("url"));
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 
			  WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("login2")));
			   login.click();
			   
			 WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']")));
			 username.sendKeys("Dhairnees");
			 
			 WebElement password=driver.findElement(By.xpath("//input[@id='loginpassword']"));
			 password.sendKeys("12345");
			 
			 WebElement loginBtn=driver.findElement(By.xpath("//button[text()='Log in']"));
			 loginBtn.click();
			 
			   wait.until(ExpectedConditions.alertIsPresent());
				 Alert alert=driver.switchTo().alert();
				 Assert.assertEquals(alert.getText(), "User does not exist.");
				 alert.accept();
			 
	
			 }
		
		
		 
		 @AfterMethod
		 public void terminate()
		 {
			 driver.close();
		 }
	 
	 
}




