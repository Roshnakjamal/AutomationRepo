package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(xpath = "//p[@class=\"login-box-msg\"]")
	private WebElement loginpagemessage;

	public void clickonAdminicon() {
		adminlink.click();
	}

	public void clickonLogoutIcon() {
		logoutlink.click();
	}

	public boolean loginPageTitleboxDisplayed() {
		return loginpagemessage.isDisplayed();
	}
}
