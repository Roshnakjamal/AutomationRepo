package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(description = "Verifying successful user login with valid credentials", priority = 1, groups = { "smoke" })
	public void verifyUserLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		boolean isdashboarddisplayed = loginpage.dashboardTileDisplayed();
		Assert.assertTrue(isdashboarddisplayed, Messages.VALIDCREDENTIALERROR);// put error messagein assert true
//		String expected="Dashboard";
//		String actual=loginpage.getdashboardtext();
//		Assert.assertEquals(actual, expected,"User was unable to login with valid credentials");
	}

	@Test(description = "Verifying user login with valid username and invalid password", priority = 2)
	public void verifyUserLoginWithValidUserNameandInValidpassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		boolean isalertmessagedisplayed = loginpage.alertMessageDisplayed();
		Assert.assertTrue(isalertmessagedisplayed, Messages.INVALIDCREDENTIALERROR);
//		 boolean isdashboardDisplayed=loginpage.dashboardTileDisplayed();
//		 Assert.assertFalse(isdashboardDisplayed,"User was able to login with invalid password");//put error message
// If isdashboardDisplayed is actually false, the assertion passes, so the message will not appear. Assertion messages only appear on failure.
	}

	@Test(description = "Verifying user login with invalid username and valid password", priority = 3)
	public void verifyUserLoginWithInValidUserNameandValidpassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		boolean isalertmessagedisplayed = loginpage.alertMessageDisplayed();
		Assert.assertTrue(isalertmessagedisplayed, Messages.INVALIDCREDENTIALERROR);
	}

	@Test(description = "Verifying user login with invalid username and invalid password", priority = 4, groups = {
			"smoke" }, dataProvider = "logindata")
	public void verifyUserLoginWithInValidUserNameandInValidpassword(String username, String password)
			throws IOException {
//		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
//		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		boolean isalertmessagedisplayed = loginpage.alertMessageDisplayed();
		Assert.assertTrue(isalertmessagedisplayed, Messages.INVALIDCREDENTIALERROR);
	}

	// Dataprovider usage in testcase
	@DataProvider(name = "logindata")
	public Object[][] getDataFromDataProvider() throws IOException {
		return new Object[][] { new Object[] { "test", "test1" }, new Object[] { "test1", "test2" }, new Object[] {
				ExcelUtility.getStringData(3, 0, "LoginPage"), ExcelUtility.getStringData(3, 1, "LoginPage") } };
	}

}
