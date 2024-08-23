package com.SwagLabs.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.SwagLabs.TestBase.TestBase;

public class Takesscreenshot extends TestBase {

	public void getscreenshot(String filename)  {
		
		try {
		TakesScreenshot ts = (TakesScreenshot)driver;
	File src =	ts.getScreenshotAs(OutputType.FILE);
	String path = "D:\\Automation\\Automation6\\SwagLabs\\target\\filename.png";
		File des = new File(path);
		
		
			FileHandler.copy(src, des);
		} 
		catch (IOException e) {
		
			e.printStackTrace();
		}
	}
	
	
	
}
