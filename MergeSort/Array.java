//PRACTICE 48: A PROGRAM TO SORT A MERGED ARRAY
package MergeSort;

import java.util.Scanner;

public class Array {
    //create method for sorting with array and a lower and upper value
    public static void sort(int[] x, int lower, int upper) {
        //declare attribute
        int num1 = upper - lower;
        //catch number less than one
        if (num1 <= 1) {
            return;
        }
        //divide the array in two for sorting
        int num2 = lower + num1/2;
        //sort array values
        sort(x, lower, num2);
        sort(x, num2, upper);
        //declare a new array to conjoin results as temporary storage
        int[] num3 = new int[num1];
        int y = lower, z = num2;
        for (int w = 0; w < num1; w++) {
            if (y == num2) {
                num3[w] = x[z++];
            } else if (z == upper) {
                num3[w] = x[y++];
            } else if (x[z] < x[y]) {
                num3[w] = x[z++];
            } else {
                num3[w] = x[y++];
            }
        }
        //read temporary array and restore values into original array
        for  (int w = 0; w < num1; w++) {
            x[lower + w] = num3[w];
        }
    }

    public static void main(String args[]) {
        //create new scanner for class
        Scanner sc = new Scanner(System.in);
        //declare new attributes
        int num1, y;
        //request array element length
        System.out.println("Please choose number of array elements: ");
        //store input into attribute
        num1 = sc.nextInt();
        //create new array with length value associated
        int xyz[] = new int[num1];
        //request values for elements of new array
        System.out.println("Please insert " + num1 + " numbers of elements: ");
        //read inputs and add to array
        for (y = 0; y < num1; y++) {
            xyz[y] = sc.nextInt();
        }
        //call sort() to sort array values ascending
        sort(xyz, 0, num1);
        //print results
        System.out.println("Result of array after sorting: ");
        for (y = 0; y < num1; y++) {
            System.out.print(xyz[y] + " ");
        }
        System.out.println();
    }
}
