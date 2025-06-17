package automationCore;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import constants.Constant;
import utilities.ScreenshotUtility;
import utilities.WaitUtility;

public class Base {
	Properties prop;
	FileInputStream fs;
	public WebDriver driver; // webdriver interface driver reference

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser") // parameterisation
	public void initializeBrowser(String browser) throws Exception {
		prop = new Properties();
		fs = new FileInputStream(Constant.CONFIGFILE);
		prop.load(fs);
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid Browser");// for any other browser
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();// to maximize window
		WaitUtility wait = new WaitUtility();
		wait.implicitWait(driver);
	}

	@AfterMethod(alwaysRun = true)
	public void driverQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility screenShot = new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();
	}
}
