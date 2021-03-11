package com.page;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AdduserPage {
	
	WebDriver driver;
	public static final Logger logger=Logger.getLogger(LoginPage.class.getName());
	@FindBy(id = "menu_pim_viewPimModule")
	WebElement pimMod;
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	WebElement employeeClick;
	
	@FindBy (id="btnAdd")
	WebElement addEMPclick;
	
	@FindBy (id = "firstName")
	WebElement addFname;
	
	@FindBy (id = "middleName")
	WebElement addMname;
	
	@FindBy(id = "lastName")
	WebElement addLname;
	
	@FindBy(id = "photofile")
	WebElement profilepic;
	
	@FindBy (id = "chkLogin")
	WebElement checkboxLogin;
	
	@FindBy(id = "user_name")
	WebElement uname;
	
	@FindBy(id = "user_password")
	WebElement upass;
	
	@FindBy (id = "re_password")
	WebElement cuPass;
	
	@FindBy(id = "btnSave")
	WebElement clickbtnSave;
	
	public void createEmployee(String addFname,String addMname,String addLname,String uname,String upass,String cuPass) throws InterruptedException {
		Thread.sleep(1500);
		Actions builder = new Actions(driver);
		builder.moveToElement(pimMod).perform();
		logger.info("mouse hover on "+pimMod.toString());
		employeeClick.click();
		Thread.sleep(1500);
		addEMPclick.click();
		this.addFname.sendKeys(addFname);
		logger.info("first name :"+addFname);
		this.addMname.sendKeys(addMname);
		logger.info("Middle Name"+addMname);
		this.addLname.sendKeys(addLname);
		logger.info("Last Name"+addLname);
		profilepic.sendKeys(("user.dir") + "\\src\\test\\resources\\configFiles\\download.jpg");
		logger.info("added profile file");
		this.uname.sendKeys(uname);
		this.upass.sendKeys(upass);
		this.cuPass.sendKeys(cuPass);
		Thread.sleep(1500);
		clickbtnSave.click();
	}
	
}
