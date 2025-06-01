package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {

	@Test
	public void verifyWhethertheUsercannavigatetoAdminuserspage() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickonAdminusersicon();
	}

	@Test
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
		String newadminusername = ExcelUtility.getStringData(0, 0, "AdminUsersPage");
		String newadminuserspassword = ExcelUtility.getStringData(0, 1, "AdminUsersPage");
		adminuserspage.enterUserNameonAdminUsersUserNameField(newadminusername);
		adminuserspage.enterPasswordOnAdminUsersPasswordField(newadminuserspassword);
		adminuserspage.selectTheUserType();
		adminuserspage.clickOnSaveButton();
	}

	@Test
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
		adminuserspage.clickonAdminUsersResetLink();
	}

}
