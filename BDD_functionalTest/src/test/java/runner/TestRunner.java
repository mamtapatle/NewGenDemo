package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;





//@RunWith(Cucumber.class)
@CucumberOptions
(plugin = "json:target/cucumber-report.json",
features="src/main/java/featureFile",
glue= "stepDefinitions",
tags="@E2E_Testing",
monochrome=true,
dryRun = false)
public class TestRunner extends AbstractTestNGCucumberTests {

}
