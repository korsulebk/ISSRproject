package TestClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.POM.HomePage_POM;
import com.Utility.BaseClass;

public class HomePageTestCases extends BaseClass{
	
	WebDriverWait wait;
	@Test
	public void clickononhome() throws InterruptedException {
		
			HomePage_POM hp=new HomePage_POM(driver);
		//hp.homebtn();
		wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[8]")));
		JavascriptExecutor   j  =  (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,200)");
		
		hp.Click_on_videos_Viewmore();
		System.out.println("Clicked on videos view more");
		String title=driver.getCurrentUrl();
		System.out.println("page tile is "+title);
		Assert.assertEquals(title, "https://csbc.consisty.com/video_gallery");
		hp.homebtn();
		JavascriptExecutor   js  =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[9]")));
	
		Thread.sleep(2000);
		hp.Click_on_VIP_Photosvsmore();
		System.out.println("Clicked on VIP Photos view more");

		hp.homebtn();
		JavascriptExecutor   jss  =  (JavascriptExecutor)driver;
		jss.executeScript("window.scrollBy(0,900)");
		wait=new WebDriverWait(driver,Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button']//a)[10]")));
		
		
		hp.Click_on_EventImages_Viewmore();
		System.out.println("Clicked on videos view more");

//		
	}

}
