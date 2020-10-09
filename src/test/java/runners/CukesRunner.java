package runners;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty",
                "html:target/cucumber-reports/cucumber-html-report",
                "json:target/cucumber-reports/CucumberTestReport.json",
                // "return:target/cucumber-reports/rerun.txt",
                "usage:target/cucumber-usage.json"},
        features ="src/test/resources/features",
        glue="step_definitions",
        dryRun = false,
        tags = "@test2"

)
public class CukesRunner {

}

