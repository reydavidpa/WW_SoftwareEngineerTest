package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import helpers.files;
import static helpers.files.doesFileExist;

public class quesiton1_stepDefinition {
    private String filePath;

    @Given("^a path to the file to be (.*)$")
    public void a_path_to_the_file_to_be(String path) throws Throwable {
        //Assign path to a global variable for further processing
        filePath = path;
    }

    @Then("^Create a method called doesFileExist\\(String path\\) which takes the path of the file and tells the user if the file exists at that path or not\\.$")
    public void create_a_method_called_doesFileExist_String_path_which_takes_the_path_of_the_file_and_tells_the_user_if_the_file_exists_at_that_path_or_not() throws Throwable {
        //Print out weather file exists at path or not
        if (doesFileExist(filePath))
            System.out.println("FILE FOUND AT "+filePath);
        else
            System.out.println("\nFILE NOT FOUND AT "+filePath);
    }

    @Then("^Read each word and its possible meanings and print them out\\.$")
    public void read_each_word_and_its_possible_meanings_and_print_them_out() throws Throwable {
        //Print out dictionary found in a file with specific format
        files.printOutDictionary(filePath);
    }
}