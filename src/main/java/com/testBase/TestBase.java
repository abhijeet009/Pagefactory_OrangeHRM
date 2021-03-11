package com.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestBase {
	
	//private DriverFactory driverFactory;
	//private static Properties CONFIG = PropertyHelper.getConfig("config.properties");
	public WebDriver driver = null;
	
	// Get prorerty
	public Properties getProp()
    {
      //  File file = new File("Configuration//config.properties");
		String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\configFiles\\config.properties" ;
		
        File file= new File(filePath);
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Properties properties = new Properties();
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
	 
	public WebDriver getDriver() {

		String URL = getProp().getProperty("application.url");
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\driverFiles\\" + getProp().getProperty("chrome.driver.path");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		return driver;
	}

}
