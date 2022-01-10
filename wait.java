import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		String[] names= {"Cucumber","Brocolli"};
		
		//impilicit wait
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		addItems(driver,names);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy") ;
		driver.findElement(By.className("promoBtn")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
	
		//explicit wait
		//WebDriverWait w =new WebDriverWait(driver,5);
	//	w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.print(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	
		
	}
	
	
	
	
	public static void addItems(WebDriver driver,String[] names) {
		
		
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
