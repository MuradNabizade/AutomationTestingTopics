import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scrolling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		js.executeScript("document.querySelector(\".tableFixHead\").scrollBy(0,300)");
		
		
		//in chrome console:::
		//window.scrollBy(0,500)
		//undefined
		//window.scrollBy(0,700)
		//undefined
		//document.querySelector(".tableFixHead").scrollBy(0,300)

		
		//TABLE GRID
		List <WebElement> values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		for(int i=0; i<values.size();i++) {
			System.out.println(Integer.parseInt(values.get(i).getText()));

		}

	}

}
