package runnerScripts;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/loginScripts/loginCred.feature"}, glue = {"stepDefinition"}, 
plugin = {"html:target/cucumber_report.html"})

public class Runner1 
{

}
