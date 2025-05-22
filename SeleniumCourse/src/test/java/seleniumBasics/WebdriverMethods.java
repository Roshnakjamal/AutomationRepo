package seleniumBasics;

public class WebdriverMethods extends Base{
	public void handlingWebriverMethods()
	{
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String title=driver.getTitle();
		System.out.println(title);
		String pagesourcecode=driver.getPageSource();
		System.out.println(pagesourcecode);
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebdriverMethods drivermethods = new WebdriverMethods();
		drivermethods.initializeBrowser();
		drivermethods.handlingWebriverMethods();
		//drivermethods.browserCloseandQuit();
	}

}
