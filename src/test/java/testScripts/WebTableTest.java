package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTest {
  @Test
  public void searchEmpDetails() {
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		
		
//		List<WebElement> items = driver.findElements(
//				By.xpath("//td[text()='B. Wagner']//following-sibling::td"));
//		System.out.println("Number of items..."+items.size());
//		for(WebElement elem:items) {
//			System.out.println(elem.getText());
//			
//		}
		
		
		//to get the salary of an employee
		String strSalary = driver.findElement(
				By.xpath("//td[text()='B. Wagner']//following-sibling::td[5]")).getText();
		System.out.println("Salary..."+strSalary);
		
		//to get the employee names working in Sanfranciso
		List<WebElement> countOfEmp = driver.findElements(
				By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
		System.out.println("Number of items..."+countOfEmp.size());
		for(WebElement elem:countOfEmp) {
			System.out.println(elem.getText());
			
		}
		
			
		}
  
  
		
		
  }

