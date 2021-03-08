package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/feature",
		glue = ("stepdefinition"),
		monochrome = true,
//		dryRun = true,
		//tags = "@regression or @google",
		//tags = "@regression and @google",
		//tags = "@regression and not@google",
		tags = "@development",
		plugin = {"pretty" , "junit:target/JunitReport/report.xml",
					"pretty" , "json:target/JsonReport/report.json",
					"pretty", "html:target/HTMLReport/report.html"}
		)
public class TestRunner {

}
