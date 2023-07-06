package TestClasses;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.Gallary_POM;
import com.Utility.BaseClass;

public class Gallary_page_Testclass extends BaseClass {
	//WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void open_Gallaries() throws InterruptedException {
	Gallary_POM gp=new Gallary_POM (driver);
	gp.Clickon_Gallary();
	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Event Gallery']")));
	
	gp.Clickon_Event_Gallary();
	String s=driver.getCurrentUrl();
	Assert.assertEquals(s,"https://csbc.consisty.com/event_gallery");
	System.out.println("Opened Event_Gallary");
	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='GALLERY']")));
	gp.Clickon_Gallary();
	
	gp.Clickon_Video_Gallary();
	String video=driver.getCurrentUrl();
	Assert.assertEquals(video,"https://csbc.consisty.com/video_gallery");
	//String text1=driver.g
	System.out.println("Opened Videos_Gallary");
	wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='GALLERY']")));
	gp.Clickon_Gallary();
	gp.Clickon_VIP_Gallary();
	String vip=driver.getCurrentUrl();
	Assert.assertEquals(vip,"https://csbc.consisty.com/vip_gallery");
	System.out.println("Opened VIP_Gallary");
	
	
	}
}
