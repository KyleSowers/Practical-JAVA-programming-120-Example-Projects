//PRACTICE 46: A PROGRAM TO FIND THE MIN AND MAX ELEMENT IN ARRAY
package MinMax;

import java.util.Arrays;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        //declared new integer array with values
        Integer[] num1 = {7,3,5,2,8};
        //use inport collections library to use method to find min and max values and store in declared attributes
        int min = (int)Collections.min(Arrays.asList(num1));
        int max = (int)Collections.max(Arrays.asList(num1));
        //print results
        System.out.println("Result of Minimum element is: " + min);
        System.out.println("Result of Maximum element is: " + max);
    }
}
