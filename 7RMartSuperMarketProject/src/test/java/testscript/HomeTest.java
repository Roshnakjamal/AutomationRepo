package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {

	@Test(description = "Verifying user can successfully logout")
	public void verifywheatherUserCanSuccessfullyLogout() throws IOException {
		HomePage homepage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnSubmitButton();
		homepage.clickonAdminicon();
		loginpage = homepage.clickonLogoutIcon();
		boolean isloginpagemessagedispalyed = loginpage.loginPageTitleboxDisplayed();
		Assert.assertTrue(isloginpagemessagedispalyed, Messages.LOGOUTERROR);
	}

}
