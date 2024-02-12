package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PracticeForm {
  @Test
  public void FormForPractice() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		//firstName
		WebElement firstNameBox= driver.findElement(By.cssSelector("input#firstName"));
		firstNameBox.sendKeys("Dharineesh");
		
		//lastName
		WebElement lastNameBox= driver.findElement(By.cssSelector("input#lastName"));
		lastNameBox.sendKeys("S");
		
		
		//Email
		WebElement emailIdBox= driver.findElement(By.cssSelector("input#userEmail"));
		emailIdBox.sendKeys("dharineesh@gmail.com");
		
		//Gender
		////label[@class='custom-control-label'][contains(text(), 'Male')]
		driver.findElement(By.xpath("//label[@class='custom-control-label'][contains(text(), 'Male')]")).click();
		
	
		//number
		WebElement numberBox= driver.findElement(By.cssSelector("input#userNumber"));
		numberBox.sendKeys("4567778880");
		Thread.sleep(1000);
		
		//dob
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		  js.executeScript("return document.getElementById('dateOfBirthInput').value='05 Mar 2024'");
		  
		//subject
	//	WebElement subjectBox= driver.findElement(By.xpath("//input[@id='subjectsInput']"));
	//	subjectBox.sendKeys("Ma");
	//	mulSel.selectByValue("Floride");
	//	driver.findElement(By.id("react-select-2-option-0")).click();
 	    
 	    //react-select-2-option-0
		
		
		// hidden
		
 	
 	   //hobbies
 	////label[@class='custom-control-label'][contains(text(), 'Sports')]
 //	WebElement hobbieBox = driver.findElement(By.xpath("//label[text()='Music']"));
 //	hobbieBox.click();
//	if(!hobbieBox.isSelected()) {
	//	hobbieBox.click();
	//}
		
		//picture
		//input#uploadPicture
		WebElement pictureBox= driver.findElement(By.cssSelector("input#uploadPicture"));
		String strPath = System.getProperty("user.dir")
				+"//image1.png";
		pictureBox.sendKeys(strPath);
//		
		//currentAddress
//		WebElement addressBox= driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
//		addressBox.sendKeys("44,djg");
		
		
		//state & city
		
//		Select singSel = new Select(driver.findElement(By.xpath("//*[@id=\"state\"]/div[1]/div[2]/div")));
//		singSel.selectByValue("NCR");
//		Thread.sleep(1000);
//		
//		
	//	Select singSelect = new Select(driver.findElement(By.cssSelector("div#city ")));
	//	singSelect.selectByValue("NCR");
		
		
		//String elemPath = "//ul[@id='select2-country-results']//li[
		
		
		//dob
//		public String selectDate(String month, String year, String date)
	//	div.react-datepicker__month div[class$='"+date+"']
		
		
//		
//		
//		 WebElement sub = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
//		  sub.sendKeys("hi");
//		 driver.findElement(By.id("react-select-2-option-0")).click();
		
  }
}
