package Flipkart_UI_Base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class tryThis {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com");
		String tt = driver.getTitle();
		System.out.println(tt);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(3000);

		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//div[contains(text(), 'Fashion')]"))).perform();
		
		action.moveToElement(driver.findElement(By.linkText("Men's Top Wear"))).perform();
		
		action.moveToElement(driver.findElement(By.linkText("All"))).click().perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(text(), 'Price -- High to Low')]")).click();
		Thread.sleep(9000);
		try {
			List<WebElement> list = driver.findElements(By.xpath("//div[starts-with(text(), '₹') and @class = '_30jeq3']"));
			List<Integer> ll = new ArrayList<Integer>();
			int length = list.size();
			for(int i=0; i<length; i++) {
				WebElement newEle = list.get(i);
				String amo = newEle.getText();
				int amount = Integer.parseInt(amo.replaceAll("[^0-9]", "").toString());
				ll.add(amount);
				System.out.println(amount);
				Thread.sleep(1000);
			}
			
			int flag = 1;
			
			for(int i=0; i<length-1; i++) {
				System.out.println(flag);
				if(ll.get(i) < ll.get(i+1)) {
					flag = 0;
				}
//				else {
//					flag = 0;
//					return;
//				}
			}
			System.out.println("Answer = "+flag);
		}
		catch(StaleElementReferenceException e) {
			e.printStackTrace();
		}
		
		
		
		

		
//		Select select = new Select(driver.findElement(By.xpath("//select[@id='first']")));
//		List<WebElement> ok = select.getOptions();
//		
//		for(int i=0; i<ok.size(); i++)
//		{
//			System.out.println(ok.get(i).getText());
//			ok.get(2).click();
//		}
//			
//		
//		Thread.sleep(4000);
//		
		driver.quit();

	}

}
