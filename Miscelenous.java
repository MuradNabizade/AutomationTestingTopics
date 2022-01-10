import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;

public class Miscelenous {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		driver.get("https://google.com");
		driver.manage().deleteAllCookies();
		
		//TAKE SCREEN SHOT
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(src, new File("/Users/muradnabizade/Desktop/Screen ShotBYYELLOW.png"));
		
	}

}
