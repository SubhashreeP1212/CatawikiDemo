package Utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties properties;
    
	private final String propertyFilePath= "./Config.properties";
	
	public  void config(){
    	FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(propertyFilePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 properties = new Properties();
		
		//load properties file
		try {
			properties.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		
	}
		
		}
	
	//Getting the browser details
	public  String getbrowser() {
		config ();
		String browser=properties.getProperty("browser");
		return browser;
	}
	
	//Getting the URL
	public String geturl() {
		config ();
		String url=properties.getProperty("url");
		return url;
	}
	
	//Getting the Searchtext
	public String getsearchText() {
		config ();
		String searchText=properties.getProperty("searchText");
		return searchText;
		
	}
	
	//Getting the expectedTitle
	public String getexpectedtitle() {
		config ();
		String expectedTitle=properties.getProperty("expectedTitle");
		return expectedTitle;
		
	}
}
