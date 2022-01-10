import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLink {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String url = driver.findElement(By.xpath("//a[normalize-space()='Broken Link']")).getAttribute("href");
		HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
		
		connection.setRequestMethod("HEAD");
		connection.connect();
		int t=connection.getResponseCode();
		System.out.println(t);

	}

}
