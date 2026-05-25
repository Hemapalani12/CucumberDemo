package Exercise3;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public HerokuappPage hp; //created object for that page
	public JavascriptAlertPage jp;
	public WebDriver driver; //this will come from concern step class you are calling from
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;	}
	
	public HerokuappPage HerokuappPage()
	{
		if (hp == null) {
            hp = new HerokuappPage(driver);
        }
		return hp;  //the goal is creating object of taht particular page and returning it, 
		//so the return type is same class type
	}
	
	public JavascriptAlertPage JavascriptAlertPage()
	{
		if (jp == null) {
            jp = new JavascriptAlertPage(driver);
        }
		return jp;
	}

}
