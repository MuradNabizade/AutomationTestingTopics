package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class tutorial1 {
	@Parameters({"URL"})
	@Test
	private void Demo(String urlname ) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		System.out.println(urlname);
	}
	
	@Test
	private void secondTest() {
		// TODO Auto-generated method stub

	}

}
