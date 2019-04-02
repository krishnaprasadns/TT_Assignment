package com.orangehrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
	
	public static String getPropertyValue(String key){
		String value="";
		String configFilePath = System.getProperty("user.dir")  + "\\Config.properties";
		File file = new File(configFilePath);
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileInput);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}
	
}
