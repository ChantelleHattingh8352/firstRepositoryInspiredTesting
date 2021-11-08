package loans;

import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan1 {
	
	
	@BeforeTest
	public void cleanDB() { 
		System.out.println("Clean the database before we start"); 
		 
	}

	@Parameters({"URL"})
	@Test (groups= {"Smoke"})
	public void firstTest(String URL) { 
		System.out.println("firstTest"); 
		System.out.println("This is the URL parameter " + URL);
	}
	
	@Test
	public void secondTest() { 
		System.out.println("secondTest print out ");
	}
	
	@Test (groups= {"Smoke"})
	public void fraudTest() { 
		System.out.println("first fraud test"); 
		
	}
	
	@Test
	public void report() { 
		System.out.println("second fraud test"); 
		String expected = "Passed test"; 
		String actual = "example"; 
		Reporter.log(expected);
	}
	
	@AfterTest
	public void cleanDBAfter() { 
		System.out.println("clean the database after the test suite"); 
	}
}
