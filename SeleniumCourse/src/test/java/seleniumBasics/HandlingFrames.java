package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames frames=new HandlingFrames();
		frames.initializeBrowser();
		frames.verifyFrames();
		//frames.browserCloseandQuit();
	}
public void verifyFrames()
{
	driver.navigate().to("https://demoqa.com/frames");
//	WebElement totalframe=driver.findElement(By.tagName("iframe"));
//	System.out.println(totalframe.getSize());
	List<WebElement>iframes=driver.findElements(By.tagName("iframe"));// to store lot of iframes
	System.out.println(iframes.size());
	// WebElement iframe=driver.findElement(By.xpath("//iframe[@id='frame1']"));
	//driver.switchTo().frame(iframe);
	WebElement heading=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
    System.out.println(heading.getText());
	
}

}
