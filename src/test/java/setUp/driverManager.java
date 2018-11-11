package setUp;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class driverManager {
    public static WebDriver driver = null;

    public static void initialize() {
        System.setProperty("webdriver.chrome.driver",".\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @After
    public void after() {
        driver.close();
    }
}
