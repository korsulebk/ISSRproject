package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataProvider {
	
	public static String getdataproviderExcelsheet(int row,int cell) throws Exception, IOException {
		String data;
		
		FileInputStream excel=new FileInputStream(".\\Excel_TestData\\CSBC_TestDATA.xlsx");

	    Sheet sheet=WorkbookFactory.create(excel).getSheet("Login");
	 try {
		 data=sheet.getRow(row).getCell(cell).getStringCellValue();
	 }catch(Exception e) {
		 
		long intdata=(long) sheet.getRow(row).getCell(cell).getNumericCellValue();
		
		data=""+intdata;
	 }
	return data;
	}
	
	
}
