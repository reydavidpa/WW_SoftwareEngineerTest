package stepDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import static helpers.numbers.randomIntArray;

public class quesiton3_stepDefinition {
    private Integer[] randomNumbersArray;

    @When("^I Generate (\\d+) random numbers$")
    public void i_Generate_random_numbers(int arraySize) throws Throwable {
        System.out.println("______________________________ QUESTION 3 ______________________________");

        //Generate 500 random numbers
        randomNumbersArray = randomIntArray(arraySize);

        //Print out array
        System.out.print("\n500-RANDOM-NUMBER ARRAY: [ ");
        for (int i=0; i<randomNumbersArray.length;i++)
            System.out.print(randomNumbersArray[i]+" ");
        System.out.print("]");
    }

    @Then("^Print the nth smallest number$")
    public void print_the_nth_smallest_number() throws Throwable {
        //Convert integer array to list of array
        List<Integer> randomNumbersList= (List<Integer>) Arrays.asList(randomNumbersArray);

        //Get smallest number
        Integer smallestNumber = Collections.min(randomNumbersList);

        //Print out smallest number and its index
        System.out.println("\n\nSMALLEST NUMBER = " + smallestNumber);
        System.out.println("INDEX = " + randomNumbersList.indexOf(smallestNumber)+"\n");
   }
}