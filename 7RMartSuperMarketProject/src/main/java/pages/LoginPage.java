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

	public void enterUserNameonUserNameField(String username) {
		usernamefield.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
	}

	public void clickOnSubmitButton() {
		submitButton.click();
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
}
