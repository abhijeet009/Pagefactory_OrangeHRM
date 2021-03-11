package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "G:\\Abhijeet_Testing\\eclipse_workspace\\OrangeHRM\\Pagefactory_OrangeHRM\\src\\main\\resources\\driverFiles\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	      driver.get("http://www.google.com/");
        driver.quit();
    }	
}
