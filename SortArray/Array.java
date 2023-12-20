package SortArray;

import java.util.Arrays;

public class Array {
    public static void main(String args[]) {
        //declare the new array with values
        int x[] = {3, 4, 8, 9, -4, 0, 5, 7, -9};
        //sort array values
        Arrays.sort(x);
        //print array with method from below
        printArray("The sorted Array is: ", x);
    }

    //create the print method for the array
    private static void printArray(String string, int[] x) {
        //loop to read through the array length
        for  (int y = 0; y < x.length; y++) {
            //conditional for comma inserts
            if (y != 0) {
                System.out.print(",");
            }
            System.out.print(x[y]);
        }
        System.out.println();
    }
}
