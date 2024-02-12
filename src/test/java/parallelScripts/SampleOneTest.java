package parallelScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleOneTest {
	WebDriver driver;
	  @Test
	  public void testOne() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test1 in SampleOne..."+id);
	  }
	  
	  @Test
	  public void testTwo() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test2 in SampleOne..."+id);
	  }
	  
	  @Test
	  public void testThree() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test3 in SampleOne..."+id);
	  }
	  
	  @Test
	  public void testFour() {
		  driver = new ChromeDriver();
		  long id = Thread.currentThread().getId();
		  System.out.println("Test4 in SampleOne..."+id);
	  }
}
