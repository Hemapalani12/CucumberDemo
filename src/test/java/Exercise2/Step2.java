package Exercise2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step2 {
	public WebDriver driver;
	TestContext test1;
	
	public Step2(TestContext test1) {
		this.test1=test1;
	}
	
	@When("searches for books")
	public void searches_for_books() {
	   WebElement search= test1.driver.findElement(By.xpath("//textarea[@autofocus and @title=\"Search\"]"));
	   search.sendKeys("Books");
	}
	@Then("result books has to show up")
	public void result_books_has_to_show_up() {
	    System.out.println("books result");
	}


}
