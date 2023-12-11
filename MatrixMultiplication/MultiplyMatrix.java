//PRACTICE 20: A PROGRAM FOR MATRIX MULTIPLICATION
package MatrixMultiplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class MultiplyMatrix {
    public static void main(String args[]) throws NumberFormatException, IOException {
        //create new buffer reader for reading user input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //create new nested array (matrices) 4x4
        int num1[][] = new int[4][4];
        int num2[][] = new int[4][4];
        int num3[][] = new int[4][4];
        //declare variables for use of nested looping
        int x, y, z;
        //ask user for matrix input values
        System.out.println("Please, enter First Matrix");
        //read inputs and loop through establish inputs creating/storing values
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        //loop read num1[][] and output result
        for  ( x = 0; x < num1.length; x++) {
            for  (y = 0; y < 4; y++) {
                System.out.print(" " + num1[x][y]);
            }
            System.out.println();
        }
        //ask user for next matrix values
        System.out.println("Please, enter Second Matrix");
        //loop for reading and creating/storing user input values
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        //loop for reading num2[][] and outputting result to user
        for (x = 0; x < num2.length; x++) {
            for (y = 0; y < 4; y++) {
                System.out.print(" " + num2[x][y]);
            }
            System.out.println();
        }
        //loop for creating num3[][] through multiplication
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                num3[x][y] = 0;
                for (z = 0; z < 4; z++) {
                    num3[x][y] = num3[x][y] + (num1[x][z] * num2[z][y]);
                }
            }
        }
        //output result statement to user
        System.out.println("The result of your Multiplication is: ");
        //loop reading num3[][] and giving output to user
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                System.out.print(" " + num3[x][y]);
            }
            System.out.println();
        }
    }
}
