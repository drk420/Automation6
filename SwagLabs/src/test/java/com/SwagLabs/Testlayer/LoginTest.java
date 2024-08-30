package com.SwagLabs.Testlayer;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLabs.Pagelayer.LoginPage;
import com.SwagLabs.TestBase.TestBase;

public class LoginTest extends TestBase {

	@Test
	public void validatelogintest() {
	
		String Expected_url ="https://www.saucedemo.com/inventory.html";
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusername("standard_user");
		loginpageobj.enterpassword("secret_sauce");
		loginpageobj.clickonloginbutton();
		
		String Actual_Result=loginpageobj.geturl();
		Assert.assertEquals(Actual_Result,Expected_url);
	}
	
	@Test
	public void validatelogintestwithinvalidcredntials() {
		
		String Expected_Result="Epic sadface: Username and password do not match any user in this service";
		
		LoginPage loginpageobj = new LoginPage(driver);
		loginpageobj.enterusername("standard");
		loginpageobj.enterpassword("secret");
		loginpageobj.clickonloginbutton();
		
		String Actual_Result = loginpageobj.geterrormsg();
	
		Assert.assertEquals(Actual_Result,Expected_Result);
		
	}
	
	
}
