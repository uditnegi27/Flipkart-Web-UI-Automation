package Flipkart_UI_Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart_UI_Base.Base;

public class Flipkart_UI_LogIn_PopUpPages extends Base{
	
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//input[contains(@type, 'text')]")
	WebElement email_input;
	
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//input[contains(@type, 'password')]")
	WebElement password_input;
	
	@FindBy(xpath = "//div[@class='IiD88i _351hSN']//a")
	WebElement forgot_button;
	
	@FindBy(xpath = "//div[@class= '_1D1L_j']//button[@type = 'submit']")
	WebElement logIn_button;
	
	@FindBy(xpath = "//button[contains(text(), 'Request OTP')]")
	WebElement requestOTP_button;
	
	@FindBy(xpath = "//a[contains(text(), 'New to Flipkart? Create an account')]")
	WebElement newAccount_button;
	
	@FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
	WebElement login_popUp_cross_button;
	
	@FindBy(xpath = "//a[contains(text(), 'Terms of Use')]")
	WebElement TermsOfUse_link;
	
	@FindBy(xpath = "//a[contains(text(), 'Privacy Policy')]")
	WebElement privacyPolicy_link;
	
	public Flipkart_UI_LogIn_PopUpPages() {
		PageFactory.initElements(driver, this);
	}
	
	public String get_logIn_page_title() {
		return driver.getTitle();
	}
	
	public Flipkart_UI_HomePage flipkart_login(String userName, String password) {
		email_input.sendKeys(userName);
		password_input.sendKeys(password);
		logIn_button.click();
		return new Flipkart_UI_HomePage();
	}
	
	public Flipkart_UI_HomePage flipkart_home() {
		login_popUp_cross_button.click();
		return new Flipkart_UI_HomePage();
	}
	

}
