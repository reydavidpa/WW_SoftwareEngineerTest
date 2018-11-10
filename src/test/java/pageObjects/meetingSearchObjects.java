package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.driverManager;

public class meetingSearchObjects {

    @FindBy(id = "meetingSearch")
    public WebElement meetingSearch;

    public meetingSearchObjects() {
        PageFactory.initElements(driverManager.driver, this);
    }
}
