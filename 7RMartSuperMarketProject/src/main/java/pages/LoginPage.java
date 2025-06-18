package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name=\"username\"]")
	private WebElement usernamefield;
	@FindBy(xpath = "//input[@name=\"password\"]")
	private WebElement passwordfield;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	private WebElement submitButton;
	@FindBy(xpath = "//p[text()=\"Dashboard\"]")
	private WebElement dashboardtitle;
	@FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]")
	private WebElement alertmessage;
	@FindBy(xpath = "//p[@class=\"login-box-msg\"]")
	private WebElement loginpagemessage;

	public LoginPage enterUserNameonUserNameField(String username) {
		usernamefield.sendKeys(username);
		return this;// same page
	}

	public LoginPage enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
		return this;
	}

	public HomePage clickOnSubmitButton() {
		submitButton.click();
		return new HomePage(driver);// driver control goes to home page
	}

	public boolean dashboardTileDisplayed() {
		return dashboardtitle.isDisplayed();
	}

	public String getDashboardText() {
		return dashboardtitle.getText();

	}

	public boolean alertMessageDisplayed() {
		return alertmessage.isDisplayed();
	}

	public boolean loginPageTitleboxDisplayed() {
		return loginpagemessage.isDisplayed();
	}
}
