package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/login/login.feature"}, glue="definition",tags = "@PositiveTesting",plugin= {"html:testoutput/cucumber1.html"})
	public class test_runner extends AbstractTestNGCucumberTests  {
	}

