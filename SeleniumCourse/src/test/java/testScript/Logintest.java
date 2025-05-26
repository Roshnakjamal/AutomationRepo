package testScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.TestNgBase;

public class Logintest extends TestNgBase{

	@Test
	public void VerifyUserLoginWithValidCredentials()
	{
		//WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		//usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		loginButton.click();
	}

	@Test
	public void VerifyUserLoginWithValidUserNameandinValidpassword()
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordfield.sendKeys("secret_sauce1");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		loginButton.click();
	}
	
	@Test
	public void VerifyUserLoginWithinValidUserNameanValdidpassword()
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		usernamefield.sendKeys("standard_user1");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordfield.sendKeys("secret_sauce");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		loginButton.click();
	}
	
	@Test
	public void VerifyUserLoginWithinValidCredentials()
	{
		WebElement usernamefield=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		usernamefield.sendKeys("standard_user1");
		WebElement passwordfield=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		passwordfield.sendKeys("secret_sauce1");
		WebElement loginButton=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
		loginButton.click();
	}
}
