package testScript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import automationCore.Base;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(description = "verifying user can successfully enter the new category details")
	public void verifyWhetherTheUserCanEnterTheNewCategoryDetails() throws IOException, AWTException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickOnManageCategoryLink();
		managecategorypage.clickOnNewCategoryAddIcon();
		String newcategoryname = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterNewnameOnCategoryField(newcategoryname);
		managecategorypage.clickOnSelectGroupstoSelectGroup();
		managecategorypage.clickOnTheFileUploadLink();
		managecategorypage.clickOnTheShowOnTopMenuAndShowOnLeftMenuRadioButton();
		managecategorypage.clickonTheNewCategorySaveButton();
	}

	@Test(description = "verifying user can successfully search the category details")
	public void verifywhetherUsercanSearchTheCategoryDetails() throws IOException {
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnSubmitButton();
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.clickOnManageCategoryLink();
		managecategorypage.clickonCategorySearchIcon();
		String newcategorysearchname = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterCategoryNameOnCategorySearchField(newcategorysearchname);
		managecategorypage.clickOnCategorySearchButton();
	}

}
