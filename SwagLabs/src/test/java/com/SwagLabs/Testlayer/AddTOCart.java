package com.SwagLabs.Testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.Pagelayer.AddToCart;
import com.SwagLabs.Pagelayer.Cartpage;
import com.SwagLabs.Pagelayer.LoginPage;
import com.SwagLabs.Pagelayer.Productpage;
import com.SwagLabs.TestBase.TestBase;

public class AddTOCart extends TestBase {

	
	@Test
	public void addtocarttest() throws InterruptedException {
		
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusername("standard_user");
		loginpageobj.enterpassword("secret_sauce");
		loginpageobj.clickonloginbutton();
		
		AddToCart addtocart_obj = new AddToCart (driver);
		addtocart_obj.clickonaddtocart();
		addtocart_obj.clickoncartbutton();
	}
	}
