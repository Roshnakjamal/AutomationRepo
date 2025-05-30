package testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.Loginpage;
import seleniumBasics.TestNgBase;
import utilities.Excelutility;

public class Logintest extends TestNgBase{

	@Test
	public void VerifyUserLoginWithValidCredentials() throws IOException
	{
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		//usernamefield.sendKeys("standard_user");
		//WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		//passwordfield.sendKeys("secret_sauce");
		//WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		//loginButton.click();
		String username=Excelutility.getStringData(0, 0,"LoginPage");
		String password=Excelutility.getStringData(0, 1,"LoginPage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}

	@Test
	public void VerifyUserLoginWithValidUserNameandinValidpassword() throws IOException
	{
//		WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//		usernamefield.sendKeys("standard_user");
//		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//		passwordfield.sendKeys("secret_sauce1");
//		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
//		loginButton.click();
		String username=Excelutility.getStringData(1, 0,"LoginPage");
		String password=Excelutility.getStringData(1, 1,"LoginPage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	
	@Test
	public void VerifyUserLoginWithinValidUserNameanValdidpassword() throws IOException
	{
//		WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//		usernamefield.sendKeys("standard_user1");
//		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//		passwordfield.sendKeys("secret_sauce");
//		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
//		loginButton.click();
		String username=Excelutility.getStringData(2, 0,"LoginPage");
		String password=Excelutility.getStringData(2, 1,"LoginPage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
	
	@Test
	public void VerifyUserLoginWithinValidCredentials() throws IOException
	{
//		WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
//		usernamefield.sendKeys("standard_user1");
//		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
//		passwordfield.sendKeys("secret_sauce1");
//		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
//		loginButton.click();
		String username=Excelutility.getStringData(3, 0,"LoginPage");
		String password=Excelutility.getStringData(3, 1,"LoginPage");
		Loginpage loginpage=new Loginpage(driver);
		loginpage.enterUserNameonUserNameField(username);
		loginpage.enterPasswordOnPasswordField(password);
		loginpage.clickOnLoginButton();
	}
}
