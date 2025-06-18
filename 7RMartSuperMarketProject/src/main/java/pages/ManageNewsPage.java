package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {

	public WebDriver driver;

	public ManageNewsPage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath = "//a[@onclick=\"click_button(1)\"]")
	WebElement newmanagenewsicon;
	@FindBy(xpath = "//textarea[@id=\"news\"]")
	WebElement newmanagenewsfield;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement newmanagenewssaveicon;
	@FindBy(xpath = "//a[@onclick=\"click_button(2)\"]")
	WebElement managenewssearchicon;
	@FindBy(xpath = "//input[@name=\"un\"]")
	WebElement managenewssearchfield;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement managenewssearchbutton;
	@FindBy(xpath = "//i[@class=\"ace-icon fa fa-sync-alt\"]")
	WebElement manangenewsreseticon;
	@FindBy(xpath = "//div[@class=\"alert alert-success alert-dismissible\"]")
	private WebElement newnewscreatedalert;
	@FindBy(xpath = "//h1[text()=\"Manage News\"]")
	private WebElement newssearchpagetitle;

	

	public ManageNewsPage clickOnNewManageNewsIcon() {
		newmanagenewsicon.click();
		return this;
	}

	public ManageNewsPage enterNewsonNewManageNewsField(String newnews) {
		newmanagenewsfield.sendKeys(newnews);
		return this;
	}

	public ManageNewsPage clickOnNewnewsSaveIcon() {
		newmanagenewssaveicon.click();
		return this;
	}

	public ManageNewsPage clickManageNewsSearchIcon() {
		managenewssearchicon.click();
		return this;
	}

	public ManageNewsPage enterNewsOnManageNewsSearchField(String news) {
		managenewssearchfield.sendKeys(news);
		return this;
	}

	public ManageNewsPage clickOnManageNewsSearchButton() {
		managenewssearchbutton.click();
		return this;
	}

	public ManageNewsPage clickOnManageNewsResetIcon() {
		manangenewsreseticon.click();
		return this;
	}

	public boolean isnewNewsCreatedAlertDispalyed() {
		return newnewscreatedalert.isDisplayed();
	}

	public boolean isNewsSearchPageTitleDisplayed() {
		return newssearchpagetitle.isDisplayed();
	}

}
