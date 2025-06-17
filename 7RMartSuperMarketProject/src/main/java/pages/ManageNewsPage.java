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

	@FindBy(xpath = ("//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-news\"and@class=\"small-box-footer\"]"))
	private WebElement manageNewsLink;
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

	public void clickOnManageNewsLink() {
		manageNewsLink.click();
	}

	public void clickOnNewManageNewsIcon() {
		newmanagenewsicon.click();
	}

	public void enterNewsonNewManageNewsField(String newnews) {
		newmanagenewsfield.sendKeys(newnews);
	}

	public void clickOnNewnewsSaveIcon() {
		newmanagenewssaveicon.click();
	}

	public void clickManageNewsSearchIcon() {
		managenewssearchicon.click();
	}

	public void enterNewsOnManageNewsSearchField(String news) {
		managenewssearchfield.sendKeys(news);
	}

	public void clickOnManageNewsSearchButton() {
		managenewssearchbutton.click();
	}

	public void clickOnManageNewsResetIcon() {
		manangenewsreseticon.click();
	}

	public boolean isnewNewsCreatedAlertDispalyed() {
		return newnewscreatedalert.isDisplayed();
	}

	public boolean isNewsSearchPageTitleDisplayed() {
		return newssearchpagetitle.isDisplayed();
	}

}
