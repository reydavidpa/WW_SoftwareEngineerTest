Feature: WW_SoftwareEngineerTest

  Scenario: People conducting meetings on zip code 10011
    Given I open the browser
    When I Navigate to https://www.weightwatchers.com/us/
    Then I verify loaded page title matches “WW (Weight Watchers): Weight Loss & Wellness Help”
    When On the right corner of the page, click on “Find a Studio”
    Then Verify loaded page title contains “Find a Studio & Meeting Near You | WW USA”
    When In the search field, search for studios for zip code: 10011
    Then Print the title of the first result and the distance
    And Click on the first search result and you should see names of the person conducting the meeting on the scheduled time right under time for each day.
