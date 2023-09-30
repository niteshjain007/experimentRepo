package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"stepDef", "hooks", "pages"},
		 plugin = { "pretty", "html:target/cucumber-reports.html" }
		//tags = "@smoke"
		//tags = "@smoke and @UI"
		//tags = "not @smoke"
		//tags = "@smoke or @UI"
		//dryRun =true,
		//monochrome = true,
		
		
		//plugin = { "json:target/cucumber.json", "pretty","html:target/cucumber-reports" }
	/*
				plugin = {
				        "pretty:target/prettyReport.txt", "html:target/cucumber", "json:target/cucumber.json", "rerun:target/rerun.txt",
				        "junit:target/junit-report.xml", "testng:target/testng-output.xml" }
	*/	)

public class TestRunner {

}
