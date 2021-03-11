package com.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssignRole {
	WebDriver driver;
	public static final Logger logger=Logger.getLogger(LoginPage.class.getName());
	
	@FindBy(id = "menu_admin_viewAdminModule")
	WebElement btnAdmin ;
	
	@FindBy(id = "btnAdd")
	WebElement btnAddUser;
	
	@FindBy(id = "systemUser_employeeName_empName")
	WebElement eName;
	
	@FindBy(id="systemUser_userName")
	WebElement uName;
	
	@FindBy(id = "systemUser_password")
	WebElement passWord;
	
	@FindBy(id = "systemUser_confirmPassword")
	WebElement cPasswd;
	
	@FindBy(id = "btnSave")
	WebElement btnsSave;
	
	public void registerEmployee(String firstName,String lastName,String accUserName,String accUserPass,String accRePass) throws InterruptedException
	{  
		/*Thread.sleep(1500);
		Addfirstname.sendKeys(firstName);
		logger.info("first name is entered.." +Addfirstname.toString());
		Thread.sleep(1500);
		AddlastName.sendKeys(lastName);
		logger.info("last name is entered.."+AddlastName.toString());
		Thread.sleep(1500);
		checkLogincheckBox.click();
		logger.info("check login box.. "+checkLogincheckBox.toString());
		Thread.sleep(1500);
	    this.accUserName.sendKeys(accUserName);
	    logger.info("accUserName is entered.." +accUserName.toString());
		Thread.sleep(1500);
		this.accUserPassword.sendKeys(accUserPass);
		logger.info("accPassword is entered.. "+accUserPassword.toString());
		this.accRePassword.sendKeys(accRePass);
		logger.info("acc confirm password is entered.. "+accRePassword.toString());
		Thread.sleep(1500);
	    btnSaveLoginDetails.click();
		logger.info("Add Employee login details has benn saved.. "+btnSaveLoginDetails.toString());
		Thread.sleep(2500);*/
	}
}
