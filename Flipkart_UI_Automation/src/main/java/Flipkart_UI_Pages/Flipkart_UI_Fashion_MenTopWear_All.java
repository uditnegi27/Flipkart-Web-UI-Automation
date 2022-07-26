package Flipkart_UI_Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart_UI_Base.Base;

public class Flipkart_UI_Fashion_MenTopWear_All extends Base{
	
	public Flipkart_UI_Fashion_MenTopWear_All() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[contains(text(), 'Price -- Low to High')]")
	WebElement filter_lowToHigh_button;
	
	@FindBy (xpath = "//div[starts-with(text(), '₹') and @class = '_30jeq3']")
	WebElement mensTopWear_product_price;
	
	public void apply_lowToHigh_filter() throws InterruptedException {
		filter_lowToHigh_button.click();
		Thread.sleep(5000);
	}
	
	public boolean test_products_sequence_after_applying_lowToHigh_filter() {
		List<WebElement> list = driver.findElements(By.xpath("//div[starts-with(text(), '₹') and @class = '_30jeq3']"));
		List<Integer> ll = new ArrayList<Integer>();
		int length = list.size();
		for(int i=0; i<length; i++) {
			WebElement newEle = list.get(i);
			String amo = newEle.getText();
			int amount = Integer.parseInt(amo.replaceAll("[^0-9]", "").toString());
			ll.add(amount);
		}
		
		for(int i=0; i<length-1; i++) {
			if(ll.get(i) > ll.get(i+1)) {
				return false;
			}
		}
		return true;
	}

}
