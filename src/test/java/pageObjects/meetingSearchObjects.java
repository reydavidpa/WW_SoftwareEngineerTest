package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.driverManager;

public class meetingSearchObjects {

    @FindBy(id = "meetingSearch")
    public WebElement meetingSearch;

    @FindBy(css = "button[ng-click='mfsearch.$valid && searchSubmit(searchText)']")
    public WebElement meetingSearchButton;

    public meetingSearchObjects() {
        PageFactory.initElements(driverManager.driver, this);
    }
}
