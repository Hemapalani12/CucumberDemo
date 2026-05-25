package Exercise1;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="src/test/java/Exercise1/Practice1.feature", glue="Exercise1",monochrome=true,tags="not @regressionTest",
plugin= {"pretty", "html:target/cucumber.html"})
public class Runner extends AbstractTestNGCucumberTests{

}
