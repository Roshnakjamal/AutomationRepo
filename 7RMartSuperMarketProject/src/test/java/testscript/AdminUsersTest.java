package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {

	@Test(description = "Verifying user can add new admin user", retryAnalyzer = retry.Retry.class) // retry mechanism
	public void verifyWhethertheUsercanaddNewAdminuser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickonAdminusersicon();
		adminuserspage.clickonnewAdminusersicononAdminuserspage();
//		String newadminusername = ExcelUtility.getStringData(0, 0, "AdminUsersPage");
//		String newadminuserspassword = ExcelUtility.getStringData(0, 1, "AdminUsersPage");
		FakerUtility faker = new FakerUtility();
		String newadminusername = faker.createRandomUserName();
		String newadminuserspassword = faker.createRandomPassword();
		adminuserspage.enterUserNameonAdminUsersUserNameField(newadminusername);
		adminuserspage.enterPasswordOnAdminUsersPasswordField(newadminuserspassword);
		adminuserspage.selectTheUserType();
		adminuserspage.clickOnSaveButton();
		boolean isusercreatedalertdispalyed = adminuserspage.userCreatedAlertMessageDisplayed();
		Assert.assertTrue(isusercreatedalertdispalyed, Messages.ADDNEWADMINUSERERROR);
	}

	@Test(description = "Verifying user can search the new admin user")
	public void verifywhetherUsercanSearchthenewlyaddedUser() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickonAdminusersicon();
		adminuserspage.clickonnewAdminusersicononAdminuserspage();
		adminuserspage.clickonAdminUsersSearchIcon();
		String newadminusernamesearch = ExcelUtility.getStringData(0, 0, "AdminUsersPage");
		adminuserspage.enterUserNameonadminUsersSearchUserNameField(newadminusernamesearch);
		adminuserspage.enterUserNameonadminUsersSearchUsertype();
		adminuserspage.clickonAdminUsersSearchButton();
		boolean isuseronthesearchpage = adminuserspage.searchPageTitileDisplayed();
		Assert.assertTrue(isuseronthesearchpage, Messages.ADMINUSERSEARCHERROR);

	}

}
