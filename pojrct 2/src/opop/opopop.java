package opop;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opopop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("trimmer");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		
		
		
		driver.close();
		
	}

}
