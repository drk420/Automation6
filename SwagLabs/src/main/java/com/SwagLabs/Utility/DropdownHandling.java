package com.SwagLabs.Utility;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.SwagLabs.TestBase.TestBase;

public class DropdownHandling extends TestBase {

	public void dropdown(WebElement element,String text) {
		
		Select s = new Select(element);
		s.selectByVisibleText(text);
		
		List<WebElement> options =  s.getOptions();
		int count = options.size();
		logger.info(count);
		
	for(int i=0;i<count;i++) {
	String Text	= options.get(i).getText();
		logger.info(Text);
		
	}
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
