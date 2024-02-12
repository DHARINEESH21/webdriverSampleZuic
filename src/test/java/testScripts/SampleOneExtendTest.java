package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;

import commonUtils.Utility;

public class SampleOneExtendTest {
WebDriver driver;//declaration
ExtentReports extentReports;
ExtentSparkReporter spark;
ExtentTest extentTest;
	

	@BeforeTest
	public void setupExtend() {
		extentReports = new ExtentReports(); //initialization
		spark = new ExtentSparkReporter("test-output/SparkReport.html") 
				.viewConfigurer()
				.viewOrder() 
				.as(new ViewName[]{
			ViewName.DASHBOARD,
			ViewName.TEST,
			ViewName.AUTHOR,
			ViewName.DEVICE,
			ViewName.LOG
			
		}).apply();
		extentReports.attachReporter(spark); //attaching both
		
		
		
	}
	
	
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();//initialization
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	

	  
		  @Test(retryAnalyzer = RetryAnalyzer.class)
	  public void searchSeleniumTest() throws InterruptedException{
            extentTest = extentReports.createTest("Selenium search test");
			driver.navigate().to("https://www.google.com/");
			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
			srcBox.sendKeys("Selenium Tutorial");	// typing the words in search box
			Thread.sleep(1000);
			srcBox.submit();
			Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Google");
	  }
	  
	  
	  
		 @Test
	  public void searchCucumberTest() throws InterruptedException{
			 extentTest = extentReports.createTest("Cucumber search test");
			driver.navigate().to("https://www.google.com/");
			WebElement srcBox = driver.findElement(By.id("APjFqb"));	//to locate the element	
			srcBox.sendKeys("Cucumber Tutorial");	// typing the words in search box
			srcBox.submit();
			Assert.assertEquals(driver.getTitle(), "Cucumber Tutorial - Google Search");
	  }
	  
	  
	  @AfterMethod
	 
	  
	  
	  public void closeMethod(ITestResult result) {
		  
		  extentTest.assignAuthor("AutomationTester1")
		  .assignCategory("Regression")
		  .assignDevice(System.getProperty("os.name"))
		  .assignDevice(System.getProperty("os.version"));
		  
		  if(ITestResult.FAILURE == result.getStatus()) {
			  extentTest.log(Status.FAIL, result.getThrowable().getMessage()); //sending the message to the html file
			  String strPath = Utility.getScreenshotPath(driver); //
					  extentTest.fail(MediaEntityBuilder.createScreenCaptureFromPath(strPath).build()); //send to the html file
		  }
		  else if (ITestResult.SKIP == result.getStatus())
		  {
			  extentTest.log(Status.SKIP, result.getThrowable().getMessage());
			  
		  }
		  driver.close();
		  
	  }
	  
	  @AfterTest
	  public void finishExtent() {
		  extentReports.flush();
	  }
	  
	  
}

