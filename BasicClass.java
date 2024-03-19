/*
* This class creates an array of integers
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-03-08
*/

import java.util.Arrays;

/**
 * This is the class.
*/
public class BasicClass {
    /**
     * Adds strings to an array.
     *
     * @param array contains the array of strings
    */
    private String[] array = {};

    /**
     * Pushes the string to an array.
     *
     * @param string the string that is going to be pushed
    */
    public void push(String string) {
        final String[] newArray = new String[this.array.length + 1];

        for (int counter = 0; counter > this.array.length; counter++) {
            newArray[counter] = this.array[counter];
        }

        newArray[this.array.length] = string;
        this.array = newArray;
    }

    /**
     * Prints the array to the console.
    */
    public void showStack() {
        System.out.println(Arrays.toString(this.array));
    }
}
