package seleniumBasics; 
  
 import java.util.Iterator; 
 import java.util.Set; 
  
 import org.openqa.selenium.By; 
 import org.openqa.selenium.WebElement; 
  
 import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter; 
  
 public class HandlingMultipleWindow extends Base { 
 	 
 	public void handlingMultipleWindow() 
 	{ 
 		driver.navigate().to("https://demo.guru99.com/popup.php"); 
 		String firstwindoehandleid=driver.getWindowHandle(); 
 		System.out.println(firstwindoehandleid); 
 		WebElement handle=driver.findElement(By.xpath("//a[text()='Click Here']")); 
 		handle.click(); 
 		Set<String>handleids=driver.getWindowHandles(); 
 		System.out.println(handleids); 
 		Iterator <String>values=handleids.iterator(); 
 		while(values.hasNext()) 
 		{ 
 			String currentid=values.next(); 
 			if(!currentid.equals(firstwindoehandleid)) 
				 { 
				 driver.switchTo().window(currentid); 
				 WebElement emailid=driver.findElement(By.xpath("//input[@name='emailid']")); 
				 emailid.sendKeys("abc@gmail.com"); 
				 WebElement submit=driver.findElement(By.xpath("//input[@value='Submit']")); 
				 submit.click(); 
				 } 
 		} 
 		 
 	} 
 	 
  
 	public static void main(String[] args) { 
 		// TODO Auto-generated method stub 
 		 
 		 
      HandlingMultipleWindow multiple=new HandlingMultipleWindow(); 
      multiple.initializeBrowser(); 
      multiple.handlingMultipleWindow(); 
      //multiple.browserCloseandQuit(); 
 	} 
 	 
  
 }