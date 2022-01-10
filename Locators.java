import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
		//driver.findElement(By.id("inputUsername")).sendKeys("yellowbird");
		driver.findElement(By.id("inputUsername")).sendKeys("yellowbird");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.print(driver.findElement(By.cssSelector("p.error")).getText());;
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//Xpath //Tagename[@attribute='value']
		//input[@placeholder='Username']      
		//<input type="text" placeholder="Name">
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("yellowbird");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("yellowbird@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("yellowbirdR@gmail.com");
		
		
		
		//input[@type='text'][2]
		//input[type='text']:nth-child(2)
		
		
		//form/input[3]
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("0883345500");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		//  form p
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//now lets sign in
		driver.findElement(By.className("go-to-login-btn")).click();
		
		driver.findElement(By.id("inputUsername")).sendKeys("yellowbird");

		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		Thread.sleep(1000);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("signInBtn")).click();

	}

}
