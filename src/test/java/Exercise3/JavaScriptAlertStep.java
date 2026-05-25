package Exercise3;

import org.openqa.selenium.Alert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JavaScriptAlertStep {
	
TestContext1 context;
public JavascriptAlertPage js;


public JavaScriptAlertStep(TestContext1 context)
{
	this.context=context;
	js=context.pm.JavascriptAlertPage();
    
}

@When("select the first JSAlert and give OK")
public void selectFirstAlert()
{
	
	
	js.clickAlert();
	Alert al=js.driver.switchTo().alert();
	al.accept();
	
}

@Then("check for successful message")
public void checkMsg()
{
	
	String output=js.getMsg();
	System.out.println("message is "+output);
}

}
