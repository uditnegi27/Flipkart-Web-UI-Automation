package Flipkart_UI_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart_UI_Base.Base;

public class Flipkart_UI_TravelPage extends Base{
	
	public Flipkart_UI_TravelPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "0-departcity")
	WebElement departure_city;
	
	@FindBy(name = "0-arrivalcity")
	WebElement arrival_city;
	
	
}
