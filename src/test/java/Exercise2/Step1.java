package Exercise2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class Step1 {
	
	public WebDriver driver;
	public TestContext test;

	public Step1(TestContext test) {
		
		this.test=test;
	}
	
	@Given("user lands in google page")
	public void user_lands_in_google_page() {
	  
		test.driver=new ChromeDriver();
		test.driver.get("https://www.google.com");
	}

}
