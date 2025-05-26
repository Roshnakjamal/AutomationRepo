package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNgBase {

public WebDriver driver;  // webdriver interface driver reference
	@BeforeMethod
	public void initializeBrowser()
	{
		driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();//to maximize window
	}
	@AfterMethod
	public void browserCloseandQuit()
	{
		//driver.close();//close current page
		driver.quit();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base base=new Base();
		base.initializeBrowser();
		base.browserCloseandQuit();
}
}
