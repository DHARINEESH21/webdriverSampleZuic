package groupScripts;

import org.testng.annotations.Test;

public class SampleThreeTest {
	  @Test(groups = "feature3")
	  public void testOne() {
		  System.out.println("TestOne in SampleThree");
	  }
	  
	  @Test
	  public void testTwo() {
		  System.out.println("TestTwo in SampleThree");
	  }
	  
	  @Test(groups = "feature2")
	  public void testThree() {
		  System.out.println("TestThree in SampleThree");
	  }
	  
	  @Test
	  public void testFour() {
		  System.out.println("TestFour in SampleThree");
	  }
}
