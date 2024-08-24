package com.SwagLabs.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.TestBase.TestBase;
import com.SwagLabs.Utility.DropdownHandling;

public class Productpage extends TestBase{

	
	public Productpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	private WebElement addcart_button;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")
	private WebElement addtocart_link;
	
	@FindBy(xpath="//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[2]/div[1]/span[1]/select[1]")
	private WebElement name_dropdown;
	
	
	
public void clickonaddtocartlink() {
		
		addtocart_link.click();
		
	}
	
	
	
	public void clickonaddtocart() {
		addcart_button.click();
		
	}
	
	public void selectdropdown() {
		
		DropdownHandling d = new DropdownHandling();
		d.dropdown(name_dropdown,"Price (low to high)");
		
	}
	
	
	
	
}
