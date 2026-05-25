package Exercise3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HerokuappPage {
	
	WebDriver driver;
	
	
	public HerokuappPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By JsAlert= By.xpath("//a[contains(text(), 'JavaScript Alerts')]");

	public void OpenApp()
	{
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	public void selectAlert()
	{
		driver.findElement(JsAlert).click();
	}
}
