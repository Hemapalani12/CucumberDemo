package Exercise3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavascriptAlertPage {
	
	WebDriver driver;
	
	public JavascriptAlertPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By FirstAlert= By.xpath("//button[contains(text(),'JS Alert')]");
	By msg=By.xpath("//p[@id='result']");

	public void clickAlert()
	{
		driver.findElement(FirstAlert).click();
	}
	
	public String getMsg()
	{
		String res=driver.findElement(msg).getText();
		return res;
	}
	
}
