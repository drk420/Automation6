package com.SwagLabs.TestBase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public void start() {
		logger=Logger.getLogger("SwaglLabs");
		PropertyConfigurator.configure("Log4jProprties.file");
		logger.info("Swag Labs Framework Started");
	}
	@AfterTest
	public void stop() {
		logger.info("Framework closed");
		
	}
	@BeforeMethod
	public void setup() {
		String br = "chrome";
		if(br.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			
		}
		else if(br.equalsIgnoreCase("EdgeDriver")) {
			driver = new EdgeDriver();
			
		}
		else if(br.equalsIgnoreCase("FirefoxDriver")) {
			driver = new FirefoxDriver();
			
		}
		else {
			logger.info("provide correct browser");
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@AfterMethod
	public void close() {
		driver.close();
		
	}

}
