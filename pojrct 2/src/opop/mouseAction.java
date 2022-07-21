package opop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in");
		
		
		Actions action = new Actions(driver);
		
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"))).click().build().perform();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
		
//		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]"))).contextClick().build().perform();
//		
//		Thread.sleep(8000);
		
//		driver.navigate().to("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
//		
//		action.doubleClick(driver.findElement(By.id("double-click"))).perform();
//		Thread.sleep(5000);
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		
		
		driver.findElement(By.id("Accepted Elements")).click();
		
		driver.switchTo().frame("description");
		
		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		Thread.sleep(5000);
		
		
		
		
		driver.quit();
		
		

	}

}
