import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quesiton2_stepDefinition {
    WebDriver driver = null;

    @Given("^I open the browser$")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver",".\\src\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @When("^I Navigate to https://www\\.weightwatchers\\.com/us/$")
    public void i_Navigate_to_https_www_weightwatchers_com_us() throws Throwable {

    }

    @Then("^I verify loaded page title matches “WW \\(Weight Watchers\\): Weight Loss & Wellness Help”$")
    public void i_verify_loaded_page_title_matches_WW_Weight_Watchers_Weight_Loss_Wellness_Help() throws Throwable {
    }

    @When("^On the right corner of the page, click on “Find a Studio”$")
    public void on_the_right_corner_of_the_page_click_on_Find_a_Studio() throws Throwable {
    }

    @Then("^Verify loaded page title contains \"([^\"]*)\"$")
    public void verify_loaded_page_title_contains(String arg1) throws Throwable {
    }

    @When("^In the search field, search for studios for zip code: (\\d+)$")
    public void in_the_search_field_search_for_studios_for_zip_code(int arg1) throws Throwable {
    }

    @Then("^Print the title of the first result and the distance$")
    public void print_the_title_of_the_first_result_and_the_distance() throws Throwable {
    }

    @Then("^Click on the first search result and you should see names of the person conducting the meeting on the scheduled time right under time for each day\\.$")
    public void click_on_the_first_search_result_and_you_should_see_names_of_the_person_conducting_the_meeting_on_the_scheduled_time_right_under_time_for_each_day() throws Throwable {
    }

    @After
    public void after() {
        driver.close();
    }
}