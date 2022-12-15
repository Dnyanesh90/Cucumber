package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features = {"FeatureFileFolder/GuruRegister.feature"},
		         glue ={"StepDefination"},
		         monochrome =true,
		         dryRun=false,
		         plugin = {
		        		"json:target/abc.json",
		 				"junit:target/abc.xml",
		 				"html:target/xyz.html",
		 				"pretty:target/abc.txt",
		 				"pretty:target/abc.pdf",
		         }
		         )
public class TestRunnerA {

}
