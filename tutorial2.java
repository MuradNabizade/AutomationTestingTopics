package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tutorial2 {
	@Test
	private void Demo() {
		// TODO Auto-generated method stub
		System.out.println("hello");

	}
	
	@Test
	private void secondTest() {
		// TODO Auto-generated method stub

	}
	
	@BeforeTest
	private void prerequsite() {
		System.out.println("I will execute first");

	}
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
}
