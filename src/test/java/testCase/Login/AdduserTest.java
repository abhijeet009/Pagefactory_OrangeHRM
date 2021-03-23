package testCase.Login;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.page.AdduserPage;
import com.page.LoginPage;
import com.testBase.TestBase;

public class AdduserTest extends TestBase {
	LoginPage lp;
	AdduserPage addP;

	public AdduserTest() {
		super();
	}
	@BeforeClass
	public void setup() throws InterruptedException {
		getDriver();
		lp = new LoginPage();
		addP=lp.loginOperation(prop.getProperty("AdminUname"), prop.getProperty("Adminpasswd"));
	}
	
	@Test(priority = 0)
	public void navigateToemp() throws Exception {
		addP.navigateToempinfo();
	}
	
	@Test(priority = 1)
	public void verifyNavigation() {
		addP.verifyEmpPage();
	}
	
	@Test(priority = 2)
	private void AddEmloyee() throws InterruptedException {
		
		String addFname = prop.getProperty("firstName");
		String addMname = prop.getProperty("middleName");
		String addLname = prop.getProperty("lastName");
		String uname = prop.getProperty("accUserName");
		String upass = prop.getProperty("accUserPassword");
		String cuPass = prop.getProperty("accRePassword");
		String gender= prop.getProperty("gender");
		String mStatus= prop.getProperty("maritial");
		String sNationality= prop.getProperty("nationality");
		String dateObirth= prop.getProperty("dob");
		try {
			//addP.createEmployee(prop.getProperty("firstName"), prop.getProperty("middleName"), prop.getProperty("lastName"), prop.getProperty("accUserName"), prop.getProperty("accUserPassword"), prop.getProperty("accRePassword"));
			addP.createEmployee(addFname, addMname, addLname, uname, upass, cuPass,gender,mStatus,sNationality,dateObirth);
		} catch (Throwable e) {

			e.printStackTrace();
		}
	}
	
	@Test(priority = 3)
	private void addJobDetails() throws InterruptedException {
		
		String job= prop.getProperty("job");
		
		addP.addJobDetals(job);
		
		
	}
}
