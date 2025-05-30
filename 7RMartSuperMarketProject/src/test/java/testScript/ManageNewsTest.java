package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base {

	@Test
	public void verifyWhethertheUsercannavigatetoManageNewspage() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.clickOnManageNewsLink();
	}

	@Test
	public void verifyWhethertheUsercanaddNewNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.clickOnManageNewsLink();
		managenews.clickOnNewManageNewsIcon();
		String newnews = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		managenews.enterNewsonNewManageNewsField(newnews);
		managenews.clickOnNewnewsSaveIcon();
	}

	@Test
	public void verifywhetherUserCanSearchNews() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		ManageNewsPage managenews = new ManageNewsPage(driver);
		managenews.clickOnManageNewsLink();
		managenews.clickManageNewsSearchIcon();
		String newnews = ExcelUtility.getStringData(0, 0, "ManageNewsPage");
		managenews.enterNewsOnManageNewsSearchField(newnews);
		managenews.clickOnManageNewsSearchButton();
		managenews.clickOnManageNewsResetIcon();

	}

}
