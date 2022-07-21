package opop;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tableFormat {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
				
		WebDriver driver = new ChromeDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/table");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(10000);
		//explicitWait(WebDriver driver, WebElement element, Duration 10);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//table[@id='webtable']//tr[2]/td[1]")));
		System.out.println(element.getText());
		
		String before = "//table[@id='webtable']//tr[";
		String mid = "]/td[";
		String last = "]";
		
		
		for(int i=2; i<=5; i++) {
			for(int j=1; j<=3; j++) {
				WebElement ele = driver.findElement(By.xpath(before+i+mid+j+last));
				System.out.println(ele.getText());
				Thread.sleep(2000);
			}
			
		}
		driver.quit();
	}
}
