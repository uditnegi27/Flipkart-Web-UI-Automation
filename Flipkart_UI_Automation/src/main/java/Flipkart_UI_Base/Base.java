package Flipkart_UI_Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Base(){
		try {
			prop = new Properties();
			FileInputStream is = new FileInputStream("/Users/honasa/Desktop/SeleniumSeesion/Flipkart_UI_Automation/src/main/java/Flipkart_UI_Config/config.properties");
			prop.load(is);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		//String browserName = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
	}
}
