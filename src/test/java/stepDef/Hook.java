package stepDef;

import base.GlobalTestData;
import base.Setup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.util.Strings;

public class Hook extends Setup {
    public static String url = "https://freeschoolsoftware.in/spn4/infixedu/v6.5.0//login";
    public static String baseURL = System.getProperty("env");
    public static String browserType = System.getProperty("browser");
    Logger logger = LoggerFactory.getLogger(Hook.class);

    @Before
    public void openBrowser() throws InterruptedException {
        if (Strings.isNullOrEmpty(browserType)) {
            browserType = "ch";
        }
        if (Strings.isNullOrEmpty(baseURL)) {
            baseURL = "prod";
        }
        driver = initDriver(browserType);
        switch (baseURL) {
            case "qa":
                url = "#";

                break;
            case "stg":
                url = "#";

                break;
            case "prod":
                url = "https://freeschoolsoftware.in/spn4/infixedu/v6.5.0/login";
                break;
        }
        driver.get(url);
        logger.info("Test Started");
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.attach(screenshot, "image/png", scenario.getName());
            }
        } catch (Exception e) {
            System.out.println(e + "failed to take screenshot");
        }
        driver.quit();
        logger.info("Test Ended");
    }

}
