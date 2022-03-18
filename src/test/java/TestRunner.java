import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        monochrome = true,
        features = "src/test/java/features/library",
        glue = "stepDef",
        plugin = {
                "pretty",
                "html:target/cucumber-html-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
//Run your code in below list
//1.  hrmodule
//2.  academic
//3.  accounts , adminsection
//4.  adminsetup
//5.  examination
//6.  library
//7. hw -not working properly