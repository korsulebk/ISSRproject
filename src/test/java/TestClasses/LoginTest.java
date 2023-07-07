package TestClasses;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.POM.Loginpage_POM;
import com.Utility.BaseClass;
import com.Utility.ExcelDataProvider;

public class LoginTest extends BaseClass{
	@Test
	public void A_clickonlogin() throws IOException, Exception {
		Loginpage_POM log=new Loginpage_POM(driver);
			
		log.loginbtn();
		System.out.println("Succefully Clicked on login button");
		
		String uname=ExcelDataProvider.getdataproviderExcelsheet(0,1 );  //Data geting from excel sheet
		log.username(uname);
		System.out.println("Succefully entered Username into username field");
		String pward=ExcelDataProvider.getdataproviderExcelsheet(1, 1);  //Data Getting from excel sheet
		log.password(pward);
		System.out.println("Succefully entered password into password field");
		log.signInbtn();
		System.out.println("Succefully Clicked on SignIN button");

		Thread.sleep(3000);
		log.forgotpassword();                    //click on forgot password link
		System.out.println("Clicked on forgot password link");
		
		String mnum=ExcelDataProvider.getdataproviderExcelsheet(2,1);   //Data getting from excel sheet
		log.enterMobilenumer(mnum);                    //Enter Number into textbox
		System.out.println("Entered mobile number into text box");
		Thread.sleep(2000);
		
		log.click_onbproceedbtn();                //Click on proceed button
		System.out.println("Clicked on Proceed button");
		Thread.sleep(2000);
		log.clickon_retuntto_login();            //Click on return to login btn
		System.out.println("Clicked on Return to login button");
		Thread.sleep(2000);
		
		log.signUpclick();                    //Click on Sign Up Link
		System.out.println("Clicked on signUP button and Navigated");
		String singmobile=ExcelDataProvider.getdataproviderExcelsheet(3,1);
		log.EnterMobile_no(singmobile);
		System.out.println("Entered mobile number");
		Thread.sleep(2000);
		String emailid=ExcelDataProvider.getdataproviderExcelsheet(4,1);
		log.Enter_EmailId(emailid);
		System.out.println("Entered EmailID number");
		Thread.sleep(2000);
		log.Click_on_GenerateOPT();
		System.out.println("Clicked on generate OTP");
		log.Clickon_Already_have_An_account_login();
		System.out.println("navigated Return to login page");
//		log.Click_on_Terms_Condition();                                  //Click on terms and condition
//	    log.Click_on_Privacy_Policy();                                   //Click on Privacy policy 
//		
		
		Thread.sleep(3000);
	
		}
	
  @AfterMethod
  public void ss(ITestResult result) throws IOException {
	  if(ITestResult.FAILURE==result.getStatus()) {
			Screenshot.screenshot();
		}
  }
	
	
	
}
