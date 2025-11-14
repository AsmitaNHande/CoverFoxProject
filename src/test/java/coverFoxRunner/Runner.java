package coverFoxRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"C:\\Users\\HP\\eclipse-workspace\\CoverFox\\src\\test\\resources\\FeatureFile\\CoverFoxHealthInsurance.feature"
				//"C:\\Users\\admin\\eclipse-workspace\\coverFox\\src\\test\\resources\\FeatureFile\\errorcoverFox.feature"
		}
			,glue= {"coverFoxStepDefinitions","hooks"},
					plugin={"pretty","html:target/cucumber-reports/reports.html"},
					publish= true,dryRun=false
					)
					
		
		
		


public class Runner extends AbstractTestNGCucumberTests {

	
}
