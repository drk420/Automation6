package com.SwagLabs.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.Pagelayer.Cartpage;
import com.SwagLabs.Pagelayer.LoginPage;
import com.SwagLabs.Pagelayer.Productpage;
import com.SwagLabs.TestBase.TestBase;

public class Addtocarttest extends TestBase {

	@Test
	public void validateaddtocarttest() throws InterruptedException {
		
		String Expected_Result="https://www.saucedemo.com/cart.html";
		
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusername("standard_user");
		loginpageobj.enterpassword("secret_sauce");
		loginpageobj.clickonloginbutton();
		
		Productpage productpageobj = new Productpage(driver);
		
		Thread.sleep(5000);
		productpageobj.clickonaddtocart();
		Thread.sleep(5000);
		productpageobj.clickonaddtocartlink();
		
		Cartpage cartpageobj = new Cartpage(driver);
		Thread.sleep(5000);
		String Actual_Result = cartpageobj.getcurrenturl();
		Thread.sleep(5000);
		logger.info(Actual_Result);
		Thread.sleep(5000);
		Assert.assertEquals(Actual_Result,Expected_Result);
	}
	
	@Test
	public void validateaddtocartfunctionalitywithpricelowtohigh() throws InterruptedException {
		
String Expected_Result="https://www.saucedemo.com/cart.html";
		
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusername("standard_user");
		loginpageobj.enterpassword("secret_sauce");
		loginpageobj.clickonloginbutton();
		
		Productpage productpageobj = new Productpage(driver);
		productpageobj.selectdropdown();
		Thread.sleep(5000);
		Thread.sleep(5000);
		productpageobj.clickonaddtocart();
		
		Thread.sleep(5000);
		productpageobj.clickonaddtocartlink();
		
		Cartpage cartpageobj = new Cartpage(driver);
		Thread.sleep(5000);
		String Actual_Result = cartpageobj.getcurrenturl();
		Thread.sleep(5000);
		logger.info(Actual_Result);
		Thread.sleep(5000);
		Assert.assertEquals(Actual_Result,Expected_Result);
		
	}
	
	
	
	
	}
