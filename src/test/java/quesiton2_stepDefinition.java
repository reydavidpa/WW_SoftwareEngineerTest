import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.homepageObjects;
import pageObjects.meetingSearchObjects;
import pageObjects.meetingSearchResultsObjects;
import setUp.driverManager;
import static org.junit.Assert.assertEquals;

public class quesiton2_stepDefinition {
    meetingSearchResultsObjects meetingSearchResultsObjects;

    @Given("^I open the browser$")
    public void openBrowser() {
        driverManager.initialize();
    }

    @When("^I Navigate to (.*)$")
    public void i_Navigate_to_url(String url) throws Throwable {
        driverManager.driver.get(url);
    }

    @Then("^I verify loaded page title matches “(.*)”$")
    public void i_verify_loaded_page_title_matches_page_title(String expectedPageTitle) throws Throwable {
        assertEquals(expectedPageTitle,driverManager.driver.getTitle());
    }

    @When("^On the right corner of the page, click on “Find a Studio”$")
    public void on_the_right_corner_of_the_page_click_on_Find_a_Studio() throws Throwable {
        new homepageObjects().findAStudioButton.click();
    }

    @Then("^Verify loaded page title contains “(.*)”$")
    public void verify_loaded_page_title_contains(String expectedPageTitle) throws Throwable {
        assertEquals(expectedPageTitle,driverManager.driver.getTitle());
    }

    @When("^In the search field, search for studios for zip code: (\\d+)$")
    public void in_the_search_field_search_for_studios_for_zip_code(int zipcode) throws Throwable {
        new meetingSearchObjects().meetingSearch.sendKeys(Integer.toString(zipcode));
    }

    @Then("^Print the title of the first result and the distance$")
    public void print_the_title_of_the_first_result_and_the_distance() throws Throwable {
        meetingSearchResultsObjects = new meetingSearchResultsObjects();
        System.out.println("FIRST RESULT");
        System.out.println("TITLE: "+meetingSearchResultsObjects.titles.get(0));
        System.out.println("DISTANCE: "+meetingSearchResultsObjects.distances.get(0));
    }

    @Then("^Click on the first search result and you should see names of the person conducting the meeting on the scheduled time right under time for each day\\.$")
    public void click_on_the_first_search_result_and_you_should_see_names_of_the_person_conducting_the_meeting_on_the_scheduled_time_right_under_time_for_each_day() throws Throwable {
        meetingSearchResultsObjects.titles.get(0).click();
        System.out.println("test");
    }


}