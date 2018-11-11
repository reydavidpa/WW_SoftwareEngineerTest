package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setUp.driverManager;

import java.util.List;

public class meetingScheduleObjects {
    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(1) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> sundayLeaders;

    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(2) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> mondayLeaders;

    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(3) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> tuesdayLeaders;

    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(4) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> wednesdayLeaders;

    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(5) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> thurdayLeaders;

    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(6) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> fridayLeaders;

    @FindAll(@FindBy(css = ".schedule-detailed .schedule-detailed-day:nth-child(7) .schedule-detailed-day-meetings-item-leader"))
    public List<WebElement> saturdayLeaders;

    public meetingScheduleObjects() {
        PageFactory.initElements(driverManager.driver, this);
    }
}
