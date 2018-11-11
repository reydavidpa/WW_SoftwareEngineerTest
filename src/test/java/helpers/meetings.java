package helpers;

import org.openqa.selenium.WebElement;
import pageObjects.meetingScheduleObjects;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.*;
import java.util.stream.*;

/*
    Helper class to process information displayed on meetings-weekly-schedule page
 */

public class meetings {


    /*
        Method to print out the names(s) and the number of times each person(s) is conducting the meeting that particular day
        Parameters:
            day: particular weekday
        Format example: MONDAY {DANA F.=1, LISA S.=2}
    */
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

    /*
        Method to return a map collection of names(s) and the number of times is found in a list of Web Elements
        Parameters:
            leadersWebElements: List of web elements to obtain the map collection of names and concurrences
    */
    private static Map<String, Long> getLeadersPerDayMap(List<WebElement> leadersWebElements) {
        String[] leaders = new String[leadersWebElements.size()];
        for (int i=0; i<leadersWebElements.size(); i++)
            leaders[i]=(leadersWebElements.get(i).getText());
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
