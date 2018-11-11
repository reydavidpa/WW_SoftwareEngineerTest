package helpers;

import org.openqa.selenium.WebElement;
import pageObjects.meetingScheduleObjects;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.*;

public class meetings {
    public static void getScheduleSummary(String day) {
        meetingScheduleObjects meetingScheduleObjects = new meetingScheduleObjects();
        switch (day){
            case "Sun":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.sundayLeaders));
                break;
            case "Mon":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.mondayLeaders));
                break;
            case "Tue":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.tuesdayLeaders));
                break;
            case "Wed":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.wednesdayLeaders));
                break;
            case "Thu":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.thurdayLeaders));
                break;
            case "Fri":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.fridayLeaders));
                break;
            case "Sat":
                System.out.println(getLeadersPerDayMap(meetingScheduleObjects.saturdayLeaders));
                break;
            default:
                System.err.println("Day not found!");
                break;
        }

    }

    private static Map<String, Long> getLeadersPerDayMap(List<WebElement> leadersWebElemets) {
        String[] leaders = new String[leadersWebElemets.size()];
        for (int i=0; i<leadersWebElemets.size(); i++)
            leaders[i]=(leadersWebElemets.get(i).getText());
        List<String> items = Arrays.asList(leaders);
        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );
        return result;
    }


}
