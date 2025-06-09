package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {

	@Test(description="verifying user can successfully logout")
	public void VerifywheatherUserCanSuccessfullyLogout() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		HomePage homepage = new HomePage(driver);
		homepage.clickonAdminicon();
		homepage.clickonLogoutIcon();

	}

}
