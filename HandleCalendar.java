import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/muradnabizade/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		String currentDay="2";
		List <WebElement> dates= driver.findElements(By.className("day"));
		int count =driver.findElements(By.className("day")).size();
		
		for(int i=0; i<count;i++) {
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase(currentDay)) {
				System.out.println("Found");
				driver.findElements(By.className(".id")).get(i).click();
				break;
			}
		}

	}

}
