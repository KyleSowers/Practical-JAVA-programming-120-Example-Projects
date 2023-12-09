//PRACTICE 18: A PROGRAM FOR MATRIX ADDITION
package MatrixAddition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //add a new buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //add instance nested arrays 2x2
        int num1[][] = new int[2][2];
        int num2[][] = new int[2][2];
        int num3[][] = new int[2][2];
        //declare instance variables for future nested loops
        int x, y;
        //output request for values to user
        System.out.println("Please insert 1st integer values for matrix addition: ");
        //loop through rows/columns, added user values to creat num1 matrix
        for(x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        //loop throguh rows/columns to print out matrix
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print(" " + num1[x][y]);
            }
            System.out.println();
        }
        //request user values for num2 matrix
        System.out.println("Please insert 2nd integer values for matrix addition: ");
        //loop by row/columns to store values and create matrix for num2
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        //looping to print out num2 matrix
        for (x = 0; x < num2.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print(" " + num2[x][y]);
            }
            System.out.println();
        }
        //nested loop to created num3 matrix from adding num1 and num2 matrices
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                num3[x][y] = num1[x][y] + num2[x][y];
            }
        }
        //initial return statment to console
        System.out.println("The sum of the matrix is: ");
        //nested loop for printing out mun3 (sum of num1 and 2) for printing
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                System.out.print(" " + num3[x][y]);
            }
            System.out.println();
        }
    }
}
