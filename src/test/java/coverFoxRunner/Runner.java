package coverFoxRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {
        "C:\\Users\\HP\\eclipse-workspace\\CoverFox\\src\\test\\resources\\FeatureFile\\CoverFoxHealthInsurance.feature"
    },
    glue = {"coverFoxStepDefinitions", "hooks"},
    plugin = {
        "pretty",
        "html:target/cucumber-html-reports",
        "json:target/cucumber-reports/Cucumber.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    },
    publish = true,
    dryRun = false
    
)
public class Runner extends AbstractTestNGCucumberTests {

}
