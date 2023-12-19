package AscendingArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //declare instance variables and new array
        int num1 = 0, num2[] = new int[7], x, y;
        //create new buffer reader for user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //request array values from user
        System.out.println("\n Please enter only seven array elements: ");
        //for loop to create array with user values
        for ( x = 0; x < 7; x++) {
            num2[x] = Integer.parseInt(br.readLine());
        }
        //for loop to read array, compare elements and organize in ascending order
        for (x = 0; x < num2.length; x++) {
            for (y = x + 1; y < num2.length; y++) {
                if (num2[x] > num2[y]) {
                    num1 = num2[x];
                    num2[x] = num2[y];
                    num2[y] = num1;
                }
            }
        }
        //read and print result
        System.out.println("The result of this array in ascending order is: ");
        for  (x = 0; x < 7; x++) {
            System.out.print(" " + num2[x]);
        }
    }
}
