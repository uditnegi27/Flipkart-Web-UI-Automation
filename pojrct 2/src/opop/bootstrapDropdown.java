package opop;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bootstrapDropdown {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		Select select = new Select(driver.findElement(By.xpath("//select[@id='first']")));
		List<WebElement> ok = select.getOptions();
		
		for(int i=0; i<ok.size(); i++)
		{
			System.out.println(ok.get(i).getText());
			ok.get(2).click();
		}
			
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
