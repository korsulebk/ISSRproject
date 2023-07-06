package com.POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POM {
	public WebDriver driver;
	@FindBy(xpath="(//button[@type='button']//a)[1]")
	private WebElement homebtn;
	
	@FindBy(xpath="(//button[@type='button']//a)[8]")
	private WebElement videosview;
	

	@FindBy(xpath="(//button[@type='button']//a)[9]")
	private WebElement vipphotosview;
	
	@FindBy(xpath="(//button[@type='button']//a)[10]")
	private WebElement Event_image;
	
	public HomePage_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void homebtn() {
		homebtn.click();
	}
	public void Click_on_videos_Viewmore() {
		
		videosview.click();
	}
	public void Click_on_VIP_Photosvsmore() throws InterruptedException {	
		vipphotosview.click();}
	public void Click_on_EventImages_Viewmore() throws InterruptedException {
//		JavascriptExecutor   j  =  (JavascriptExecutor)driver;
//		j.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		Event_image.click();
	}
}
