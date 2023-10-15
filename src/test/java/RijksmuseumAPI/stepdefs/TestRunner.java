package RijksmuseumAPI.stepdefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/RijksmuseumAPI",
		tags = "@shan1",
		glue="RijksmuseumAPI.stepdefs",
		plugin= {"pretty","html:target/CucumberTestReport.html","json:target/cucumber-reports/CucumberTestReport.json"})

public class TestRunner {

}
