package tests_cucumber;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import utils.SeleniumUtils;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue={"stepDefinitions"},
		plugin= {"pretty","html:target/cucumber-reports"}
		)
public class Test_runner {
		
	@AfterClass
	public static void clear() {
		SeleniumUtils.clear();
	}

}
