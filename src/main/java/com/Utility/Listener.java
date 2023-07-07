package com.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends BaseClass implements ITestListener {

	ExtentReports extent=ExtentReportGenerator.getReports();
	ThreadLocal<ExtentTest> extenttest=new ThreadLocal<ExtentTest>();  
	
	public void onTestStart(ITestResult result) {
		Library.test=extent.createTest(result.getTestClass().getName()+"=="+result.getMethod().getMethodName());
		extenttest.set(Library.test);
		
		
	}

	public void onTestSuccess(ITestResult result) {
    extenttest.get().log(Status.PASS, "Test case pass")	;
    extenttest.get().addScreenCaptureFromBase64String(getscreenshot());
    
	}

	public void onTestFailure(ITestResult result) {
	    extenttest.get().log(Status.FAIL, "Test case Fail")	;	
	    extenttest.get().addScreenCaptureFromBase64String(getscreenshot());
	   
	}

	public void onTestSkipped(ITestResult result) {
	    extenttest.get().log(Status.SKIP, "Test case Skip")	;	
		
	}

	public void onFinish(ITestContext context) {
	    extent.flush();	
		}
  public static String getscreenshot() {
	  Date Currentdate=new Date();
	  String a=Currentdate.toString().replace(":","");
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  return ts.getScreenshotAs(OutputType.BASE64);
  }
  
 
} 
