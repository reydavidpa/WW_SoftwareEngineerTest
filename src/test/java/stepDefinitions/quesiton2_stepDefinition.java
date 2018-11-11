package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.meetings;
import pageObjects.homepageObjects;
import pageObjects.meetingSearchObjects;
import pageObjects.meetingSearchResultsObjects;
import setUp.driverManager;
import static org.junit.Assert.assertEquals;

public class quesiton2_stepDefinition {
    meetingSearchResultsObjects meetingSearchResultsObjects;

    @Given("^I open the browser$")
    public void openBrowser() {
        System.out.println("______________________________ QUESTION 2 ______________________________");

        driverManager.initialize();
    }

    @When("^I Navigate to (.*)$")
    public void i_Navigate_to_url(String url) throws Throwable {
        //Open url
        driverManager.driver.get(url);
    }

    @Then("^I verify loaded page title matches “(.*)”$")
    public void i_verify_loaded_page_title_matches(String expectedPageTitle) throws Throwable {
        //Assert page title of loaded page
        assertEquals(expectedPageTitle, driverManager.driver.getTitle());
    }

    @When("^On the right corner of the page, click on “Find a Studio”$")
    public void on_the_right_corner_of_the_page_click_on_Find_a_Studio() throws Throwable {
        //Click a button on the homepage
        new homepageObjects().findAStudioButton.click();
    }

    @Then("^Verify loaded page title contains “(.*)”$")
    public void verify_loaded_page_title_contains(String expectedPageTitle) throws Throwable {
        //Assert page title of loaded page
        assertEquals(expectedPageTitle, driverManager.driver.getTitle());
    }

    @When("^In the search field, search for studios for zip code: (\\d+)$")
    public void in_the_search_field_search_for_studios_for_zip_code(int zipcode) throws Throwable {
        meetingSearchObjects meetingSearchObjects = new meetingSearchObjects();

        //Type 10011 in the search field
        meetingSearchObjects.meetingSearch.sendKeys(Integer.toString(zipcode));

        //Click the search button
        meetingSearchObjects.meetingSearchButton.click();
    }

    @Then("^Print the title of the first result and the distance$")
    public void print_the_title_of_the_first_result_and_the_distance() throws Throwable {
        meetingSearchResultsObjects = new meetingSearchResultsObjects();

        //Printing out first result's title and distance
        System.out.println("\n--- FIRST RESULT - CLOSEST LOCATION FOR ZIP CODE 10011 ---");
        System.out.println("TITLE: " + meetingSearchResultsObjects.titles.get(0).getText());
        System.out.println("DISTANCE: " + meetingSearchResultsObjects.distances.get(0).getText() + "\n");

    }

    @Then("^Click on the first search result and you should see names of the person conducting the meeting on the scheduled time right under time for each day\\.$")
    public void click_on_the_first_search_result_and_you_should_see_names_of_the_person_conducting_the_meeting_on_the_scheduled_time_right_under_time_for_each_day() throws Throwable {
        meetingSearchResultsObjects.titles.get(0).click();

        System.out.println("--- DAILY MEETINGS GROUP BY CONDUCTING PERSON = NUMBER OF TIMES PER DAY ---");

        //Print out schedule summary for Sunday with specific format
        System.out.print("SUNDAY ");
        meetings.getScheduleSummary("Sun");

        //Print out schedule summary for Monday with specific format
        System.out.print("MONDAY ");
        meetings.getScheduleSummary("Mon");

        //Print out schedule summary for Tuesday with specific format
        System.out.print("TUESDAY ");
        meetings.getScheduleSummary("Tue");

        //Print out schedule summary for Wednesday with specific format
        System.out.print("WEDNESDAY ");
        meetings.getScheduleSummary("Wed");

        //Print out schedule summary for Thursday with specific format
        System.out.print("THURSDAY ");
        meetings.getScheduleSummary("Thu");

        //Print out schedule summary for Friday with specific format
        System.out.print("FRIDAY ");
        meetings.getScheduleSummary("Fri");

        //Print out schedule summary for Saturday with specific format
        System.out.print("SATURDAY ");
        meetings.getScheduleSummary("Sat");
    }
}