package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlerts extends Base {
	
	
	
	public void verifyAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.xpath("//button[@id='alertButton']"));
		clickme.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void verifyConfirmAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.xpath("//button[@id=\"confirmButton\"]"));
		clickme.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	public void verifyPromptAlerts()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement clickme=driver.findElement(By.xpath("//button[@id=\"promtButton\"]"));
		clickme.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Roshna");
		alert.accept();
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlerts handlingalert=new HandlingAlerts();
		handlingalert.initializeBrowser();
		//handlingalert.verifyAlerts();
		//handlingalert.verifyConfirmAlerts();
		handlingalert.verifyPromptAlerts();
		//handlingalert.browserCloseandQuit();
	}

}
