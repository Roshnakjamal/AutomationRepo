package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test(description = "Verifying user can add new admin user", retryAnalyzer = retry.Retry.class) // retry mechanism
	public void verifyWhethertheUsercanaddNewAdminuser() throws IOException {
		HomePage homepage;
		AdminUsersPage adminpage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnSubmitButton();

		adminpage = homepage.clickonAdminusersicon();
		adminpage.clickonnewAdminusersicononAdminuserspage();
//		String newadminusername = ExcelUtility.getStringData(0, 0, "AdminUsersPage");
//		String newadminuserspassword = ExcelUtility.getStringData(0, 1, "AdminUsersPage");
		FakerUtility faker = new FakerUtility();
		String newadminusername = faker.createRandomUserName();
		String newadminuserspassword = faker.createRandomPassword();
		adminpage.enterUserNameonAdminUsersUserNameField(newadminusername)
				.enterPasswordOnAdminUsersPasswordField(newadminuserspassword).selectTheUserType().clickOnSaveButton();
		boolean isusercreatedalertdispalyed = adminpage.userCreatedAlertMessageDisplayed();
		Assert.assertTrue(isusercreatedalertdispalyed, Messages.ADDNEWADMINUSERERROR);
	}

	@Test(description = "Verifying user can search the new admin user",retryAnalyzer = retry.Retry.class)
	public void verifywhetherUsercanSearchthenewlyaddedUser() throws IOException {
		HomePage homepage;
		AdminUsersPage adminpage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnSubmitButton();
		adminpage = homepage.clickonAdminusersicon();
		adminpage.clickonnewAdminusersicononAdminuserspage().clickonAdminUsersSearchIcon();
		String newadminusernamesearch = ExcelUtility.getStringData(0, 0, "AdminUsersPage");
		adminpage.enterUserNameonadminUsersSearchUserNameField(newadminusernamesearch)
				.enterUserNameonadminUsersSearchUsertype().clickonAdminUsersSearchButton();
		boolean isuseronthesearchpage = adminpage.searchPageTitileDisplayed();
		Assert.assertTrue(isuseronthesearchpage, Messages.ADMINUSERSEARCHERROR);

	}

}
