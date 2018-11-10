package setUp;

import cucumber.api.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class driverManager {
    public static WebDriver driver = null;

    public static void initialize() {
        System.setProperty("webdriver.chrome.driver",".\\src\\chromedriver.exe");
        driver = new ChromeDriver();
    }
    @After
    public void after() {
        driver.close();
    }
}
