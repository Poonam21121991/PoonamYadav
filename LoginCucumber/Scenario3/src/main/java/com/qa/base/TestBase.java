package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {
	
	
	public static final int status_204 = 204;
	public static final int status_401 = 401;
	public static final int status_201 = 201;
	public static final int status_404 = 404;
	
	public Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//qa//config/config.properties");
			prop.load(ip);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
