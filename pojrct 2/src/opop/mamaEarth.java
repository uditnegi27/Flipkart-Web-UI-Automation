package opop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mamaEarth {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://mamaearth.in/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='wzrk-cancel-id']")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Baby")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}


//button[@type='button']

