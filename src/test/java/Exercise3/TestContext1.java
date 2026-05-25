package Exercise3;

import org.openqa.selenium.WebDriver;

public class TestContext1 {
	
	public WebDriver driver;
	public PageObjectManager pm;
	
	
	
	public WebDriver getDriver()
	{
		return driver;
	}
	
	public void setDriver(WebDriver driver)
	{
		this.driver=driver;
		pm=new PageObjectManager(driver);
	}

}
