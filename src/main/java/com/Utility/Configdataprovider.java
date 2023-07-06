package com.Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configdataprovider {
	
	Properties pro;
	public Configdataprovider() throws IOException {
		String  path =".\\Config\\Config.Properties";
		FileInputStream file=new FileInputStream(path);
	    pro=new Properties();
		pro.load(file);
	}
	public String getBaseural_01() {
		return  pro.getProperty("Baseural_01");

}
}
