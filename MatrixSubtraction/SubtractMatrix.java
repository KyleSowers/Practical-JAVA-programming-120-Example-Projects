//PRACTICE 19: A PROGRAM FOR MATRIX SUBTRACTION
package MatrixSubtraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubtractMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //create new buffer reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //create new matrices 3x3
        int num1[][] = new int[3][3];
        int num2[][] = new int[3][3];
        int num3[][] = new int[3][3];
        //declare instnce variables for future loops
        int x, y;
        //request users input for 1st matrix (num1[][]) values
        System.out.println("Please insert first 9 matrix values (3 rows, each with 3 integer values)");
        //loop through row/columns adding/creating array with input values
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        //read/loop rows/columns to print matrix
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 3; y++) {
                //print row
                System.out.print(" " + num1[x][y]);
            }
            //separates printing of rows
            System.out.println();
        }
        //ask user for values of 2nd matrix
        System.out.println("Please insert second 9 matrix values (3 rows, each with 3 integer values)");
        //create matrix num2[][]
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        //read and print matrix num2[][]
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(" " + num2[x][y]);
            }
            System.out.println();
        }
        //loop, num1 - num2 = num3 (stored subtract values)
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                num3[x][y] = num1[x][y] - num2[x][y];
            }
        }
        //preceding print statement for num3[][], subtracted matrix values in new matrix
        System.out.println("Result of Subtraction is: ");
        //loop and print the result (num3[][]) matrix
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.print(" " + num3[x][y]);
            }
            System.out.println();
        }
    }
}
