package TestClasses;


import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.DonatePage_POM;

import com.Utility.BaseClass;

public class Donatepage_TestCases extends BaseClass{
	WebDriverWait wait;
	//public WebDriver driver;
	@Test
	public void A_DonatePage() throws InterruptedException {
		
	DonatePage_POM dp=new DonatePage_POM(driver);
	
	wait=new WebDriverWait(driver,Duration.ofSeconds(6));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[6]")));
	
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
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']//button)[1]")));
	//WebElement Element=driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']//button)[1]"));
	JavascriptExecutor   js  =  (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,3000)");
	Thread.sleep(4000);
	dp.click_on_ammount();
	System.out.println("clicked on Amount");
	
	//dp.clickonDonatebtn();
    System.out.println("Clicked on donate button");
	Thread.sleep(6000);
	
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
