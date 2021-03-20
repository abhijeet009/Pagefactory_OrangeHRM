package com.page;

import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	static String abc = "ABC";

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Abhijeet\\WebAutomations\\OrangeHRM\\src\\main\\resources\\driverFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("http://www.google.com/");
        driver.quit();

	
	}

}
