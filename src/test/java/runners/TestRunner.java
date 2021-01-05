package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\default-cucumber_reports.html",
                "json:target\\json-reports/cucumber.json",
                "junit:target\\xml-report/cucumber.xml" },

        features = "src/test/resources/features",
        glue = "stepdefinitions",
        dryRun = false,
        tags = "@wip"
)

public class TestRunner {

    //or oldugunda taglardan birinin olmasi yeterli oluyor. Ancak and konulursa iki tag beraberken calisir ancak boyle bir test case yok
// tags basina not ve tag ismi yazilirsa smoke test haric digerleri calisir.
//feature klasorunun yolunu gostermeliyim.



}
