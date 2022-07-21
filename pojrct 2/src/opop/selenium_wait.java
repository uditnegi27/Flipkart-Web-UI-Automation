package opop;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium_wait {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		//button[@class='_2KpZ6l _2doB4z']
		
		//WebElement okay = new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id(""))));
		
		//okay.click();
		
		
		driver.findElement(By.id("twotabsearchtextbox")).click();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus mobile");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		
		List<WebElement> allphone = driver.findElements(By.xpath("//span[@class='a-offscreen']"));
		 
		WebElement tr = allphone.get(10);
		System.out.println(tr.getText());
		System.out.println(allphone.size());
		int min = 50000;
		if(allphone.size() != 0)
		{
			for(int i=0; i<allphone.size(); i++)
			{
				WebElement ele = allphone.get(i);
				String str = ele.getText();
				
				if(str == "") {
					min = 0;
				}
					
				else
				{
					int num = Integer.parseInt(str.replaceAll("[^0-9]", "").toString());
					if(min > num)
						min = num;
				}
			}
			
			System.out.println(min);
		}
		
		
		
		
		
		
	}
	
	// Fluent Wait
//	public static void fluentWait(WebDriver driver, WebElement element, Duration timeout)
//	{
//		new FluentWait<WebDriver>(driver).withTimeout(timeout).pollingEvery(timeout).ignoring(NoSuchElementException.class);
//		
//	}
	
	// Explicit Wait
//	public static void explicitWait(WebDriver driver, WebElement element, Duration timeout)
//	{
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//	}
}
