package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"FeatureFileFolder/fbcreatemultiple.feature"},
		glue = {"StepDefination/TestRunnerC"},
		dryRun =false,
		monochrome=true
		)
public class TestRunnerC {

}
