package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",    // Location of your feature files
        glue = "Cucumbersteps",
        tags="@abc",       // Package where your step definitions are located
        plugin = {"pretty", "html:target/cucumber-reports"}     // Plugins for reporting
)
public class Testrunner {

}

