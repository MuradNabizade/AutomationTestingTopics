import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		//give me the count of links in website
		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//link in footer section
		WebElement footer= driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement footerCol= footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(footerCol.findElements(By.tagName("a")).size());
		
		//click on each link and check if pages are opening
		for(int i =0; i<footerCol.findElements(By.tagName("a")).size(); i++) {
			String clickOnLink= Keys.chord(Keys.COMMAND,Keys.ENTER);
			footerCol.findElements(By.tagName("a")).get(i).sendKeys(clickOnLink);
			Thread.sleep(5000);
			
				
			}
		Set <String> abc= driver.getWindowHandles();
		Iterator <String>it=abc.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			
		}

	}

}
