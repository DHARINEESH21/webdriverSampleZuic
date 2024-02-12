package testScripts;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DBTesting {
	
	//Connection object
	static Connection con = null;
	
	//statement object
	private static Statement stmt;
	
	//database url sqlite
	public static String DB_URL = "jdbc:sqlite:C://Users//dharineesh.selvarasu//testTrgDB.db";
	
	//database username
	public static String DB_USER = "";
	
	//data base password
	public static String DB_PASSWORD = "";
	  
	  @BeforeTest
	  public void setUp() throws Exception{
		  try {
			  Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			  //stmt object to send the sql stmt to the database
			  stmt = con.createStatement();
		  }catch (Exception e) {
			  e.printStackTrace();
		  }
	  }
	
	  @Test                                                          
	  public void test()
	  {
		  try {
			  String query = "select * from Students";
			  ResultSet res = stmt.executeQuery(query);
			  while(res.next())
			  {
				  System.out.println(res.getString(1));
				  System.out.println(" " +res.getString(2));
				  System.out.println("  "+res.getString(3));
				  System.out.println(" "+res.getString(4));
				  System.out.println(" "+res.getString(5));
			  }
			  
			  String query1 = "Select name from Students Where Students.id NOT IN (Select studentID FROM Student_course)";
			  ResultSet res1 = stmt.executeQuery(query1);
			  String studName = " ";
			  while(res1.next())
			  {
				  studName = res1.getString("name");
			  }
			  System.out.println("Student name: " +studName);
			  Assert.assertEquals(studName,"Rattan");
			  
			  }
			  catch(Exception e)
			  {
				  e.printStackTrace();
			  }
			  
		  }
			  
	  
	  
	  
	  @AfterTest
	  public void tearDown() throws Exception
	  {
		  if(con!=null)
		  {
			  con.close();
		  }
	  }
}