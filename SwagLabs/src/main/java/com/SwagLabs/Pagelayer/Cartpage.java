package com.SwagLabs.Pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.TestBase.TestBase;

public class Cartpage extends TestBase {

	
	public Cartpage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	
	

	
	
	
	public String getcurrenturl() {
		
		String text = driver.getCurrentUrl();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
