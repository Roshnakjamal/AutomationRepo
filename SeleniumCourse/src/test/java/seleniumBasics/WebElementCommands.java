package seleniumBasics;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementCommands extends Base{

	public static void main(String[] args) 
	{
     WebElementCommands elements= new WebElementCommands();
     elements.initializeBrowser();
     elements.handlingWebElements();
    // elements.browserCloseandQuit();
	}
	
	public void handlingWebElements()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagebox=driver.findElement(By.xpath("//input[@id=\"single-input-field\"]"));
		messagebox.sendKeys("Hello");
		WebElement showmessagebutton= driver.findElement(By.xpath("//button[@id=\"button-one\"]"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));//Explicit wait
		wait.until(ExpectedConditions.elementToBeClickable(showmessagebutton));
		//connect wait with element
		//Creates a new FluentWait instance for the WebDriver.Sets the maximum wait time to 5 seconds.
		//Sets the polling interval to check for the condition every 2sec.Instructs
		//FluentWait to ignore NoSuchElementException during the wait period
		Wait<WebDriver>fluent=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		fluent.until(ExpectedConditions.elementToBeClickable(showmessagebutton));
		showmessagebutton.click();
		WebElement yourmessage= driver.findElement(By.xpath("//div[@id=\"message-one\"]"));
		System.out.println(yourmessage.getText());
		messagebox.clear();
		WebElement valuea=driver.findElement(By.id("value-a"));
		System.out.println(valuea.getTagName());
	}

}