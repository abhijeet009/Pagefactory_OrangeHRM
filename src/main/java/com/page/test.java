package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

public static void main(String[] args) {
        
        //Creating a driver object referencing WebDriver interface
	 //driver =null;
        
        //Setting webdriver.gecko.driver property
    	//String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\driverFiles\\" + getProp().getProperty("chrome.driver.path");
		System.setProperty("webdriver.chrome.driver", "D:\\Abhijeet\\WebAutomations\\OrangeHRM\\src\\test\\resources\\driverFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
        driver.get("https://artoftesting.com");
        driver.quit();
    }	
}
