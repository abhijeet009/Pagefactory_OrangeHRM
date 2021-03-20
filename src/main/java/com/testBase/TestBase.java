package com.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class TestBase {

	// private DriverFactory driverFactory;
	// private static Properties CONFIG =
	// PropertyHelper.getConfig("config.properties");

	public static WebDriver driver;
	public static Properties prop;
	public  static EventFiringWebDriver e_driver;
	//public static WebDriverListener eventListener;
	
	public TestBase() {
		try {
			prop = new Properties();
			String filePath = System.getProperty("user.dir") + "\\src\\main\\resources\\configFiles\\config.properties";
			File file = new File(filePath);
			FileInputStream fileInputStream = null;
			fileInputStream = new FileInputStream(file);
			prop.load(fileInputStream);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("deprecation")
	public void getDriver() {

		
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\main\\resources\\driverFiles\\"
				+ prop.getProperty("chrome.driver.path");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		System.out.println(chromeDriverPath);
		driver = new ChromeDriver();
		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with EventFiringWebDriver
		//eventListener = new WebEventListener();
	//	e_driver.register((WebDriverEventListener) eventListener);
		driver = e_driver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(prop.getProperty("application.url"));
	}

}
