package StepDefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="D:\\NetsuitePOM\\TestMavenProject\\TestMavenProject\\src\\test\\java\\Feature\\Browser.feature"
,glue="StepDefinition",plugin={"pretty","html:target/HtmlReports","json:target/JSONReports/report.json","junit:target/JUnitReports/report.xml"},monochrome=true)
public class Runner 
{
 
	
}
