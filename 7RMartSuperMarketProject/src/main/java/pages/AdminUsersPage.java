package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;
import utilities.WaitUtility;

public class AdminUsersPage {

	public WebDriver driver;

	public AdminUsersPage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@onclick=\"click_button(1)\"]")
	private WebElement newadminuserlink;
	@FindBy(xpath = "//input[@id=\"username\"]")
	private WebElement adminusersnamefield;
	@FindBy(xpath = "//input[@id=\"password\"]")
	private WebElement adminuserspasswordfield;
	@FindBy(xpath = "//select[@id=\"user_type\"]")
	private WebElement usertypefield;
	@FindBy(xpath = "//button[@name=\"Create\"]")
	private WebElement adminuserssave;
	@FindBy(xpath = "//a[@onclick=\"click_button(2)\"]")
	private WebElement adminuserssearch;
	@FindBy(xpath = "//input[@id=\"un\"and@class=\"form-control\"]")
	private WebElement adminuserssearchusernamefield;
	@FindBy(xpath = "//select[@id=\"ut\"]")
	private WebElement adminuserssearchusertype;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger'and@value='sr']")
	private WebElement adminuserssearchbutton;
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement usercreatedalertmessage;
	@FindBy(xpath = "//h1[text()=\"Admin Users\"]")
	private WebElement usersearchpagetitle;

	public AdminUsersPage clickonnewAdminusersicononAdminuserspage() {
		newadminuserlink.click();
		return this;

	}

	public AdminUsersPage enterUserNameonAdminUsersUserNameField(String newAdminusername) {
		adminusersnamefield.sendKeys(newAdminusername);
		return this;

	}

	public AdminUsersPage enterPasswordOnAdminUsersPasswordField(String NewAdminuserspassword) {
		adminuserspasswordfield.sendKeys(NewAdminuserspassword);
		return this;
	}

	public AdminUsersPage selectTheUserType() {
		PageUtility selection = new PageUtility();
		selection.selectDropdownWithIndex(usertypefield, 2);
//		Select select = new Select(usertypefield);
//		select.selectByIndex(2);
		return this;
	}

	public AdminUsersPage clickOnSaveButton() {
		WaitUtility wait = new WaitUtility();
		wait.waitUntilElementToBeClickable(driver, adminuserssave);
		adminuserssave.click();
		return this;
	}

	public AdminUsersPage clickonAdminUsersSearchIcon() {
		adminuserssearch.click();
		return this;
	}

	public AdminUsersPage enterUserNameonadminUsersSearchUserNameField(String newAdminusername) {
		adminuserssearchusernamefield.sendKeys(newAdminusername);
		return this;
	}

	public AdminUsersPage enterUserNameonadminUsersSearchUsertype() {
		PageUtility selection = new PageUtility();
		selection.selectDropdownWithIndex(adminuserssearchusertype, 1);
//		Select select = new Select(adminuserssearchusertype);
//		select.selectByIndex(1);
		return this;

	}

	public AdminUsersPage clickonAdminUsersSearchButton() {
		adminuserssearchbutton.click();
		return this;
	}

	public boolean userCreatedAlertMessageDisplayed() {
		return usercreatedalertmessage.isDisplayed();
	}

	public boolean searchPageTitileDisplayed() {
		return usersearchpagetitle.isDisplayed();
	}

}
