package opop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp_handling {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.name("alert")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("confirmation")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(5000);
		alert1.dismiss();
		
		
		
		driver.findElement(By.name("confirmation")).click();
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(5000);
		alert2.accept();
		
		
		
		driver.findElement(By.name("prompt")).click();
		Alert alert3 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert3.accept();
		
		driver.findElement(By.name("upload")).sendKeys("/Users/honasa/Downloads/JmeterFinal15kRunReport/content/pages/OverTime.html");
		Thread.sleep(8000);
		driver.quit();
		
		
	}

}
