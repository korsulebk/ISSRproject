package com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;

public class Library {
	
		public static ExtentTest test;
		public static void Custom_sendkeys(WebElement element, String text) {
			try {
				element.sendKeys("text");
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

	

}
