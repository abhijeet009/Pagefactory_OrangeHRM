package testCase.Login;

import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.AdduserPage;
import com.testBase.TestBase;

public class AdduserTest extends TestBase {

	AdduserPage addP= new AdduserPage(driver);
	
	@Test 
	private void AddEmloyee() throws InterruptedException {
		Properties properties=getProp();
		String addFname = properties.getProperty("firstName");
		String addMname = properties.getProperty("middleName");
		String addLname= properties.getProperty("lastName");
		String uname= properties.getProperty("accUserName");
		String upass= properties.getProperty("accUserPassword");
		String cuPass= properties.getProperty("accRePassword");
		
		addP.createEmployee(addFname, addMname, addLname, uname, upass, cuPass);
		
	}
}
