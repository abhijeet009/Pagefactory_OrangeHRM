/*package com.main.factory;

import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.training.helper.PropertyHelper;

public class DriverFactory {
	
	private static Properties CONFIG = PropertyHelper.getConfig("config.properties");
	private WebDriver driver = null;
	
	public WebDriver getDriver() {

		String browser = CONFIG.getProperty("browser");

		String geckoDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\driverFiles\\" + CONFIG.getProperty("gecko.driver.path");
		String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\driverFiles\\" + CONFIG.getProperty("chrome.driver.path");

		if (browser.equalsIgnoreCase("FIREFOX")) {
			System.setProperty("webdriver.gecko.driver", geckoDriverPath);

			FirefoxOptions options = new FirefoxOptions();
			options.addPreference("-enablePassThrough", true);

			driver = new FirefoxDriver();
			
		} else if (browser.equalsIgnoreCase("CHROME")) {

			System.setProperty("webdriver.chrome.driver", chromeDriverPath);

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--test-type");
			options.addArguments("disable-infobars");
			// options.addArguments("--headless");

			HashMap<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("plugins.always_open_pdf_externally", true);
			prefs.put("profile.default_content_setting_values.automatic_downloads", 1);

			prefs.put("download.prompt_for_download", false);

			options.setExperimentalOption("prefs", prefs);

			DesiredCapabilities cap = DesiredCapabilities.chrome();

			cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			cap.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(cap);

		} 

		driver.manage().window().maximize();
		// Dimension dim = new Dimension(1366, 768);
		// driver.manage().window().setSize(dim);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		return driver;

	}

}
*/