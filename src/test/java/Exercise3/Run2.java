package Exercise3;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Exercise3/Internet.feature",glue="Exercise3",monochrome=true)
public class Run2 extends AbstractTestNGCucumberTests {


}
