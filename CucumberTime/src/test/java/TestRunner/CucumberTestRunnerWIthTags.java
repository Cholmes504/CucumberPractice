package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke or @regression", features= {"src/test/resources/FeaturesWithTags"},
glue = {"StepDefinitions"},
plugin = {"pretty","html:target/htmlreport.html"})


public class CucumberTestRunnerWIthTags extends AbstractTestNGCucumberTests {

	

}