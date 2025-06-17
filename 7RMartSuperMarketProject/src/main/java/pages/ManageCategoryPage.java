package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Constant;
import utilities.WaitUtility;

public class ManageCategoryPage {

	public WebDriver driver;

	public ManageCategoryPage(WebDriver driver)// constructor initialize
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href=\"https://groceryapp.uniqassosiates.com/admin/list-category\"]")
	WebElement managecategorylink;
	@FindBy(xpath = "//a[@onclick=\"click_button(1)\"]")
	WebElement newcategoryaddicon;
	@FindBy(xpath = "//input[@id=\"category\"and@class=\"form-control\"]")
	WebElement newcategoryfield;
	@FindBy(xpath = "//li[@id=\"134-selectable\"]")
	WebElement selectingfromgroups;
	@FindBy(xpath = "//input[@name=\"main_img\"]")
	WebElement newcategoryfileuploadlink;
	@FindBy(xpath = "//input[@name='top_menu'and@value='no']")
	private WebElement showontopmenuradiobutton;
	@FindBy(xpath = "//input[@name='show_home'and@value='no'] ")
	private WebElement showonleftmenuradiobutton;
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement newcategorysavebutton;
	@FindBy(xpath = "//a[@onclick=\"click_button(2)\"]")
	WebElement categorysearchlink;
	@FindBy(xpath = "//input[@name=\"un\"]")
	WebElement categorynamesearchfield;
	@FindBy(xpath = "//button[@value=\"sr\"]")
	WebElement categorysearchbutton;
	@FindBy(xpath = "//div[@class=\"alert alert-danger alert-dismissible\"]")
	private WebElement categorycreatedalert;
	@FindBy(xpath = "//h1[text()= \"List Categories\"]")
	private WebElement categorysearchpagetitle;

	public void clickOnManageCategoryLink() {
		managecategorylink.click();
	}

	public void clickOnNewCategoryAddIcon() {
		newcategoryaddicon.click();
	}

	public void enterNewnameOnCategoryField(String newcategoryname) {
		newcategoryfield.sendKeys(newcategoryname);
	}

	public void clickOnSelectGroupstoSelectGroup() {
		selectingfromgroups.click();
	}

	public void clickOnTheFileUploadLink() {
		newcategoryfileuploadlink.sendKeys(Constant.TESTDATAIMAGE);
	}

	public void clickOnTheShowOnTopMenuAndShowOnLeftMenuRadioButton() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", showontopmenuradiobutton);
		js.executeScript("arguments[0].click()", showontopmenuradiobutton);
		js.executeScript("arguments[0].scrollIntoView()", showonleftmenuradiobutton);
		js.executeScript("arguments[0].click()", showonleftmenuradiobutton);

	}

	public void clickonTheNewCategorySaveButton() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", newcategorysavebutton);
		js.executeScript("arguments[0].click()", newcategorysavebutton);
	}

	public void clickonCategorySearchIcon() {
		categorysearchlink.click();
	}

	public void enterCategoryNameOnCategorySearchField(String categoryname) {
		categorynamesearchfield.sendKeys(categoryname);
	}

	public void clickOnCategorySearchButton() {
		categorysearchbutton.click();
	}

	public boolean categorycreatedalertmessagedisplayed() {
		return categorycreatedalert.isDisplayed();
	}

	public boolean categorysearchpagetitledisplayed() {
		return categorysearchpagetitle.isDisplayed();
	}

}
