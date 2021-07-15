package Runner_File;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
features = "src/test/java/Login_negative_scenarios/Login_negative_scenarios.feature",
glue= {"Login_negative_scenarios"})
public class TestSuite {
}
