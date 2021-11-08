package loans;

import org.testng.annotations.Test;

public class PersonalLoans1 {

	@Test
	public void fifthTest() { 
		System.out.println("fifthTest"); 
	}
	
	@Test (groups= {"Smoke"})
	public void sixthTest() { 
		System.out.println("sixthTest"); 
	}
}
