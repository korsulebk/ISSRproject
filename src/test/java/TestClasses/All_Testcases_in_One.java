package TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.POM.DonatePage_POM;
import com.POM.Loginpage_POM;
import com.Utility.BaseClass;
import com.Utility.ExcelDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Testcases_in_One  {
	
	WebDriverWait wait;
	public static WebDriver driver;

	
	@BeforeClass 
	public void launch() {
WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://csbc.consisty.com/home");
		
	}

	@Test(priority=1)
	public void A_clickonlogin() throws Exception, Exception {
		Loginpage_POM log=new Loginpage_POM(driver);
		
		log.loginbtn();
		System.out.println("Succefully Clicked on login button");
		
		System.out.println("Succefully Clicked on login button");
		String uname=ExcelDataProvider.getdataproviderExcelsheet(0,1 );  //Data geting from excel sheet
		log.username(uname);
		System.out.println("Succefully entered Username into username field");
		String pward=ExcelDataProvider.getdataproviderExcelsheet( 1, 1);  //Data Getting from excel sheet
		log.password(pward);
		System.out.println("Succefully entered password into password field");
		log.signInbtn();
		System.out.println("Succefully Clicked on SignIN button");

//		Thread.sleep(3000);
//	//	log.forgotpassword();                    //click on forgot password link
//		System.out.println("Clicked on forgot password link");
//		
//	//	log.enterMobilenumer();                    //Enter Number into textbox
//		System.out.println("Entered mobile number into text box");
//		Thread.sleep(2000);
//		
//	//	log.click_onbproceedbtn();                //Click on proceed button
//		System.out.println("Clicked on Proceed button");
//		Thread.sleep(2000);
//	//	log.clickon_retuntto_login();            //Click on return to login btn
//		System.out.println("Clicked on Return to login button");
//		Thread.sleep(2000);
//		
//		log.signUpclick();                    //Click on Sign Up Link
//		System.out.println("Clicked on signUP button and Navigated");
//		log.EnterMobile_no();
//		System.out.println("Entered mobile number");
//		Thread.sleep(2000);
//		log.Enter_EmailId();
//		System.out.println("Entered EmailID number");
//		Thread.sleep(2000);
//		log.Click_on_GenerateOPT();
//		System.out.println("Clicked on generate OTP");
//		log.Clickon_Already_have_An_account_login();
		System.out.println("navigated Return to login page"); }
	@Test(priority=2)
	public void A_DonatePage() throws InterruptedException {
		
	DonatePage_POM dp=new DonatePage_POM(driver);
	
	wait=new WebDriverWait(driver,Duration.ofSeconds(6));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button']//a)[6]")));
	
	dp.Click_On_DonateTab();
	System.out.println("Clicked on donate page");
	//Validation
	String Urlofdonate_page=driver.getCurrentUrl();
	Assert.assertEquals(Urlofdonate_page, "https://csbc.consisty.com/donate");
	
	 
	
	dp.firstname();
	System.out.println("Enter first Name");
	
	dp.lastname();
	System.out.println("Entered Last name");
	
	dp.emailid();
	System.out.println("Entered EmailID");
	
	dp.mobilenum();
	System.out.println("Entered mobile number");
	
	
	wait=new WebDriverWait(driver,Duration.ofSeconds(6));
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
	WebElement Element=driver.findElement(By.xpath("//button[@type='submit']"));
	
	//js.executeScript("window.scrollBy(0,9000)");
	
	 //Find element by link text and store in variable "Element"        		
    WebElement Elemet = driver.findElement(By.xpath("//button[@type='submit']"));
    JavascriptExecutor   js  =  (JavascriptExecutor)driver;
    //This will scroll the page till the element is found		
    js.executeScript("arguments[0].scrollIntoView();", Elemet);
	
	
//	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[7]//button[1]")));
	dp.click_on_ammount();
	System.out.println("clicked on Amount");
	
	wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
	dp.clickonDonatebtn();
	System.out.println("Clicked on donate button");
	Thread.sleep(2000);
	
	dp.click_on_Yea_do_Transaction();
	System.out.println("Clicked on Yes button");   //https://csbc.consisty.com/qrcode
	
	String Urlof_QRCode_page=driver.getCurrentUrl();
	Assert.assertEquals(Urlof_QRCode_page, "https://csbc.consisty.com/qrcode");
	
	Thread.sleep(7000);	
	//String mainwnd=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it=set.iterator();
		it.next();
		//String wh1=it.next();
		String wh2=it.next();
		driver.switchTo().window(wh2);
		
	
		
		
	dp.send_UIP_ID();
	dp.upload_Photo();
	dp.Clickon_Uploadbtn();
	
		
	
	}
}
