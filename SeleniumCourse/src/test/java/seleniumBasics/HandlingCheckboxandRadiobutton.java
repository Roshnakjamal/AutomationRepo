package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingCheckboxandRadiobutton extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingCheckboxandRadiobutton checkbox=new HandlingCheckboxandRadiobutton();
		checkbox.initializeBrowser();
		checkbox.verifyCheckBox();
		checkbox.VerifyRadioButton();
	}

	public void verifyCheckBox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox1=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox1.click();
	}
	
	public void VerifyRadioButton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton1=driver.findElement(By.xpath("//input[@value=\"green\"]"));
		radiobutton1.click();
	}
}
