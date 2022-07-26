package Flipkart_UI_Pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart_UI_Base.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_UI_HomePage extends Base{
	
	@FindBy(xpath = "//img[contains(@title, 'Flipkart')]")
	WebElement flipkart_logo;
	
	@FindBy(xpath = "//input[contains(@class, '_3704LK')]")
	WebElement flipkart_searchBar;
	
	@FindBy(xpath = "//a[contains(@class, '_21ljIi')]")
	WebElement flipkart_plus;
	
	@FindBy(xpath = "//div[contains(@class, '_1mkliO')]//following-sibling::div[contains(text(), 'Top Offers')]")
	WebElement flipkart_top_offer_button;
	
	@FindBy(xpath = "//div[contains(@class, '_1mkliO')]//following-sibling::div[contains(text(), 'Grocery')]")
	WebElement flipkart_grocery_button;
	
	@FindBy(xpath = "//div[contains(@class, '_1mkliO')]//following-sibling::div[contains(text(), 'Mobiles')]")
	WebElement flipkart_mobiles_button;
	
	@FindBy(xpath = "//div[contains(text(), 'Fashion')]")
	WebElement flipkart_Fashion_button;
	
	@FindBy(xpath = "//div[contains(text(), 'Electronics')]")
	WebElement flipkart_Electronics_button;
	
	@FindBy(xpath = "//div[contains(text(), 'Home') and @class = 'xtXmba']")
	WebElement flipkart_Home_button;
	
	@FindBy(xpath = "//div[contains(@class, '_1mkliO')]//following-sibling::div[contains(text(), 'Appliances')]")
	WebElement flipkart_appliances_button;
	
	@FindBy(xpath = "//div[contains(@class, '_1mkliO')]//following-sibling::div[contains(text(), 'Travel')]")
	WebElement flipkart_travel_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Login')]")
	WebElement flipkart_logIn_button;
	
	@FindBy(xpath = "//a[contains(@class, '_3-PJz-')]")
	WebElement flipkart_becomeSeller_button;
	
	@FindBy(xpath = "//div[contains(@class, 'exehdJ')]")
	WebElement flipkart_more_button;
	
	@FindBy(xpath = "//a[contains(@class, '_3SkBxJ')]")
	WebElement flipkart_cart_button;
	
	/*
	 Fashion Drop Down WebElement Locators
	 */
	@FindBy(linkText = "Men's Top Wear")
	WebElement flipkart_fashion_manTopWear;
	
	@FindBy(linkText = "All")
	WebElement flipkart_fashion_manTopWear_All;
	
	public Flipkart_UI_HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public Flipkart_UI_Top_OfferPage Open_top_offer_page() {
		flipkart_top_offer_button.click();
		return new Flipkart_UI_Top_OfferPage();
	}
	
	public Flipkart_UI_GroceryPage Open_grocery_page() {
		flipkart_grocery_button.click();
		return new Flipkart_UI_GroceryPage();
	}
	
	public Flipkart_UI_MobilePage Open_mobile_page() {
		flipkart_mobiles_button.click();
		return new Flipkart_UI_MobilePage();
	}
	
	public Flipkart_UI_Fashion_MenTopWear_All open_Fashion_MenTopWear_All_page() {
		Actions action = new Actions(driver);
		action.moveToElement(flipkart_Fashion_button).perform();
		action.moveToElement(flipkart_fashion_manTopWear).perform();
		action.moveToElement(flipkart_fashion_manTopWear_All).click().perform();
		
		return new Flipkart_UI_Fashion_MenTopWear_All();
	}
	
	public Flipkart_UI_AppliancesPage Open_appliances_page() {
		flipkart_appliances_button.click();
		return new Flipkart_UI_AppliancesPage();
	}
	
	public Flipkart_UI_TravelPage Open_travel_page() {
		flipkart_travel_button.click();
		return new Flipkart_UI_TravelPage();
	}
	
	public Flipkart_UI_Become_SellerPage Open_become_seller_page() {
		flipkart_becomeSeller_button.click();
		return new Flipkart_UI_Become_SellerPage();
	}
	
}
