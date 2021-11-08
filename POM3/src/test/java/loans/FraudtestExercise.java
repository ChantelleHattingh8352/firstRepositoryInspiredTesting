package loans;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FraudtestExercise {
	
	@Test(dataProvider="getData")
	public void HomeLoan1FraudTest(String username, String lastname) { 
		System.out.println("Home loan1 Fraud Test"); 
		System.out.println(username + " " + lastname); 
	}

	@DataProvider
	public Object[][] getData()
	{ 
		//Iterations: 
			//1st user name and password - good credit history
			//2nd username and password - no credit history
			//3rd username and password - fraudulent credit history
			
			//define an multi dimensional object array with 3 rows and 2 columns
			//3 rows for the number of test cases
			//2 columns for the number of values passwd in
			Object[][] data = new Object[5][2];
			
					//1st set
					data[0][0]="firstsetusersname"; 
					data[0][1]="firstsetusersname"; 
					
					//2nd set
					data[1][0]="secondsetusersname"; 
					data[1][1]="secondsetusersname"; 
					
					//3rd set
					data[2][0]="thirdsetusersname"; 
					data[2][1]="thirdsetusersname"; 
					
					//4th set
					data[3][0]="fourthsetusersname"; 
					data[3][1]="fourthsetusersname"; 
					
					//5th set
					data[4][0]="fithsetusersname"; 
					data[4][1]="fithsetusersname"; 
					
					return data;
	}

}
