package com.SwagLabs.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.TestBase.TestBase;

public class LoginPage extends TestBase {

	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username_textbox;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
	private WebElement addcart_element;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password_textbox;
	
	
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement login_button;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]")
	private WebElement error_msg;
	
	
	public void enterusername(String username) {
		username_textbox.sendKeys(username);
		
	}
	
	public void enterpassword(String password) {
		password_textbox.sendKeys(password);
		
	}
	
	public void clickonloginbutton() {
		login_button.click();
	}
	
	public String geturl() {
		
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public String geterrormsg() {
		String errormsg = error_msg.getText();
		return errormsg;
	}
	public void clickonaddtocart() {
		
		addcart_element.click();
	}
}
