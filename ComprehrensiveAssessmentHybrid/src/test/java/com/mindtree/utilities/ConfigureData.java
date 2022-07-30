package com.mindtree.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigureData {

	Properties pro;

	public ConfigureData() {
		pro = new Properties();

		try {
			FileInputStream fis = new FileInputStream("./PropertyFile/CA.properties");
			pro.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		return pro.getProperty("browser");	
	}
	
	public String getUrl() {
		return pro.getProperty("url");
	}
}
