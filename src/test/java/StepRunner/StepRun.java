package StepRunner;

import io.cucumber.core.backend.StepDefinition;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features",glue = {"StepDefinition"})

public class StepRun {
}
