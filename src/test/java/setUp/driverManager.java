package setUp;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

/*
    Class to start and quit webdriver
 */

public class driverManager {
    public static WebDriver driver = null;

    // Initialize chrome webdriver - further improvement can be to config drive other browsers such as Firefox, IE
    public static void initialize() {
        System.setProperty("webdriver.chrome.driver",".\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //This method will be executed after each test run to kill webdriver
    @After
    public void after() {
        if(driver!=null)
            driver.close();
    }
}
