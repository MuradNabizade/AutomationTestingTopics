package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TutorialImportant {
	
	

	@Test(groups=("Smoke"))
	private void DemoLoginAPI() {
		// TODO Auto-generated method stub
		System.out.println("yellow bird");

	}
	@Test
	private void YelLoginAPI() {
		// TODO Auto-generated method stub
		System.out.println("Login");

	}
	
	@Test
	private void YellowBirdLoginAPI() {
		// TODO Auto-generated method stub
		System.out.println("yellow birdin Qolu");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstusername";
		data[0][1]="password";
		
		data[1][0]="secondusername";
		data[1][1]="password2";
		
		data[2][0]="thirdusername";
		data[2][1]="password3";
		
		return data;
		
		
		
	}
	
}
