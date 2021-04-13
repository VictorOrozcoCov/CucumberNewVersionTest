package com.testproject.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.Properties;

public class PropertiesHelper {
	
	ApiHelper base;
	
	PropertiesHelper(ApiHelper base){
		this.base = base;
	}

	public static void getProperty(String propertyName) throws Throwable{
		Properties prop = new Properties();
		// load a properties file
		InputStream configFile = new FileInputStream("src/test/resources/config.properties");
		prop.load(configFile);
		
		// get value by key
		prop.getProperty(propertyName);
		
	}
	
	public static void setProperty(String propertyName, String value) throws Throwable{
		OutputStream configFile = new FileOutputStream("src/test/resources/config.properties");
        Properties prop = new Properties();

        // set the properties value
        //prop.setProperty("db.url", "localhost");
        prop.setProperty(propertyName, value);
        
        // save properties to project root folder
        prop.store(configFile, null);

        //System.out.println(prop);
	}
	
	/*public static void setProperty(Map<String,String> propertiesFile) throws Throwable{
		OutputStream configFile = new FileOutputStream("src/test/resources/config.properties");
		Properties prop = new Properties();
		
		// set the properties value
		//prop.setProperty("db.url", "localhost");
		for(int i=0;i<=propertiesFile.size();i++) {
			prop.setProperty(propertiesFile.keySet(),propertiesFile.values());
		}
		
		// save properties to project root folder
		prop.store(configFile, null);
		
		System.out.println(prop);
	}*/
	
	
}
