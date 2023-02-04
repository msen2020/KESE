package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       strict = true,
        plugin = {"pretty","html:target/failed-cucumber-reports",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features_UI",
        glue = "com/kese/stepdefinitions_UI",
        tags = "@US169",
        dryRun = false


)
public class cukesRunner {

}