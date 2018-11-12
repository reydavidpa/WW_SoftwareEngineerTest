package helpers;

import java.util.Random;

/*
    Helper class to process numbers
 */

public class numbers {
    /*
         Method to create an array of random numbers
         Parameters:
              size: number of numbers generated
         Note: Numbers aren't unique
    */
    public static Integer[] randomIntArray(int size) {
        Random random = new Random();
        Integer array[] = new Integer[size];

        int i = 0;

        while (i < size) {
            int randomInteger = random.nextInt(size) + 1;
                array[i++] = randomInteger;
        }
        return array;
    }
}
