package com.POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class DonatePage_POM {
	public WebDriver driver;
	@FindBy(xpath="(//button[@type='button']//a)[6]")              
	private WebElement donate_TAB;
	@FindBy(id=":r0:")
	private WebElement Enter_FirstName;
	@FindBy(id=":r1:")
	private WebElement Enter_LastName;
	@FindBy(id=":r2:")
	private WebElement Enter_EmailID;
	@FindBy(id=":r3:")
	private WebElement Enter_Mobileno;//10,000
	//@FindBy(id=":r4:")
	@FindBy(xpath="(//div[@class='MuiGrid-root MuiGrid-container MuiGrid-spacing-xs-2 css-isbt42']//button)[1]")
	private WebElement ammount;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Clickon_Donatebtn;
	
	@FindBy(xpath="//button[@title='Yes, Do Transaction']")
	private WebElement clickon_Yes;
	
	@FindBy(id=":r8:")
	private WebElement SendUPIID;
	
	@FindBy(id=":r9:")
	private WebElement Upload;
	
	@FindBy(id=":rb:")
	private WebElement Uploadbtn;
	
	public DonatePage_POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Click_On_DonateTab() {
		donate_TAB.click();
	}
	
	public void firstname() {
		Enter_FirstName.sendKeys("Ram");
	}
	public void lastname() {
		Enter_LastName.sendKeys("Jadhav");
	}
	public void emailid() {
		Enter_EmailID.sendKeys("ram@gmail.com");
	}
	public void mobilenum() {
		Enter_Mobileno.sendKeys("9665367443");
	}
	
	
	public void click_on_ammount() {
		
		ammount.click();
	}
	public void clickonDonatebtn() {
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(6));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@type='button']//a)[6]")));
		Clickon_Donatebtn.click();
	}
	
	public void click_on_Yea_do_Transaction() {	
		clickon_Yes.click();
	}
	public void send_UIP_ID() {
		
		SendUPIID.sendKeys("omshiv1307@ddd");
	}
	public void upload_Photo() {
		Upload.sendKeys("C:\\Users\\Baliram\\OneDrive\\Desktop\\Welcome to google.png");
	}
	public void Clickon_Uploadbtn() {
		Uploadbtn.click();
	}
}
