package TestClasses;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Utility.BaseClass;

public class Screenshot extends BaseClass {
	
	 public static void screenshot() throws IOException {
//		  Date Currentdate=new Date();
//		  String a=Currentdate.toString().replace(":","");
		  File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  File d=new File(".\\ScreenShot\\.png");
		  FileUtils.copyFile(s, d);
	  }

}
