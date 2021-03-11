package com.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	

	WebDriver driver;
	public static final Logger logger=Logger.getLogger(LoginPage.class.getName());
	
	@FindBy(id="txtUsername")
	WebElement adminUserName;
	
	@FindBy(id="txtPassword")
	WebElement adminPass;
	
	@FindBy(id="btnLogin")
	WebElement btnLogin;
	
	@FindBy(id = "menu_dashboard_index")
	WebElement dashAssert;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginOperation (String DynamicUserName,String DynamicadminPass) throws InterruptedException {
		Thread.sleep(1500);
		adminUserName.sendKeys(DynamicUserName);
		logger.info("Added User Name is -->"+adminUserName);
		adminPass.sendKeys(DynamicadminPass);
		Thread.sleep(10000);
		logger.info("Added password is -->"+adminPass);
		btnLogin.click();
		Thread.sleep(10000);
		//Assert.assertEquals(actual, expected);
		if(dashAssert.isDisplayed())
		{
			logger.info("login sucess");
		}
		logger.info("Admin login is success...");
		Thread.sleep(1500);
	}
}