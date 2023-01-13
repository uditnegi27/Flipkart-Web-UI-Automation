package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class brokenLinks {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/honasa/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		List<String> urlList  = new ArrayList<>();
		
		for(WebElement l:list) {
			String url = l.getAttribute("href");
			try
			{
				if(!url.equals("null"))
					urlList.add(url);
			}
			catch (NullPointerException e){
				
			}
		}
		
		for(int i=0; i<urlList.size(); i++) {
			
			/* Create the URL from the string  */
			URL link = new URL(urlList.get(i));
			
			/* Make the connection using "HttpURLConnection"  */
			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			
			/* Connect with the connection */
			connection.connect();
			
			/* Store the response of connection in variable  */
			int res = connection.getResponseCode();

			if(res >=  400) {
				System.out.println(urlList.get(i)+"    -->   link is bronker");
			}
			else {
				System.out.println("working : "+urlList.get(i));
			}
			
			connection.disconnect();
		}
		
		
		driver.quit();

	}

}
