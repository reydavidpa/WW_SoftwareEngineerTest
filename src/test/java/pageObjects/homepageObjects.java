package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.driverManager;

/*
    Page Objects for homepage
    URL: https://www.weightwatchers.com/us/
 */

public class homepageObjects {

    @FindBy(id = "ela-menu-visitor-desktop-supplementa_find-a-studio")
    public WebElement findAStudioButton;

    public homepageObjects() {
        PageFactory.initElements(driverManager.driver, this);
    }
}
