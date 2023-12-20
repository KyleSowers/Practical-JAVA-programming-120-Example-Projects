package SearchArray;

import java.util.Arrays;

public class Array {
    public static void main(String args[]) {
        //declare new array of integers
        int x[] = {2, 6, 7, 9, 1, 8, 4};
        //request index through binary search of value 1
        int index = Arrays.binarySearch(x, 1);
        //return result of search value to user
        System.out.println("This element is found at index: " + index);
    }
}
