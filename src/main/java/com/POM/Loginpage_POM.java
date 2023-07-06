package com.POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utility.BaseClass;

public class Loginpage_POM extends BaseClass {
	
	@FindBy(xpath="(//button[@type='button']//a)[7]")                  //login button WebElement
	private WebElement loginbtn;
	
	
	@FindBy(id=":r0:")             
	private WebElement username;
	
	@FindBy(id=":r1:")
	private WebElement password;
	
	@FindBy(id=":r2:")                            //Sign IN button
	private WebElement signInbtn;
	
	@FindBy(linkText="Forgot password?")          //WebElement of forgot password link
	private WebElement forgotpassword_link;
	
	@FindBy(name="MobileNumber")
	private WebElement enter_Mobile_no;
	
	@FindBy(id=":r1:")
	private WebElement clickon_Proceedbtn;          //Proceed button on forgot password page
	
	@FindBy(linkText="Return to Login")
	private WebElement returnlogin;
	                                                   
	@FindBy(linkText="Don't have an account? Sign Up")	   //Sign Up
	 private WebElement SignUp;
	
	@FindBy(id=":r0:")
	private WebElement mobilenum;                  // Mobile number field on SignUP Page
	
	@FindBy(id=":r1:")
	private WebElement emailId;                   //Email id field on Sign Up page
	
	@FindBy(id=":r2:")
	private WebElement click_on_Generate_OTP;      // Generate OTP button on SignUP Page 
	
	@FindBy(linkText="Already have an account? Login")	   //Retern to login page
	 private WebElement Returntologin;                                    
	
	@FindBy(linkText="Term & Condition")
	private WebElement terms_Condition;
	
	@FindBy(linkText="Privacy Policy")
	private WebElement privacy_policy;
	
	
	public Loginpage_POM(WebDriver driver) {
		PageFactory.initElements(driver,this);
}
public void loginbtn() {
	loginbtn.click();
}
public void username(String user) {
	username.sendKeys(user);
}
public void password(String pass) {
          password.sendKeys(pass);
}
public void signInbtn() {
	signInbtn.click();
}
public void forgotpassword() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click()", forgotpassword_link);
	
}
public void enterMobilenumer(String mobile) {
	enter_Mobile_no.sendKeys(mobile);
}
public void click_onbproceedbtn() {
	clickon_Proceedbtn.click();
}
public void clickon_retuntto_login() {
	returnlogin.click();
}
	
public void signUpclick() {
	SignUp.click();
}
public void EnterMobile_no(String signmobile) {
	mobilenum.sendKeys(signmobile);
}
public void Enter_EmailId(String email) {
          emailId.sendKeys(email);
}
public void Click_on_GenerateOPT() {
	click_on_Generate_OTP.click();
}
public void Clickon_Already_have_An_account_login() {
	Returntologin.click();
}
public void Click_on_Terms_Condition() {
	terms_Condition.click();
}

public void Click_on_Privacy_Policy() {
	privacy_policy.click();
}





}
