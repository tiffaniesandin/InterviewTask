package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt",//store failed scenario name into rerun.txt file
                "json:target/cucumber.json"//generate json execution report to be used for html report
        },
        features = "src/test/resources/Features",
        glue = "StepDefinitions",
        dryRun = false
       //tags = "Search"

)

public class CukesRunnerTest {
}
