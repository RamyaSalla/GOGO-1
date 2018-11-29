//This Package is to add all the generic methods not related to application

package com.qa.util;
import java.io.FileInputStream;

import java.util.Properties;

public class ConfigValues {
	public Properties prop;//global variable
	//int[] deckSize;
	String x;
	int y,z,b,a;
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
	
	public int TotalCards()
	{
		x = prop.getProperty("TotalDeck");
		y= Integer.parseInt(x);
		return y;
		
	}
	
	public int CardRemove(){
		y = TotalCards();
		x = prop.getProperty("Remove");
	    a = Integer.parseInt(x);
	 	b = y - a;
	 	return b;
	}
}


