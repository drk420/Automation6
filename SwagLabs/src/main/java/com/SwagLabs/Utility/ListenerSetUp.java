package com.SwagLabs.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.SwagLabs.TestBase.TestBase;

public class ListenerSetUp extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	
		logger.info(result.getName()+"Test is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	logger.info(result.getName()+"Test is completed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		logger.info(result.getName()+"Test is failure");
		Takesscreenshot.getscreenshot(result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	logger.info(result.getName()+"Test is skipped");
	}



}
