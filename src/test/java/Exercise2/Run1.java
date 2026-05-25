package Exercise2;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Exercise2/Demo.feature",glue="Exercise2",monochrome=true)
public class Run1 extends AbstractTestNGCucumberTests {

}
