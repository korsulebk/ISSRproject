package com.Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Configdataprovider config;
	//public static ExcelDataProvider excels;
	
	@BeforeSuite
	public void Startsetup() throws Exception {
		config=new Configdataprovider();
		// excels=new ExcelDataProvider();
	}
	@Parameters("BrowserName")
    @BeforeMethod
	public void setup(String BrowserName) throws InterruptedException {
//    	ChromeOptions op=new ChromeOptions();
//		 op.addArguments("--disable-notifications");
		if(BrowserName.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();}
		if(BrowserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
		    driver=new FirefoxDriver();
			
		}
		if(BrowserName.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
	    driver=new ChromeDriver();}
		driver.get(config.getBaseural_01());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}

@AfterMethod
public void teardown() {
	
	
	driver.quit();
	
	
}

}




//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
