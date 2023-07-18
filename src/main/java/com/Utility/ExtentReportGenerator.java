package com.Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	
	public static  ExtentReports extent;
	public static ExtentReports getReports() {
		
		String path="C:\\Users\\Baliram\\eclipse-workspace\\Baliramframework\\ISSR\\Report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation test Report");
		reporter.config().setReportName("ISSR Test Report");
		reporter.config().setTheme(Theme.DARK);
		
	    extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project name", "ISSR TEST");
		extent.setSystemInfo("Tool" , "Selenium WebDriver");
		extent.setSystemInfo("QA", "Baliram Korsule");
		return extent;
	}

}

	
	

