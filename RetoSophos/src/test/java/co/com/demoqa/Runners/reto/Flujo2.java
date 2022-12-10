package co.com.demoqa.Runners.reto;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/flujo2.feature",
        glue = "co.com.demoqa.StepDefinitions.reto",
        snippets = SnippetType.CAMELCASE,
        dryRun = false,
        monochrome = true
)

public class Flujo2 {
}
