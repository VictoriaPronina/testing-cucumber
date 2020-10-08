package step_definitions;

import cucumber.api.Scenario;
//import org.junit.After;
//import org.junit.Before;
import cucumber.api.java.Before;
import cucumber.api.java.After;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {

        Driver.getDriver().get(ConfigurationReader.getConfPropCredentials("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @After
    public void tearDown(Scenario scenario)  {

        //check if the scenario is failed
        if (scenario.isFailed()) {
            //take that screenshot
            final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //attach the scenario to the report
            scenario.embed(screenshot, "image/png");
        }

        Driver.closeDriver();
    }

}
