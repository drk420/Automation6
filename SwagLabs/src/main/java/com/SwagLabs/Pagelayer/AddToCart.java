package com.SwagLabs.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.TestBase.TestBase;

public class AddToCart extends TestBase {

	public AddToCart(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	private WebElement addtocart_button;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
	private WebElement cart_button;
	
	public void clickonaddtocart() {
		addtocart_button.click();
		
		
	}
	public void clickoncartbutton() {
		
		cart_button.click();
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

