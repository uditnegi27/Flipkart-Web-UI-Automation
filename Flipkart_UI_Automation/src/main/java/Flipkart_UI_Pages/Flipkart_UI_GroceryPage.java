package Flipkart_UI_Pages;

import org.openqa.selenium.support.PageFactory;

import Flipkart_UI_Base.Base;

public class Flipkart_UI_GroceryPage extends Base{
	
	public Flipkart_UI_GroceryPage() {
		PageFactory.initElements(driver, this);
	}
}
