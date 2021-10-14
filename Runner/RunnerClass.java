package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Features/", glue={"StepDefenition","HooksIm"}, monochrome=true, publish=true, tags= "@smoke and @sanity or @regression")
public class RunnerClass extends AbstractTestNGCucumberTests{

}
