//This Package is to add all the generic methods not related to application

package com.qa.util;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigValues {
	public Properties prop;//global variable
	int[] deckSize;
	String x,a;
	int y,z,b;
	public ConfigValues() throws Exception{
	prop = new Properties();	
	FileInputStream ip = new FileInputStream("C:/Users/ramya/workspace/selenium/GOGO/src/main/java/com/qa/config/card.properties");
     prop.load(ip);
	}
		
	public  int getValue(String property){
	    x = prop.getProperty(property);
	 	y= Integer.parseInt(x);
	 	return y;
		
	}
	
	public int CardRemove(){
		x = prop.getProperty("Remove");
	 	y= Integer.parseInt(x);
	 	z = 52 - y;
	 	return z;
	}
}


