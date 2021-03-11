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
		String filePath = System.getProperty("user.dir") + "\\src\\test\\resources\\configFiles\\config.properties" ;
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

		//String browser= getProp().getProperty("browser");
		 //= properties.getProperty("browser");
		String URL = getProp().getProperty("application.url");
		//String geckoDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\driverFiles\\" + getProp().getProperty("gecko.driver.path");
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\driverFiles\\" + getProp().getProperty("chrome.driver.path");
		System.setProperty("webdriver.chrome.driver", chromeDriverPath);
		driver=new ChromeDriver();
		
	/*	if (browser.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver", geckoDriverPath);

			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("-enablePassThrough", true);

			driver = new FirefoxDriver();
			
		} */
		/*if (browser.equalsIgnoreCase("CHROME")) {

			System.setProperty("webdriver.chrome.driver", "D:\\Abhijeet\\WebAutomations\\OrangeHRM\\src\\test\\resources\\driverFiles\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();*/
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("--test-type");
//			options.addArguments("disable-infobars");
//			// options.addArguments("--headless");
//
//			HashMap<String, Object> prefs = new HashMap<String, Object>();
//			prefs.put("plugins.always_open_pdf_externally", true);
//			prefs.put("profile.default_content_setting_values.automatic_downloads", 1);
//
//			prefs.put("download.prompt_for_download", false);
//
//			options.setExperimentalOption("prefs", prefs);
//
//			DesiredCapabilities cap = DesiredCapabilities.chrome();
//
//			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//			cap.setCapability(ChromeOptions.CAPABILITY, options);
//
//			driver = new ChromeDriver(cap);
			
	//	} 
		driver.get(URL);
		driver.manage().window().maximize();
		// Dimension dim = new Dimension(1366, 768);
		// driver.manage().window().setSize(dim);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().deleteAllCookies();
		
		return driver;
	}

}
