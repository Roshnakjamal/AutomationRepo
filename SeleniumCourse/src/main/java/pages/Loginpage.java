package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//input[@id=\"user-name\"]")private WebElement usernamefield;
	@FindBy(xpath="//input[@id=\"password\"]")private WebElement passwordfield;
	@FindBy(xpath="//input[@id=\"login-button\"]")private WebElement loginButton;
	
	public void enterUserNameonUserNameField()
	{
		usernamefield.sendKeys("standard_user");
	}
	
	public void enterPasswordOnPasswordField()
	{
		passwordfield.sendKeys("secret_sauce");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
}
