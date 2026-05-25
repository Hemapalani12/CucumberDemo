package Exercise3;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Hooks {
	
	public TestContext1 test;
	
	public Hooks(TestContext1 test)
	{
		this.test=test;
	}
	
	@Before
	public void set()
	{
		WebDriver driver=new ChromeDriver();
		test.setDriver(driver);
		
	}
	
	@After
	public void get()
	{
		if(test.getDriver()!=null)
		{
		test.getDriver().quit();}
	}

}
