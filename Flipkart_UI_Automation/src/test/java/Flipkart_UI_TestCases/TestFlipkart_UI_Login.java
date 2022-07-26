package Flipkart_UI_TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Flipkart_UI_Base.Base;
import Flipkart_UI_Pages.Flipkart_UI_AppliancesPage;
import Flipkart_UI_Pages.Flipkart_UI_Fashion_MenTopWear_All;
import Flipkart_UI_Pages.Flipkart_UI_GroceryPage;
import Flipkart_UI_Pages.Flipkart_UI_HomePage;
import Flipkart_UI_Pages.Flipkart_UI_LogIn_PopUpPages;
import Flipkart_UI_Pages.Flipkart_UI_MobilePage;
import Flipkart_UI_Pages.Flipkart_UI_Top_OfferPage;
import Flipkart_UI_Pages.Flipkart_UI_TravelPage;

public class TestFlipkart_UI_Login extends Base{
	
	Flipkart_UI_LogIn_PopUpPages logIn;
	Flipkart_UI_HomePage homePage;
	Flipkart_UI_Top_OfferPage topOfferPage;
	Flipkart_UI_GroceryPage groceryPage;
	Flipkart_UI_MobilePage mobilePage;
	Flipkart_UI_AppliancesPage appliancesPage;
	Flipkart_UI_TravelPage travelPage;
	Flipkart_UI_Fashion_MenTopWear_All mensTopWaer_all;
	
	
	public TestFlipkart_UI_Login() {
		super();
	}
	
	@org.testng.annotations.BeforeClass
	public void setUp() throws InterruptedException {
		initialization();
		Thread.sleep(5000);
		logIn = new Flipkart_UI_LogIn_PopUpPages();
	}
	
	@Test(priority = 1)
	public void get_logInPage_title() {
		String title = logIn.get_logIn_page_title();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
	}
	
	@Test(priority = 2)
	public void logIn() {
		homePage = logIn.flipkart_home();
	}
	

	@Test(priority = 3)
	public void click_on_fashion_mensTopWear_All() {
		mensTopWaer_all = homePage.open_Fashion_MenTopWear_All_page();
	}
	
	@Test(priority = 4)
	public void click_on_filter() throws InterruptedException {
		mensTopWaer_all.apply_lowToHigh_filter();
	}
	
	@Test(priority = 5)
	public void test_product_sequence() {
		
		Assert.assertEquals(mensTopWaer_all.test_products_sequence_after_applying_lowToHigh_filter(), true );
	}
	
//	@Test(priority = 3)
//	public void open_topOfferPage() {
//		topOfferPage = homePage.Open_top_offer_page();
//	}
//	
//	@Test(priority = 4)
//	public void open_groceryPage() {
//		groceryPage = homePage.Open_grocery_page();
//	}
//	
//	@Test(priority = 5)
//	public void open_mobilePage() {
//		mobilePage = homePage.Open_mobile_page();
//	}
//	
//	@Test(priority = 6)
//	public void open_appliancesPage() {
//		appliancesPage = homePage.Open_appliances_page();
//	}
//	
//	@Test(priority = 7)
//	public void open_travelPage() {
//		travelPage = homePage.Open_travel_page();
//	}
	
	@org.testng.annotations.AfterClass
	public void tearDown() {
		driver.close();
	}
}
