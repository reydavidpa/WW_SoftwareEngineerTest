package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.driverManager;
import java.util.List;

/*
    Page Objects for Find-a-Meeting Results Page
    URL: https://www.weightwatchers.com/us/find-a-meeting/search?search={zip code}
 */

public class meetingSearchResultsObjects {

    @FindAll(@FindBy(css = "span[ng-if='!linkName']"))
    public List<WebElement> titles;

    @FindAll(@FindBy(css = "div.location__distance"))
    public List<WebElement> distances;

    public meetingSearchResultsObjects() {
        PageFactory.initElements(driverManager.driver, this);
    }
}
