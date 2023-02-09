package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/java/features",
        glue={"stepDefinations"},
        tags="",
        monochrome =true
)

public class TestRunner_TestNG extends AbstractTestNGCucumberTests{

}
