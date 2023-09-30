package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MyHooks extends DriverInit {

    public MyHooks() {

    }

    @Before
    public void InitializeTest(Scenario scenario) {
        
    	DriverInit.Driver = new FirefoxDriver();
     
    }

    @After
    public void afterScenario(Scenario sc) {
        boolean failed = sc.isFailed();
        System.out.println("is Failed? " + failed);
        if (!failed) {
            TakesScreenshot ts = (TakesScreenshot) DriverInit.Driver;
            byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshotAs, "image/png", "My test");
            DriverInit.Driver.close();
        } else {

            TakesScreenshot ts = (TakesScreenshot) DriverInit.Driver;
            byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshotAs, "image/png", "Screenshot attached");
            DriverInit.Driver.close();

        }
    }

}
