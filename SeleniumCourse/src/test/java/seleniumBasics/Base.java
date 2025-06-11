package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver; // webdriver interface driver reference

	public void initializeBrowser() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();// to maximize window
	}

	public void browserCloseandQuit() {
		// driver.close();//close current page
		driver.quit();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Base base = new Base();
		base.initializeBrowser();
		base.browserCloseandQuit();

	}

}
