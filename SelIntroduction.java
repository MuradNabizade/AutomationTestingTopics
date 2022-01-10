
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//invoking the browser
		//chrome driver--methods
		 System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//for firefox download that driver then import-geckodriver
		// System.setProperty("webdriver.gecko.driver","/Users/muradnabizade/Downloads/geckodriver");
		// WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://rahulshettyacademy.com/#/index");
		System.out.println(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		
		//Closing current window
		driver.close();


	}


}
