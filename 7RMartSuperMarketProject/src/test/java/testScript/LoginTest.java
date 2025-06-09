package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {

	@Test(description="verifying successful user login with valid credentials",priority=1)
	public void VerifyUserLoginWithValidCredentials() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
	}

	@Test(description="verifying user login with valid username and invalid password",priority=2)
	public void VerifyUserLoginWithValidUserNameandInValidpassword() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
	}

	@Test(description="verifying user login with invalid username and valid password",priority=3)
	public void VerifyUserLoginWithInValidUserNameandValidpassword() throws IOException {
		String username = ExcelUtility.getStringData(2, 0, "LoginPage");
		String password = ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
	}

	@Test(description="verifying user login with invalid username and invalid password",priority=4)
	public void VerifyUserLoginWithInValidUserNameandInValidpassword() throws IOException {
		String username = ExcelUtility.getStringData(3, 0, "LoginPage");
		String password = ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
	}
}
