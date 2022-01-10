import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingToCart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		Thread.sleep(1000);
		String[] names= {"Cucumber", "Brocolli"};
		List <WebElement> products= driver.findElements(By.cssSelector("h4.product-name"));
	
		
		for(int i=0; i<products.size();i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName=name[0].trim();
			List a1=Arrays.asList(names);
			
			if(a1.contains(formatedName)) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					
			}
		}
		

	}

}
