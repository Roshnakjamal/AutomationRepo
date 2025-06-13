package automationCore;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import utilities.ScreenshotUtility;

public class Base {

	public WebDriver driver; // webdriver interface driver reference

	@BeforeMethod
	@Parameters("browser") // parameterisation
	public void initializeBrowser(String browser) throws Exception {
		if (browser.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("FireFox")) {
			driver = new FirefoxDriver();
		} else {
			throw new Exception("Invalid Browser");// for any other browser
		}
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();// to maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));// iimplicit wait
	}

	@AfterMethod
	public void driverQuit(ITestResult iTestResult) throws IOException {
		if (iTestResult.getStatus() == ITestResult.FAILURE) {
			ScreenshotUtility screenShot = new ScreenshotUtility();
			screenShot.getScreenshot(driver, iTestResult.getName());
		}
		driver.quit();
	}
}
