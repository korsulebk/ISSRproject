package TestClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Eventpage {
	
	@Test
	public void searchevent() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://csbc.consisty.com/event");
		driver.manage().window().maximize();
		
		String year = "2020";   
		String month = "May";
		String date = "15";
driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw']")).click();
Thread.sleep(5000);
		while (true) {    //it will always be true								//xpath for getting month year present in date picker
			String monthyear = driver.findElement(By.xpath("(//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf'])[1]")).getText();
			String arr[] = monthyear.split(" ");		//split=the space between the month year (April 2023)
			String mon = arr[0];   //to month year in two different variable 
			String yr = arr[1];

			if (mon.equalsIgnoreCase(month) && yr.equals(year))
				break;							//break =to come out of loop when its true
			else
			driver.findElement(By.xpath("//button[@title='Previous month']")).click();
		}
		List<WebElement> alldates = driver.findElements(By.xpath("//button[@role='gridcell']"));		//Date selection

		for (WebElement ele : alldates) {
			String dt = ele.getText();

			if (dt.equals(date)) {
				ele.click();
				break;
			}
		}
		Thread.sleep(2000);
		String year1="2022";
		String month1="June";
		String date1="21";
driver.findElement(By.xpath("(//button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-edgeEnd MuiIconButton-sizeMedium css-slyssw'])[2]")).click();
Thread.sleep(4000);
while(true) {
	String month1year1=driver.findElement(By.xpath("(//div[@class='MuiPickersFadeTransitionGroup-root css-1bx5ylf'])[1]")).getText();
	String arr1[]= month1year1.split(" ");
	String mon1 = arr1[0];
	String yr1 = arr1[1];
	
	if(mon1.equalsIgnoreCase(month1) && yr1.equals(year1))
			break;
	else
		driver.findElement(By.xpath("//button[@title='Previous month']")).click();}  //for previous month
List<WebElement> alldates1 = driver.findElements(By.xpath("//button[@role='gridcell']"));		//Date selection

for (WebElement ele1 : alldates1) {
	String dt1 = ele1.getText();

	if (dt1.equals(date1)) {
		ele1.click();
		break;
	}
}
	
	
}
		
		
		
		
		
		
	}


