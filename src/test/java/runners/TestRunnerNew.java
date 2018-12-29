package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunnerNew {

	@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\Iris Garcia\\eclipse-workspace\\com.MavenCucumberJenkins\\src\\test\\resources\\features"
	, glue= {"stepsDefinitions"}
	)
	public class LoginRunner {
}}
