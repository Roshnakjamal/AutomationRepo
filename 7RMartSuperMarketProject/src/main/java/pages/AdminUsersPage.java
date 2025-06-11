package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminUsersPage {

	public WebDriver driver;

	public AdminUsersPage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class=\"fas fa-arrow-circle-right\"]")
	private WebElement adminuserslink;
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

	public void clickonAdminusersicon() {
		adminuserslink.click();
	}

	public void clickonnewAdminusersicononAdminuserspage() {
		newadminuserlink.click();

	}

	public void enterUserNameonAdminUsersUserNameField(String newAdminusername) {
		adminusersnamefield.sendKeys(newAdminusername);
	}

	public void enterPasswordOnAdminUsersPasswordField(String NewAdminuserspassword) {
		adminuserspasswordfield.sendKeys(NewAdminuserspassword);
	}

	public void selectTheUserType() {
		Select select = new Select(usertypefield);
		select.selectByIndex(2);
	}

	public void clickOnSaveButton() {
		adminuserssave.click();
	}

	public void clickonAdminUsersSearchIcon() {
		adminuserssearch.click();
	}

	public void enterUserNameonadminUsersSearchUserNameField(String newAdminusername) {
		adminuserssearchusernamefield.sendKeys(newAdminusername);
	}

	public void enterUserNameonadminUsersSearchUsertype() {
		Select select = new Select(adminuserssearchusertype);
		select.selectByIndex(1);

	}

	public void clickonAdminUsersSearchButton() {
		adminuserssearchbutton.click();
	}

	public boolean userCreatedAlertMessageDisplayed() {
		return usercreatedalertmessage.isDisplayed();
	}

	public boolean searchPageTitileDisplayed() {
		return usersearchpagetitle.isDisplayed();
	}

}
