package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import automationCore.Base;
import constants.Messages;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;

public class ManageCategoryTest extends Base {

	@Test(description = "verifying user can successfully enter the new category details")
	public void verifyWhetherTheUserCanEnterTheNewCategoryDetails() throws IOException, AWTException {
		HomePage homepage;
		ManageCategoryPage managecategorypage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username).enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnSubmitButton();

		managecategorypage = homepage.clickOnManageCategoryLink();
		managecategorypage.clickOnNewCategoryAddIcon();
		String newcategoryname = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterNewnameOnCategoryField(newcategoryname).clickOnSelectGroupstoSelectGroup()
				.clickOnTheFileUploadLink().clickOnTheShowOnTopMenuAndShowOnLeftMenuRadioButton()
				.clickonTheNewCategorySaveButton();
		boolean iscategorycreatedalertdisplayed = managecategorypage.categorycreatedalertmessagedisplayed();
		Assert.assertTrue(iscategorycreatedalertdisplayed, Messages.ADDNEWCATEGORYERROR);
	}

	@Test(description = "verifying user can successfully search the category details",retryAnalyzer = retry.Retry.class)
	public void verifywhetherUsercanSearchTheCategoryDetails() throws IOException {
		HomePage homepage;
		ManageCategoryPage managecategorypage;
		String username = ExcelUtility.getStringData(0, 0, "LoginPage");
		String password = ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		homepage = loginpage.clickOnSubmitButton();
		managecategorypage = homepage.clickOnManageCategoryLink();
		managecategorypage.clickonCategorySearchIcon();
		String newcategorysearchname = ExcelUtility.getStringData(0, 0, "ManageCategoryPage");
		managecategorypage.enterCategoryNameOnCategorySearchField(newcategorysearchname).clickOnCategorySearchButton();
		boolean iscategorytitlepagedisplayed = managecategorypage.categorysearchpagetitledisplayed();
		Assert.assertTrue(iscategorytitlepagedisplayed, Messages.CATEGORYSEARCHERROR);
	}

}
