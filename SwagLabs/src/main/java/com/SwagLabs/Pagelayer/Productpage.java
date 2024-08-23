package com.SwagLabs.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.TestBase.TestBase;

public class Productpage extends TestBase{

	
	public Productpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addcart_button;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
	private WebElement addtocart_link;
	
	
public void clickonaddtocartlink() {
		
		addtocart_link.click();
		
	}
	
	
	
	public void clickonaddtocart() {
		addcart_button.click();
		
	}
	
	
	
	
	
	
}
