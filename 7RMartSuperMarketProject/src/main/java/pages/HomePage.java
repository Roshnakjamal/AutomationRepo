package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;
import utilities.WaitUtility;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//img[@src=\"https://groceryapp.uniqassosiates.com/public/assets/admin/dist/img/avatar5.png\"]")
	private WebElement adminlink;
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/logout\"]")
	private WebElement logoutlink;
	@FindBy(xpath = "//i[@class=\"fas fa-arrow-circle-right\"]")
	private WebElement adminuserslink;
	@FindBy(xpath = ("//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news'and@class='small-box-footer']"))
	private WebElement manageNewslink;
	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-category\"]")
	WebElement managecategorylink;

	public HomePage clickonAdminicon() {
		adminlink.click();
		return this;
	}

	public LoginPage clickonLogoutIcon() {
		logoutlink.click();
		return new LoginPage(driver);
	}

	public AdminUsersPage clickonAdminusersicon() {
		adminuserslink.click();
		return new AdminUsersPage(driver);
	}

	public ManageNewsPage clickOnManageNewsLink() {
		PageUtility scrolltoview = new PageUtility();
		scrolltoview.elementscrollintoview(manageNewslink);
		return new ManageNewsPage(driver);
	}

	public ManageCategoryPage clickOnManageCategoryLink() {
		managecategorylink.click();
		return new ManageCategoryPage(driver);
	}

}
