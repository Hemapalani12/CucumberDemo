package Exercise3;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HeroStep {
	
	TestContext1 context;
	HerokuappPage hs;
	
	public HeroStep(TestContext1 context)
	{
		this.context=context;
	  hs=context.pm.HerokuappPage();
	}
	
	@Given("User launches the browser and navigates to herokuapp")
	public void launchApp()
	{
		hs.OpenApp();
	}

	@When("User selects the JavascriptAlert option")
	public void selectAlertOption()
	{
		hs.selectAlert();
	}
}
