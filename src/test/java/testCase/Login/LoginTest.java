package testCase.Login;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.LoginPage;
import com.testBase.TestBase;


public class LoginTest extends TestBase {
	LoginPage loginP;

	@BeforeTest
	public void beforeTest() {
	getDriver();
	}
	
	@Test(priority=1) 
	 public void verifyLoginWithCreadentials() throws InterruptedException
	 {  
		Properties properties=getProp();
		String username=properties.getProperty("AdminUname");
		System.out.println(username);
		String password=properties.getProperty("Adminpasswd");
		System.out.println(password);
		loginP = new LoginPage(driver);
		loginP.loginOperation(username,password);

	 }
	
}
